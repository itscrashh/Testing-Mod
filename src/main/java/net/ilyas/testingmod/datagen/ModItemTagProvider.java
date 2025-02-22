package net.ilyas.testingmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.ilyas.testingmod.item.ModItems;
import net.ilyas.testingmod.util.ModTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider{
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(ModItems.RAW_PINK_GARNET);

        getOrCreateTagBuilder(ModTags.Items.PINK_GARNET_REPAIR)
                .add(ModItems.PINK_GARNET);

        getOrCreateTagBuilder(ModTags.Items.RUBY_REPAIR)
                .add(ModItems.RUBY);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.PINK_GARNET_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.PINK_GARNET_PICKAXE)
                .add(ModItems.RUBY_PICKAXE)
               .add(ModItems.PINK_GARNET_HAMMER);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.PINK_GARNET_AXE);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.PINK_GARNET_HOE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.PINK_GARNET_SHOVEL);

        getOrCreateTagBuilder(ModTags.Items.FIRE_RUNE_TAG)
                .add(ModItems.FIRE_RUNE);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.PINK_GARNET_HELMET)
                .add(ModItems.PINK_GARNET_CHESTPLATE)
                .add(ModItems.PINK_GARNET_LEGGINGS)
                .add(ModItems.PINK_GARNET_BOOTS);

        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR_ENCHANTABLE)
                .add(ModItems.PINK_GARNET_BOOTS);
        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR_ENCHANTABLE)
                .add(ModItems.PINK_GARNET_CHESTPLATE);
        getOrCreateTagBuilder(ItemTags.LEG_ARMOR_ENCHANTABLE)
                .add(ModItems.PINK_GARNET_LEGGINGS);
        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR_ENCHANTABLE)
                .add(ModItems.PINK_GARNET_HELMET);



        getOrCreateTagBuilder(ItemTags.TRIM_MATERIALS)
                .add(ModItems.PINK_GARNET);

    }
}
