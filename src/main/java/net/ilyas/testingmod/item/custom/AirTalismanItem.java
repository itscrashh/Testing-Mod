package net.ilyas.testingmod.item.custom;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import net.ilyas.testingmod.block.ModBlocks;
import net.ilyas.testingmod.component.ModDataComponentTypes;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.List;
import java.util.Map;
import java.util.Properties;

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
        int x = context.getBlockPos().getX();
        int y = context.getBlockPos().getY();
        int z = context.getBlockPos().getZ();

        if(AIR_TALISMAN_MAP.containsKey(clickedBlock)) {
            if(!world.isClient()) {
                world.setBlockState(context.getBlockPos(), AIR_TALISMAN_MAP.get(clickedBlock).getDefaultState());

                world.playSound(null, context.getBlockPos(), SoundEvents.ENTITY_LIGHTNING_BOLT_IMPACT, SoundCategory.BLOCKS);

                LightningEntity lightningEntity = new LightningEntity(EntityType.LIGHTNING_BOLT, world);
                lightningEntity.setPos(x, y, z);
                lightningEntity.setCosmetic(true);
                world.spawnEntity(lightningEntity);

                return ActionResult.SUCCESS;
            }
        }

        return ActionResult.FAIL;
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

