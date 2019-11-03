package de.melanx.MoreVanillaTools.util;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import de.melanx.MoreVanillaTools.MoreVanillaTools;
import net.minecraftforge.common.ForgeConfigSpec;

import java.nio.file.Path;

public class ConfigHandler {

    private static final ForgeConfigSpec.Builder SERVER_BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SERVER_CONFIG;

    static {
        init(SERVER_BUILDER);

        SERVER_CONFIG = SERVER_BUILDER.build();
    }

    public static ForgeConfigSpec.IntValue extraDropChance;
    public static ForgeConfigSpec.IntValue extraDamageChance;
    public static ForgeConfigSpec.IntValue headDropChance;
    public static ForgeConfigSpec.IntValue damageByPaperToolsChance;

    public static ForgeConfigSpec.BooleanValue extraDrop;
    public static ForgeConfigSpec.BooleanValue extraDamage;
    public static ForgeConfigSpec.BooleanValue headDrop;
    public static ForgeConfigSpec.BooleanValue damageByPaperTools;

    public static ForgeConfigSpec.IntValue minPaperDamage;
    public static ForgeConfigSpec.IntValue maxPaperDamage;

    public static ForgeConfigSpec.IntValue boneDurability;
    public static ForgeConfigSpec.IntValue coalDurability;
    public static ForgeConfigSpec.IntValue emeraldDurability;
    public static ForgeConfigSpec.IntValue glowstoneDurability;
    public static ForgeConfigSpec.IntValue lapisDurability;
    public static ForgeConfigSpec.IntValue obsidianDurability;
    public static ForgeConfigSpec.IntValue paperDurability;
    public static ForgeConfigSpec.IntValue quartzDurability;
    public static ForgeConfigSpec.IntValue redstoneDurability;

    public static ForgeConfigSpec.IntValue boneHarvestlevel;
    public static ForgeConfigSpec.IntValue coalHarvestlevel;
    public static ForgeConfigSpec.IntValue emeraldHarvestlevel;
    public static ForgeConfigSpec.IntValue glowstoneHarvestlevel;
    public static ForgeConfigSpec.IntValue lapisHarvestlevel;
    public static ForgeConfigSpec.IntValue obsidianHarvestlevel;
    public static ForgeConfigSpec.IntValue paperHarvestlevel;
    public static ForgeConfigSpec.IntValue quartzHarvestlevel;
    public static ForgeConfigSpec.IntValue redstoneHarvestlevel;

    public static void init(ForgeConfigSpec.Builder builder) {
        builder.push("features");
        extraDrop = builder.comment("If set true, tools may drop an item when they'll be used.")
                .define("extraDrop", true);
        extraDamage = builder.comment("If set true, bone axe and sword make extra damage against skeletons.")
                .define("extraDamage", true);
        headDrop = builder.comment("If set true, (wither) skeletons will drop their head with a defined chance if killed with bone axe or sword.")
                .define("headDrop", true);
        damageByPaperTools = builder.comment("If set to true paper tools may hurt you.")
                .define("damageByPaperTools", true);
        builder.pop();

        builder.push("chances");
        extraDropChance = builder.comment("Sets the chance of an extra drop when using a tool. If set to -1, the default (5 = 0.5%) will be used.")
                .defineInRange("dropChance", 5, -1, 1000);
        extraDamageChance = builder.comment("Sets the chance of extra damage when using bone axe or sword on a (wither) skeleton. If set to -1, the default (200 = 20%) will be used.")
                .defineInRange("extraDamageChance", 200, -1, 1000);
        headDropChance = builder.comment("Sets the chance of an head drop when using bone axe or sword. If set to -1, the default (50 = 5%) will be used.")
                .defineInRange("headDropChance", 50, -1, 1000);
        damageByPaperToolsChance = builder.comment("Sets the chance to take an half heart damage if using paper tools. If set to -1, the default (100 = 10%) will be used.")
                .defineInRange("damageByPaperTools", 100, -1, Integer.MAX_VALUE);
        builder.pop();

        builder.push("amounts");
        minPaperDamage = builder.comment("The minimum amount of damage. Default: 1 = 0.5 hearts")
                .defineInRange("minPaperDamage", 1, 0, Integer.MAX_VALUE);
        maxPaperDamage = builder.comment("The maximum amount of damage. Default: 5 = 2.5 hearts")
                .defineInRange("maxPaperDamage", 5, 0, Integer.MAX_VALUE);

            builder.push("harvestlevels").comment("The harvestlevel of the tools (0 = wood; 1 = stone; 2 = iron; 3 = diamond; 4 = higher)");
            boneHarvestlevel = builder.defineInRange("bone tools harvestlevel", 1, 0, 4);
            coalHarvestlevel = builder.defineInRange("coal tools harvestlevel", 1, 0, 4);
            emeraldHarvestlevel = builder.defineInRange("emerald tools harvestlevel", 3, 0, 4);
            glowstoneHarvestlevel = builder.defineInRange("glowstone tools harvestlevel", 2, 0, 4);
            lapisHarvestlevel = builder.defineInRange("lapis tools harvestlevel", 2, 0, 4);
            obsidianHarvestlevel = builder.defineInRange("obsidian tools harvestlevel", 4, 0, 4);
            paperHarvestlevel = builder.defineInRange("paper tools harvestlevel", 0, 0, 4);
            quartzHarvestlevel = builder.defineInRange("quartz tools harvestlevel", 2, 0, 4);
            redstoneHarvestlevel = builder.defineInRange("redstone tools harvestlevel", 2, 0, 4);
            builder.pop();

            builder.push("durabilities").comment("The durability of the tools");
            boneDurability = builder.defineInRange("bone tools durability", 206, 1, Integer.MAX_VALUE);
            coalDurability = builder.defineInRange("coal tools durability", 155, 1, Integer.MAX_VALUE);
            emeraldDurability = builder.defineInRange("emerald tools durability", 3197, 1, Integer.MAX_VALUE);
            glowstoneDurability = builder.defineInRange("glowstone tools durability", 193, 1, Integer.MAX_VALUE);
            lapisDurability = builder.defineInRange("lapis tools durability", 193, 1, Integer.MAX_VALUE);
            obsidianDurability = builder.defineInRange("obsidian tools durability", (int) (1337 * 3.14F), 1, Integer.MAX_VALUE);
            paperDurability = builder.defineInRange("paper tools durability", 13, 1, Integer.MAX_VALUE);
            quartzDurability = builder.defineInRange("quartz tools durability", 155, 1, Integer.MAX_VALUE);
            redstoneDurability = builder.defineInRange("redstone tools durability", 193, 1, Integer.MAX_VALUE);
            builder.pop();

        builder.pop();
    }

    public static void loadConfig(ForgeConfigSpec spec, Path path) {
        MoreVanillaTools.LOGGER.debug("Loading config file {}", path);

        final CommentedFileConfig configData = CommentedFileConfig.builder(path).sync().autosave().writingMode(WritingMode.REPLACE).build();

        configData.load();

        spec.setConfig(configData);
    }
}
