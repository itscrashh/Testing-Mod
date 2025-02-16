package net.ilyas.testingmod.block.custom;

import net.ilyas.testingmod.item.ModItems;
import net.ilyas.testingmod.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class FireAltarBlock extends Block {
    public FireAltarBlock(Settings settings) {
        super(settings);
    }


    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if(!world.isClient) {
            if (entity instanceof ItemEntity itemEntity) {
                if (itemEntity.getStack().getItem() == ModItems.RUNE_ESSENCE) {
                    itemEntity.setStack(new ItemStack(ModItems.FIRE_RUNE, itemEntity.getStack().getCount()));
                }
            }
        }
        super.onSteppedOn(world, pos, state, entity);
    }
}


