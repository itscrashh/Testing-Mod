package net.ilyas.testingmod.block.custom;

import net.ilyas.testingmod.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class AirAltarBlock extends Block {
    public AirAltarBlock(Settings settings) {
        super(settings);
    }


    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
         if (!world.isClient) {
             if (entity instanceof ItemEntity itemEntity) {
                 if (itemEntity.getStack().getItem() == ModItems.RUNE_ESSENCE) {
                   itemEntity.setStack(new ItemStack(ModItems.AIR_RUNE, itemEntity.getStack().getCount()));
             }
          }
         }
        super.onSteppedOn(world, pos, state, entity);
    }
}


