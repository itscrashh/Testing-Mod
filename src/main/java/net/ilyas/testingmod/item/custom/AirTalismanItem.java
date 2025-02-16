package net.ilyas.testingmod.item.custom;

import net.ilyas.testingmod.block.ModBlocks;
import net.ilyas.testingmod.component.ModDataComponentTypes;
import net.minecraft.block.Block;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

import java.util.List;
import java.util.Map;

public class AirTalismanItem extends Item {

    private static final Map<Block, Block> AIR_TALISMAN_MAP =
            Map.of(
                    ModBlocks.ALTAR_BLOCK, ModBlocks.AIR_ALTAR_BLOCK,
                    ModBlocks.FIRE_ALTAR_BLOCK, ModBlocks.AIR_ALTAR_BLOCK
            );

    public AirTalismanItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        Block clickedBlock = world.getBlockState(context.getBlockPos()).getBlock();

        if(AIR_TALISMAN_MAP.containsKey(clickedBlock)) {
            if(!world.isClient()) {
                world.setBlockState(context.getBlockPos(), AIR_TALISMAN_MAP.get(clickedBlock).getDefaultState());

                world.playSound(null, context.getBlockPos(), SoundEvents.ENTITY_LIGHTNING_BOLT_IMPACT, SoundCategory.BLOCKS);


            }
        }

        return ActionResult.SUCCESS;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        if(Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip.testingmod.air_talisman.shift_down"));
        } else {
            tooltip.add(Text.translatable("tooltip.testingmod.air_talisman.tooltip"));
        }
        super.appendTooltip(stack, context, tooltip, type);
    }
}
