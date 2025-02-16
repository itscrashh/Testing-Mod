package net.ilyas.testingmod.item.custom;

import net.ilyas.testingmod.component.ModDataComponentTypes;
import net.ilyas.testingmod.item.ModItems;
import net.ilyas.testingmod.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class HammerItem extends MiningToolItem {
    public HammerItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, BlockTags.PICKAXE_MINEABLE, attackDamage, attackSpeed, settings);
    }




    public static List<BlockPos> getBlocksToBeDestroyed(int range, BlockPos initalBlockPos, ServerPlayerEntity player) {
        Predicate<ItemStack> FIRE_RUNE_STACK = itemStack -> itemStack.isIn(ModTags.Items.FIRE_RUNE_TAG);

        List<BlockPos> positions = new ArrayList<>();
        HitResult hit = player.raycast(20, 0, false);
        if (player.getInventory().contains(FIRE_RUNE_STACK)) {
            if (hit.getType() == HitResult.Type.BLOCK) {
                BlockHitResult blockHit = (BlockHitResult) hit;

                if (blockHit.getSide() == Direction.DOWN || blockHit.getSide() == Direction.UP) {
                    for (int x = -range; x <= range; x++) {
                        for (int y = -range; y <= range; y++) {
                            positions.add(new BlockPos(initalBlockPos.getX() + x, initalBlockPos.getY(), initalBlockPos.getZ() + y));

                        }
                    }
                }

                if (blockHit.getSide() == Direction.NORTH || blockHit.getSide() == Direction.SOUTH) {
                    for (int x = -range; x <= range; x++) {
                        for (int y = -range; y <= range; y++) {
                            positions.add(new BlockPos(initalBlockPos.getX() + x, initalBlockPos.getY() + y, initalBlockPos.getZ()));

                        }
                    }
                }

                if (blockHit.getSide() == Direction.EAST || blockHit.getSide() == Direction.WEST) {
                    for (int x = -range; x <= range; x++) {
                        for (int y = -range; y <= range; y++) {
                            positions.add(new BlockPos(initalBlockPos.getX(), initalBlockPos.getY() + y, initalBlockPos.getZ() + x));

                        }
                    }
                }
                player.getInventory().remove(FIRE_RUNE_STACK, 1, player.getInventory());
            }

        }

        return positions;
    }


    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        if(Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip.testingmod.hammer_item.shift_down"));
        } else {
            tooltip.add(Text.translatable("tooltip.testingmod.hammer_item.tooltip"));
        }

        super.appendTooltip(stack, context, tooltip, type);
    }
}
