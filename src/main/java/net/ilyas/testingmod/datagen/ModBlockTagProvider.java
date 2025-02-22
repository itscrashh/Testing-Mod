package net.ilyas.testingmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.ilyas.testingmod.block.ModBlocks;
import net.ilyas.testingmod.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.RUNE_BLOCK)
                .add(ModBlocks.ALTAR_BLOCK)
                .add(ModBlocks.FIRE_ALTAR_BLOCK)
                .add(ModBlocks.AIR_ALTAR_BLOCK)
                .add(ModBlocks.MAGIC_BLOCK)

                .add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE)
                .add(ModBlocks.PINK_GARNET_BLOCK)
                .add(ModBlocks.RAW_PINK_GARNET_BLOCK)
                .add(ModBlocks.PINK_GARNET_ORE)

                .add(ModBlocks.PINK_GARNET_FENCE_GATE)
                .add(ModBlocks.PINK_GARNET_FENCE)
                .add(ModBlocks.PINK_GARNET_WALL)
                .add(ModBlocks.PINK_GARNET_SLAB)
                .add(ModBlocks.PINK_GARNET_DOOR)
                .add(ModBlocks.PINK_GARNET_PRESSURE_PLATE)
                .add(ModBlocks.PINK_GARNET_BUTTON)
                .add(ModBlocks.PINK_GARNET_SLAB)
                .add(ModBlocks.PINK_GARNET_STAIRS);



        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.RUNE_BLOCK);
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL);
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.PINK_GARNET_ORE)
                .add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE)
                .add(ModBlocks.PINK_GARNET_BLOCK)
                .add(ModBlocks.RAW_PINK_GARNET_BLOCK);
        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_PINK_GARNET_TOOL)
                .add(ModBlocks.ALTAR_BLOCK)
                .add(Blocks.NETHERITE_BLOCK)
                .add(Blocks.ANCIENT_DEBRIS);
        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(Blocks.DIAMOND_BLOCK);
        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_RUBY_TOOL);


        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.PINK_GARNET_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.PINK_GARNET_FENCE);
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.PINK_GARNET_WALL);


        getOrCreateTagBuilder(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
                .addTag(ModTags.Blocks.NEEDS_PINK_GARNET_TOOL)
                .addTag(ModTags.Blocks.NEEDS_NETHERITE_TOOL)
                .addTag(ModTags.Blocks.NEEDS_RUBY_TOOL);
        getOrCreateTagBuilder(BlockTags.INCORRECT_FOR_STONE_TOOL)
                .addTag(ModTags.Blocks.NEEDS_PINK_GARNET_TOOL)
                .addTag(ModTags.Blocks.NEEDS_NETHERITE_TOOL)
                .addTag(ModTags.Blocks.NEEDS_RUBY_TOOL);
        getOrCreateTagBuilder(BlockTags.INCORRECT_FOR_GOLD_TOOL)
                .addTag(ModTags.Blocks.NEEDS_PINK_GARNET_TOOL)
                .addTag(ModTags.Blocks.NEEDS_NETHERITE_TOOL)
                .addTag(ModTags.Blocks.NEEDS_RUBY_TOOL);
        getOrCreateTagBuilder(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .addTag(ModTags.Blocks.NEEDS_PINK_GARNET_TOOL)
                .addTag(ModTags.Blocks.NEEDS_NETHERITE_TOOL)
                .addTag(ModTags.Blocks.NEEDS_RUBY_TOOL);
        getOrCreateTagBuilder(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .addTag(ModTags.Blocks.NEEDS_PINK_GARNET_TOOL)
                .addTag(ModTags.Blocks.NEEDS_NETHERITE_TOOL)
                .addTag(ModTags.Blocks.NEEDS_RUBY_TOOL);
        getOrCreateTagBuilder(ModTags.Blocks.INCORRECT_FOR_PINK_GARNET_TOOL)
                .addTag(ModTags.Blocks.NEEDS_NETHERITE_TOOL)
                .addTag(ModTags.Blocks.NEEDS_RUBY_TOOL);
        getOrCreateTagBuilder(BlockTags.INCORRECT_FOR_NETHERITE_TOOL)
                .addTag(ModTags.Blocks.NEEDS_RUBY_TOOL);
        getOrCreateTagBuilder(ModTags.Blocks.INCORRECT_FOR_RUBY_TOOL);



    }

}
