package net.ilyas.testingmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.ilyas.testingmod.TestingMod;
import net.ilyas.testingmod.block.ModBlocks;
import net.ilyas.testingmod.item.ModItems;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.data.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {

                List<ItemConvertible> PINK_GARNET_SMELTABLES = List.of(ModItems.RAW_PINK_GARNET, ModBlocks.PINK_GARNET_ORE, ModBlocks.PINK_GARNET_DEEPSLATE_ORE);

                offerSmelting(PINK_GARNET_SMELTABLES, RecipeCategory.MISC, ModItems.PINK_GARNET, 0.25f, 200, "pink_garnet");
                offerBlasting(PINK_GARNET_SMELTABLES, RecipeCategory.MISC, ModItems.PINK_GARNET, 0.25f, 100, "pink_garnet");

                offerReversibleCompactingRecipes(RecipeCategory.MISC, ModItems.PINK_GARNET, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_GARNET_BLOCK);

                offerReversibleCompactingRecipes(RecipeCategory.MISC, ModItems.RUNE_ESSENCE, RecipeCategory.MISC, ModBlocks.RUNE_BLOCK);

                createShaped(RecipeCategory.MISC, ModBlocks.RAW_PINK_GARNET_BLOCK)
                        .pattern("RRR")
                        .pattern("RRR")
                        .pattern("RRR")
                        .input('R', ModItems.RAW_PINK_GARNET)
                        .criterion(hasItem(ModItems.RAW_PINK_GARNET), conditionsFromItem(ModItems.RAW_PINK_GARNET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.ALTAR_BLOCK)
                        .pattern("WWW")
                        .pattern("RSR")
                        .pattern("RRR")
                        .input('R', ModBlocks.RUNE_BLOCK)
                        .input('W', ItemTags.PLANKS)
                        .input('S', ItemTags.WOODEN_SLABS)
                        .criterion(hasItem(ModItems.RUNE_ESSENCE), conditionsFromItem(ModItems.RUNE_ESSENCE))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModItems.RAW_PINK_GARNET, 9)
                        .input(ModBlocks.RAW_PINK_GARNET_BLOCK)
                        .criterion(hasItem(ModBlocks.RAW_PINK_GARNET_BLOCK), conditionsFromItem(ModBlocks.RAW_PINK_GARNET_BLOCK))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.MOSSIFIER)
                        .pattern("  E")
                        .pattern(" I ")
                        .pattern("I  ")
                        .input('E', Items.EMERALD)
                        .input('I', Items.IRON_INGOT)
                        .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.IRON_INGOT))
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(exporter);

                createDoorRecipe(ModBlocks.PINK_GARNET_DOOR, Ingredient.ofItem(ModItems.PINK_GARNET))
                        .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.PINK_GARNET_STAIRS, Ingredient.ofItem(ModItems.PINK_GARNET))
                        .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_GARNET_SLAB, Ingredient.ofItem(ModItems.PINK_GARNET))
                        .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                        .offerTo(exporter);
                createButtonRecipe(ModBlocks.PINK_GARNET_BUTTON, Ingredient.ofItem(ModItems.PINK_GARNET))
                        .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                        .offerTo(exporter);
                createTrapdoorRecipe(ModBlocks.PINK_GARNET_TRAPDOOR, Ingredient.ofItem(ModItems.PINK_GARNET))
                        .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                        .offerTo(exporter);
                createPressurePlateRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_GARNET_PRESSURE_PLATE, Ingredient.ofItem(ModItems.PINK_GARNET))
                        .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                        .offerTo(exporter);
                createFenceGateRecipe(ModBlocks.PINK_GARNET_FENCE_GATE, Ingredient.ofItem(ModItems.PINK_GARNET))
                        .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                        .offerTo(exporter);
                createFenceRecipe(ModBlocks.PINK_GARNET_FENCE, Ingredient.ofItem(ModItems.PINK_GARNET))
                        .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                        .offerTo(exporter);
                createTrapdoorRecipe(ModBlocks.PINK_GARNET_WALL, Ingredient.ofItem(ModItems.PINK_GARNET))
                        .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                        .offerTo(exporter);


                createShaped(RecipeCategory.TOOLS, ModItems.PINK_GARNET_PICKAXE)
                        .pattern("RRR")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('R', ModItems.PINK_GARNET)
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                        .offerTo(exporter);
                createShaped(RecipeCategory.TOOLS, ModItems.PINK_GARNET_SWORD)
                        .pattern(" R ")
                        .pattern(" R ")
                        .pattern(" S ")
                        .input('R', ModItems.PINK_GARNET)
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                        .offerTo(exporter);
                createShaped(RecipeCategory.TOOLS, ModItems.PINK_GARNET_AXE)
                        .pattern("RR ")
                        .pattern("RS ")
                        .pattern(" S ")
                        .input('R', ModItems.PINK_GARNET)
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                        .offerTo(exporter);
                createShaped(RecipeCategory.TOOLS, ModItems.PINK_GARNET_SHOVEL)
                        .pattern(" R ")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('R', ModItems.PINK_GARNET)
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                        .offerTo(exporter);
                createShaped(RecipeCategory.TOOLS, ModItems.PINK_GARNET_HOE)
                        .pattern("RR ")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('R', ModItems.PINK_GARNET)
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.PINK_GARNET_HELMET)
                        .pattern("RRR")
                        .pattern("R R")
                        .pattern("   ")
                        .input('R', ModItems.PINK_GARNET)
                        .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ModItems.PINK_GARNET_CHESTPLATE)
                        .pattern("R R")
                        .pattern("RRR")
                        .pattern("RRR")
                        .input('R', ModItems.PINK_GARNET)
                        .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ModItems.PINK_GARNET_LEGGINGS)
                        .pattern("RRR")
                        .pattern("R R")
                        .pattern("R R")
                        .input('R', ModItems.PINK_GARNET)
                        .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ModItems.PINK_GARNET_BOOTS)
                        .pattern("   ")
                        .pattern("R R")
                        .pattern("R R")
                        .input('R', ModItems.PINK_GARNET)
                        .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                        .offerTo(exporter);

                offerSmithingTrimRecipe(ModItems.ILYAS_SMITHING_TEMPLATE, RegistryKey.of(RegistryKeys.RECIPE,
                        Identifier.ofVanilla(getItemPath(ModItems.ILYAS_SMITHING_TEMPLATE) + "_smithing_trim_")));




            }
        };
    }

    @Override
    public String getName() {
        return "TestingMod Recipes";
    }
}
