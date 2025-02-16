package net.ilyas.testingmod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.ilyas.testingmod.TestingMod;
import net.ilyas.testingmod.block.custom.AirAltarBlock;
import net.ilyas.testingmod.block.custom.FireAltarBlock;
import net.ilyas.testingmod.block.custom.MagicBlock;
import net.ilyas.testingmod.block.custom.PinkGarnetLampBlock;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.structure.StrongholdGenerator;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block RAW_PINK_GARNET_BLOCK = registerBlock("raw_pink_garnet_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TestingMod.MOD_ID, "raw_pink_garnet_block")))
                    .strength(3.5f, 3f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .luminance(state -> 4)));
    public static final Block PINK_GARNET_BLOCK = registerBlock("pink_garnet_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TestingMod.MOD_ID, "pink_garnet_block")))
                    .strength(4f, 3f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .instrument(NoteBlockInstrument.CHIME)
                    .luminance(state -> 15)));

    public static final Block PINK_GARNET_ORE = registerBlock("pink_garnet_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TestingMod.MOD_ID, "pink_garnet_ore")))
                            .strength(3f)
                            .requiresTool()));
    public static final Block PINK_GARNET_DEEPSLATE_ORE = registerBlock("pink_garnet_deepslate_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 6),
                    AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TestingMod.MOD_ID, "pink_garnet_deepslate_ore")))
                            .strength(4f)
                    .requiresTool()
                            .sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block RUNE_BLOCK = registerBlock("rune_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TestingMod.MOD_ID, "rune_block")))
                            .strength(2f)
                            .requiresTool()));

    public static final Block MAGIC_BLOCK = registerBlock("magic_block",
        new MagicBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TestingMod.MOD_ID, "magic_block")))
                .strength(3f)
                .requiresTool()
                .sounds(BlockSoundGroup.NETHERITE)));

    public static final Block PINK_GARNET_STAIRS = registerBlock("pink_garnet_stairs",
        new StairsBlock(ModBlocks.PINK_GARNET_BLOCK.getDefaultState(),
                AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TestingMod.MOD_ID, "pink_garnet_stairs")))
                        .strength(2f)
                        .requiresTool()));
    public static final Block PINK_GARNET_SLAB = registerBlock("pink_garnet_slab",
            new SlabBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TestingMod.MOD_ID, "pink_garnet_slab")))
                            .strength(2f)
                            .requiresTool()));

    public static final Block PINK_GARNET_BUTTON = registerBlock("pink_garnet_button",
            new ButtonBlock(BlockSetType.IRON, 2,
                    AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TestingMod.MOD_ID, "pink_garnet_button")))
                            .strength(2f)
                            .noCollision()
                            .requiresTool()));
    public static final Block PINK_GARNET_PRESSURE_PLATE = registerBlock("pink_garnet_pressure_plate",
            new PressurePlateBlock(BlockSetType.IRON,
                    AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TestingMod.MOD_ID, "pink_garnet_pressure_plate")))
                            .strength(2f)
                            .requiresTool()));

    public static final Block PINK_GARNET_FENCE = registerBlock("pink_garnet_fence",
            new FenceBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TestingMod.MOD_ID, "pink_garnet_fence")))
                            .strength(2f)
                            .requiresTool()));
    public static final Block PINK_GARNET_FENCE_GATE = registerBlock("pink_garnet_fence_gate",
            new FenceGateBlock(WoodType.ACACIA,
                    AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TestingMod.MOD_ID, "pink_garnet_fence_gate")))
                            .strength(2f)
                            .requiresTool()));
    public static final Block PINK_GARNET_WALL = registerBlock("pink_garnet_wall",
            new WallBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TestingMod.MOD_ID, "pink_garnet_wall")))
                            .strength(2f)
                            .requiresTool()));

    public static final Block PINK_GARNET_DOOR = registerBlock("pink_garnet_door",
            new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TestingMod.MOD_ID, "pink_garnet_door")))
                            .strength(2f)
                            .nonOpaque()
                            .requiresTool()));
    public static final Block PINK_GARNET_TRAPDOOR = registerBlock("pink_garnet_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TestingMod.MOD_ID, "pink_garnet_trapdoor")))
                            .strength(2f)
                            .nonOpaque()
                            .requiresTool()));

    public static final Block ALTAR_BLOCK = registerBlock("altar_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TestingMod.MOD_ID, "altar_block")))
                            .strength(2f)
                            .requiresTool()));
    public static final Block FIRE_ALTAR_BLOCK = registerBlock("fire_altar_block",
            new FireAltarBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TestingMod.MOD_ID, "fire_altar_block")))
                    .strength(2f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.NETHERITE)));
    public static final Block AIR_ALTAR_BLOCK = registerBlock("air_altar_block",
           new AirAltarBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TestingMod.MOD_ID, "air_altar_block")))
                   .strength(2f)
                   .requiresTool()
                    .sounds(BlockSoundGroup.NETHERITE)));

    public static final Block PINK_GARNET_LAMP = registerBlock("pink_garnet_lamp",
        new PinkGarnetLampBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TestingMod.MOD_ID, "pink_garnet_lamp")))
                .strength(2f)
                .requiresTool()
                .luminance(state -> state.get(PinkGarnetLampBlock.CLICKED) ? 15 : 0)));



    private static Block registerBlock (String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(TestingMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(TestingMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TestingMod.MOD_ID, name))).useBlockPrefixedTranslationKey()));
    }

    public static void registerModBlocks() {
        TestingMod.LOGGER.info("Registering Mod Blocks for " + TestingMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(PINK_GARNET_BLOCK);
            entries.add(RAW_PINK_GARNET_BLOCK);
        });
    }

}
