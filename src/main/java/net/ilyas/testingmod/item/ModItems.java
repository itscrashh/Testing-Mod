package net.ilyas.testingmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.ilyas.testingmod.TestingMod;
import net.ilyas.testingmod.item.custom.*;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TestingMod.MOD_ID,"pink_garnet")))));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TestingMod.MOD_ID,"raw_pink_garnet")))));

    public static final Item MOSSIFIER = registerItem("mossifier", new MossifierItem(new Item.Settings().maxDamage(100).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TestingMod.MOD_ID, "mossifier")))));

    public static final Item AIR_RUNE = registerItem("air_rune", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TestingMod.MOD_ID,"air_rune")))));
    public static final Item FIRE_RUNE = registerItem("fire_rune", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TestingMod.MOD_ID,"fire_rune")))));
    public static final Item RUNE_ESSENCE = registerItem("rune_essence", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TestingMod.MOD_ID,"rune_essence")))));

    public static final Item FIRE_TALISMAN = registerItem("fire_talisman", new FireTalismanItem(new Item.Settings().maxDamage(1000000).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TestingMod.MOD_ID, "fire_talisman")))));
    public static final Item AIR_TALISMAN = registerItem("air_talisman", new AirTalismanItem(new Item.Settings().maxDamage(1000000).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TestingMod.MOD_ID, "air_talisman")))));

    public static final Item PINK_GARNET_SWORD = registerItem("pink_garnet_sword",
            new SwordItem(ModToolsMaterials.PINK_GARNET, 3, -2.4f, new Item.Settings()
                    .registryKey((RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TestingMod.MOD_ID, "pink_garnet_sword"))))));
    public static final Item PINK_GARNET_PICKAXE = registerItem("pink_garnet_pickaxe",
            new PickaxeItem(ModToolsMaterials.PINK_GARNET, 1, -2.8f, new Item.Settings()
                    .registryKey((RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TestingMod.MOD_ID, "pink_garnet_pickaxe"))))));
    public static final Item PINK_GARNET_HOE = registerItem("pink_garnet_hoe",
            new HoeItem(ModToolsMaterials.PINK_GARNET, -2, -1f, new Item.Settings()
                    .registryKey((RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TestingMod.MOD_ID, "pink_garnet_hoe"))))));
    public static final Item PINK_GARNET_SHOVEL = registerItem("pink_garnet_shovel",
            new ShovelItem(ModToolsMaterials.PINK_GARNET, 1.5f, -3f, new Item.Settings()
                    .registryKey((RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TestingMod.MOD_ID, "pink_garnet_shovel"))))));
    public static final Item PINK_GARNET_AXE = registerItem("pink_garnet_axe",
            new AxeItem(ModToolsMaterials.PINK_GARNET, 6, -3.2f, new Item.Settings()
                    .registryKey((RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TestingMod.MOD_ID, "pink_garnet_axe"))))));
    public static final Item PINK_GARNET_HAMMER = registerItem("pink_garnet_hammer",
            new HammerItem(ModToolsMaterials.PINK_GARNET, 7, -3.8f, new Item.Settings()
                    .registryKey((RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TestingMod.MOD_ID, "pink_garnet_hammer"))))));

    public static final Item PINK_GARNET_HELMET = registerItem("pink_garnet_helmet",
            new ModArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, EquipmentType.HELMET, new Item.Settings()
                    .registryKey((RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TestingMod.MOD_ID, "pink_garnet_helmet"))))));
    public static final Item PINK_GARNET_CHESTPLATE = registerItem("pink_garnet_chestplate",
            new ArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, EquipmentType.CHESTPLATE, new Item.Settings()
                    .registryKey((RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TestingMod.MOD_ID, "pink_garnet_chestplate"))))));
    public static final Item PINK_GARNET_LEGGINGS = registerItem("pink_garnet_leggings",
            new ArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, EquipmentType.LEGGINGS, new Item.Settings()
                    .registryKey((RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TestingMod.MOD_ID, "pink_garnet_leggings"))))));
    public static final Item PINK_GARNET_BOOTS = registerItem("pink_garnet_boots",
            new ArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, EquipmentType.BOOTS, new Item.Settings()
                    .registryKey((RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TestingMod.MOD_ID, "pink_garnet_boots"))))));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TestingMod.MOD_ID, name), item);
    }

    public static void registerModItems() {

        TestingMod.LOGGER.info("Registering Mod Items for" + TestingMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PINK_GARNET);
            entries.add(RAW_PINK_GARNET);
            entries.add(FIRE_RUNE);
            entries.add(RUNE_ESSENCE);
            entries.add(AIR_RUNE);
        });

    }
}
