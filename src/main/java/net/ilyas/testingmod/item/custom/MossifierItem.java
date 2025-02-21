package net.ilyas.testingmod.item.custom;

import net.ilyas.testingmod.component.ModDataComponentTypes;
import net.ilyas.testingmod.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.ItemModels;
import net.minecraft.client.data.Models;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.render.item.model.ItemModel;
import net.minecraft.client.render.item.property.bool.BooleanProperty;
import net.minecraft.client.render.item.property.bool.DamagedProperty;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

import java.util.List;
import java.util.Map;

public class MossifierItem extends Item {


    private static final Map<Block, Block> MOSSIFIER_MAP =
            Map.of(
                    Blocks.COBBLESTONE, Blocks.MOSSY_COBBLESTONE,
                    Blocks.GRASS_BLOCK, Blocks.MOSS_BLOCK,
                    Blocks.STONE_BRICKS, Blocks.MOSSY_STONE_BRICKS
            );

    public MossifierItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        Block clickedBlock = world.getBlockState(context.getBlockPos()).getBlock();
        ItemStack stack = new ItemStack(ModItems.MOSSIFIER);

        if(MOSSIFIER_MAP.containsKey(clickedBlock)) {
            if(!world.isClient()) {
                world.setBlockState(context.getBlockPos(), MOSSIFIER_MAP.get(clickedBlock).getDefaultState());
                context.getStack().damage(1, ((ServerWorld) world), ((ServerPlayerEntity) context.getPlayer()),
                        item -> context.getPlayer().sendEquipmentBreakStatus(item, EquipmentSlot.MAINHAND));

                world.playSound(null, context.getBlockPos(), SoundEvents.BLOCK_GRINDSTONE_USE, SoundCategory.BLOCKS);

                context.getStack().set(ModDataComponentTypes.COORDINATES, context.getBlockPos());



            }
        }

        return ActionResult.SUCCESS;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        if(Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip.testingmod.mossifier_item.shift_down"));
            if(stack.get(ModDataComponentTypes.COORDINATES) != null) {
                tooltip.add(Text.literal("\nLast Block Changed at " + stack.get(ModDataComponentTypes.COORDINATES)));
            }
        } else {
            tooltip.add(Text.translatable("tooltip.testingmod.mossifier_item.tooltip"));
        }

        super.appendTooltip(stack, context, tooltip, type);
    }
}
