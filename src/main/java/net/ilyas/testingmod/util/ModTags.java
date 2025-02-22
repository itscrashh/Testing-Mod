package net.ilyas.testingmod.util;

import net.ilyas.testingmod.TestingMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {

        public static final TagKey<Block> NEEDS_PINK_GARNET_TOOL = createTag("needs_pink_garnet_tool");
        public static final TagKey<Block> INCORRECT_FOR_PINK_GARNET_TOOL = createTag("incorrect_for_pink_garnet_tool");
        public static final TagKey<Block> NEEDS_NETHERITE_TOOL = createTag("needs_netherite_tool");
        public static final TagKey<Block> INCORRECT_FOR_RUBY_TOOL = createTag("incorrect_for_ruby_tool");
        public static final TagKey<Block> NEEDS_RUBY_TOOL = createTag("needs_ruby_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(TestingMod.MOD_ID, name));
        }
    }
        public static class Items {

            public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");
            public static final TagKey<Item> PINK_GARNET_REPAIR = createTag ("pink_garnet_repair");
            public static final TagKey<Item> RUBY_REPAIR = createTag("ruby_repair");

            public static final TagKey<Item> FIRE_RUNE_TAG = createTag("fire_rune_tag");

            private static TagKey<Item> createTag(String name) {
                return TagKey.of(RegistryKeys.ITEM, Identifier.of(TestingMod.MOD_ID, name));
            }
        }

    }
