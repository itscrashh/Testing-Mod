package net.ilyas.testingmod.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

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

        if(MOSSIFIER_MAP.containsKey(clickedBlock)) {
            if(!world.isClient()) {
                world.setBlockState(context.getBlockPos(), MOSSIFIER_MAP.get(clickedBlock).getDefaultState());
                context.getStack().damage(1, ((ServerWorld) world),  ((ServerPlayerEntity) context.getPlayer()),
                        item -> context.getPlayer().sendEquipmentBreakStatus(item, EquipmentSlot.MAINHAND));

                world.playSound(null, context.getBlockPos(), SoundEvents.BLOCK_GRINDSTONE_USE, SoundCategory.BLOCKS);


            }
        }

        return ActionResult.SUCCESS;
    }
}
