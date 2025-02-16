package net.ilyas.testingmod.item;

import net.ilyas.testingmod.TestingMod;
import net.ilyas.testingmod.util.ModTags;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;


public class ModArmorMaterials {

    public static final RegistryKey<EquipmentAsset> PINK_GARNET_ARMOR_MATERIAL_KEY = RegistryKey.of(RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset")), Identifier.of(TestingMod.MOD_ID, "pink_garnet"));

public static final ArmorMaterial PINK_GARNET_ARMOR_MATERIAL = new ArmorMaterial(35, Util.make(new EnumMap<>(EquipmentType.class), map -> {
    map.put(EquipmentType.BOOTS, 3);
    map.put(EquipmentType.LEGGINGS, 6);
    map.put(EquipmentType.CHESTPLATE, 8);
    map.put(EquipmentType.HELMET, 3);
    map.put(EquipmentType.BODY, 11);
}), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,2.5f,.05f, ModTags.Items.PINK_GARNET_REPAIR,
      PINK_GARNET_ARMOR_MATERIAL_KEY);
}
