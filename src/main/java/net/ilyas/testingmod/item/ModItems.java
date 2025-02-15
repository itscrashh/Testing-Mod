package net.ilyas.testingmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.ilyas.testingmod.TestingMod;
import net.ilyas.testingmod.item.custom.MossifierItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TestingMod.MOD_ID,"pink_garnet")))));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TestingMod.MOD_ID,"raw_pink_garnet")))));

    public static final Item MOSSIFIER = registerItem("mossifier", new MossifierItem(new Item.Settings().maxDamage(100).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TestingMod.MOD_ID, "mossifier")))));

    public static final Item FIRE_RUNE = registerItem("fire_rune", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TestingMod.MOD_ID,"fire_rune")))));
    public static final Item RUNE_ESSENCE = registerItem("rune_essence", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TestingMod.MOD_ID,"rune_essence")))));


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
        });

    }
}
