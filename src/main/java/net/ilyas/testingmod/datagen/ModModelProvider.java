package net.ilyas.testingmod.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.ilyas.testingmod.block.ModBlocks;
import net.ilyas.testingmod.block.custom.PinkGarnetLampBlock;
import net.ilyas.testingmod.item.ModArmorMaterials;
import net.ilyas.testingmod.item.ModItems;
import net.minecraft.client.data.*;
import net.minecraft.client.render.item.model.ItemModel;
import net.minecraft.client.render.item.property.bool.BooleanProperty;
import net.minecraft.client.render.item.property.numeric.CountProperty;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

   // public void registerCondition(Item item, BooleanProperty property, ItemModel.Unbaked onTrue, ItemModel.Unbaked onFalse) {
       // ItemModelGenerator.output.accept(item, ItemModels.condition(property, onTrue, onFalse));
    //}

    // public void registerWithBrokenCondition(Item item) {
     //   ItemModel.Unbaked unbaked = ItemModels.basic(ItemModelGenerator.upload(item, Models.HANDHELD));
     //   ItemModel.Unbaked unbaked2 = ItemModels.basic(ItemModelGenerator.registerSubModel(item, "_broken", Models.HANDHELD));
      //  this.registerCondition(item, BooleanProperty, unbaked2, unbaked);
   // }



    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUNE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ALTAR_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FIRE_ALTAR_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AIR_ALTAR_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGIC_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GARNET_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_PINK_GARNET_BLOCK);
        BlockStateModelGenerator.BlockTexturePool pinkGarnetPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINK_GARNET_BLOCK);

        pinkGarnetPool.stairs(ModBlocks.PINK_GARNET_STAIRS);
        pinkGarnetPool.slab(ModBlocks.PINK_GARNET_SLAB);
        pinkGarnetPool.wall(ModBlocks.PINK_GARNET_WALL);
        pinkGarnetPool.button(ModBlocks.PINK_GARNET_BUTTON);
        pinkGarnetPool.fence(ModBlocks.PINK_GARNET_FENCE);
        pinkGarnetPool.fenceGate(ModBlocks.PINK_GARNET_FENCE_GATE);
        pinkGarnetPool.pressurePlate(ModBlocks.PINK_GARNET_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(ModBlocks.PINK_GARNET_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.PINK_GARNET_TRAPDOOR);

        Identifier lampOffIdentifier = TexturedModel.CUBE_ALL.upload(ModBlocks.PINK_GARNET_LAMP, blockStateModelGenerator.modelCollector);
        Identifier lampOnIdentifier = blockStateModelGenerator.createSubModel(ModBlocks.PINK_GARNET_LAMP, "_on", Models.CUBE_ALL, TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.PINK_GARNET_LAMP)
                .coordinate(BlockStateModelGenerator.createBooleanModelMap(PinkGarnetLampBlock.CLICKED, lampOnIdentifier, lampOffIdentifier)));


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
 //       Identifier modelId = itemModelGenerator.upload(ModItems.MOSSIFIER, Models.HANDHELD);
   //     itemModelGenerator.registerSubModel(ModItems.MOSSIFIER, "_damaged", Models.HANDHELD);
    //    itemModelGenerator.output.accept(
     //           ModItems.MOSSIFIER,
      //          ItemModels.rangeDispatch(
       //                 new CountProperty(true),
        //                ItemModels.basic(modelId),
         //               List.of(
          //                      ItemModels.rangeDispatchEntry(
           //                             ItemModels.basic(modelId),
            //                            1.0f
            //                    )
             //           )
              //  )
       // );


        itemModelGenerator.register(ModItems.MOSSIFIER, Models.HANDHELD);

        itemModelGenerator.register(ModItems.PINK_GARNET, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_PINK_GARNET, Models.GENERATED);

        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);


        itemModelGenerator.register(ModItems.AIR_RUNE, Models.GENERATED);
        itemModelGenerator.register(ModItems.FIRE_RUNE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUNE_ESSENCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.FIRE_TALISMAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.AIR_TALISMAN, Models.GENERATED);

        itemModelGenerator.register(ModItems.PINK_GARNET_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PINK_GARNET_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PINK_GARNET_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PINK_GARNET_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PINK_GARNET_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PINK_GARNET_HAMMER, Models.HANDHELD);

        itemModelGenerator.registerArmor(ModItems.PINK_GARNET_HELMET, ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL_KEY,
                "helmet", false);
        itemModelGenerator.registerArmor(ModItems.PINK_GARNET_CHESTPLATE, ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL_KEY,
                "chestplate", false);
        itemModelGenerator.registerArmor(ModItems.PINK_GARNET_LEGGINGS, ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL_KEY,
                "leggings", false);
        itemModelGenerator.registerArmor(ModItems.PINK_GARNET_BOOTS, ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL_KEY,
                "boots", false);

        itemModelGenerator.register(ModItems.PINK_GARNET_HORSE_ARMOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.ILYAS_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.FIRE_STAFF, Models.HANDHELD);

        itemModelGenerator.register(ModItems.RUBY_PICKAXE, Models.HANDHELD);

    }
}
