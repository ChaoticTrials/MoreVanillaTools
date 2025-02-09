package de.melanx.MoreVanillaTools.config;

import net.minecraft.tags.BlockTags;
import org.moddingx.libx.annotation.config.RegisterConfig;
import org.moddingx.libx.config.Config;
import org.moddingx.libx.config.Group;

@RegisterConfig
public class ModConfig {

    @Group
    public static class ToolValues {

        @Config
        public static ConfigurableMaterial bone = new ConfigurableMaterial(3.0f, 4.0f, BlockTags.INCORRECT_FOR_WOODEN_TOOL, 176, 17);

        @Config
        public static ConfigurableMaterial coal = new ConfigurableMaterial(3.9f, 2.0f, BlockTags.INCORRECT_FOR_WOODEN_TOOL, 145, 17);

        @Config
        public static ConfigurableMaterial copper = new ConfigurableMaterial(1.9f, 1.0f, BlockTags.INCORRECT_FOR_STONE_TOOL, 98, 10);

        @Config
        public static ConfigurableMaterial emerald = new ConfigurableMaterial(8.2f, 7.0f, BlockTags.INCORRECT_FOR_IRON_TOOL, 1171, 35);

        @Config
        public static ConfigurableMaterial ender = new ConfigurableMaterial(3.7f, 6.0f, BlockTags.INCORRECT_FOR_IRON_TOOL, 666, 10);

        @Config
        public static ConfigurableMaterial fiery = new ConfigurableMaterial(4.0f, 6.0f, BlockTags.INCORRECT_FOR_STONE_TOOL, 127, 15);

        @Config
        public static ConfigurableMaterial glowstone = new ConfigurableMaterial(3.0f, 4.0f, BlockTags.INCORRECT_FOR_STONE_TOOL, 123, 35);

        @Config
        public static ConfigurableMaterial lapis = new ConfigurableMaterial(173, 3.0f, BlockTags.INCORRECT_FOR_IRON_TOOL, 173, 20);

        @Config
        public static ConfigurableMaterial nether = new ConfigurableMaterial(3.9f, 4.0f, BlockTags.INCORRECT_FOR_STONE_TOOL, 188, 66);

        @Config
        public static ConfigurableMaterial obsidian = new ConfigurableMaterial(4.7f, 7.0f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1337, 15);

        @Config
        public static ConfigurableMaterial paper = new ConfigurableMaterial(1.8f, 0.0f, BlockTags.INCORRECT_FOR_WOODEN_TOOL, 13, 17);

        @Config
        public static ConfigurableMaterial prismarine = new ConfigurableMaterial(6.0f, 6.0f, BlockTags.INCORRECT_FOR_IRON_TOOL, 225, 20);

        @Config
        public static ConfigurableMaterial quartz = new ConfigurableMaterial(3.9f, 5.0f, BlockTags.INCORRECT_FOR_STONE_TOOL, 117, 18);

        @Config
        public static ConfigurableMaterial redstone = new ConfigurableMaterial(173, 3.0f, BlockTags.INCORRECT_FOR_IRON_TOOL, 173, 20);

        @Config
        public static ConfigurableMaterial slime = new ConfigurableMaterial(5.2f, 7.0f, BlockTags.INCORRECT_FOR_STONE_TOOL, 123, 20);
    }
}
