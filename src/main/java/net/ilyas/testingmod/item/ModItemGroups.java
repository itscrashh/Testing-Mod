package net.ilyas.testingmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.ilyas.testingmod.TestingMod;
import net.ilyas.testingmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.LoggerFactory;

public class ModItemGroups {

    public static final ItemGroup PINK_GARNET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TestingMod.MOD_ID, "pink_garnet_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.testingmod.pink_garnet_items"))
                    .entries((displayContext, entries) ->  {
        entries.add(ModItems.PINK_GARNET);
        entries.add(ModItems.RAW_PINK_GARNET);
        entries.add(ModItems.MOSSIFIER);
    }).build());

    public static final ItemGroup PINK_GARNET_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TestingMod.MOD_ID, "pink_garnet_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.PINK_GARNET_BLOCK))
                    .displayName(Text.translatable("itemgroup.testingmod.pink_garnet_blocks"))
                    .entries((displayContext, entries) ->  {
                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);

                        entries.add(ModBlocks.PINK_GARNET_ORE);
                        entries.add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);

                        entries.add(ModBlocks.PINK_GARNET_STAIRS);
                        entries.add(ModBlocks.PINK_GARNET_FENCE);
                        entries.add(ModBlocks.PINK_GARNET_BUTTON);
                        entries.add(ModBlocks.PINK_GARNET_DOOR);
                        entries.add(ModBlocks.PINK_GARNET_SLAB);
                        entries.add(ModBlocks.PINK_GARNET_WALL);
                        entries.add(ModBlocks.PINK_GARNET_TRAPDOOR);
                        entries.add(ModBlocks.PINK_GARNET_PRESSURE_PLATE);
                        entries.add(ModBlocks.PINK_GARNET_FENCE_GATE);

                        entries.add(ModBlocks.MAGIC_BLOCK);


                    }).build());

    public static final ItemGroup RUNE_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TestingMod.MOD_ID, "rune_item_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RUNE_ESSENCE))
                    .displayName(Text.translatable("itemgroup.testingmod.rune_item_group"))
                    .entries((displayContext, entries) ->  {
                        entries.add(ModItems.RUNE_ESSENCE);
                        entries.add(ModItems.FIRE_RUNE);
                        entries.add(ModBlocks.RUNE_BLOCK);
                    }).build());



    public static void registerItemGroups() {
        TestingMod.LOGGER.info("Registering Item Groups for " + TestingMod.MOD_ID);
    }
}
