package net.ilyas.testingmod.item.custom;


import net.ilyas.testingmod.TestingMod;
import net.ilyas.testingmod.item.ModItems;
import net.ilyas.testingmod.util.ModTags;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.SmallFireballEntity;
import net.minecraft.entity.projectile.WindChargeEntity;
import net.minecraft.entity.projectile.thrown.EggEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

import java.util.function.Predicate;

public class FireStaffItem extends Item {
    Predicate<ItemStack> FIRE_RUNE_STACK = itemStack -> itemStack.isIn(ModTags.Items.FIRE_RUNE_TAG);



    @Override
    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = new ItemStack(ModItems.FIRE_RUNE);
        if (world instanceof ServerWorld serverWorld) {
            if (user.getInventory().contains(FIRE_RUNE_STACK)) {

                 FireballEntity fireball = new FireballEntity(world, user, user.getEyePos(),  2);
                 fireball.setPos(user.getEyePos().getX(), user.getEyeY(), user.getEyePos().getZ());


                ProjectileEntity.spawnWithVelocity(
                        (world2, shooter, stack) -> fireball,
                        serverWorld,
                        itemStack,
                        user,
                        0.0F,
                        1,
                        0F
                );
                user.getInventory().remove(FIRE_RUNE_STACK, 1, user.getInventory());
            }
        }



        return ActionResult.SUCCESS;
    }

    public FireStaffItem(Settings settings) {
        super(settings);
    }
}
