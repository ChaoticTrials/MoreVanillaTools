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
    }

    public static void loadConfig(ForgeConfigSpec spec, Path path) {
        MoreVanillaTools.LOGGER.info("Loading config file {}", path);

        final CommentedFileConfig configData = CommentedFileConfig.builder(path).sync().autosave().writingMode(WritingMode.REPLACE).build();

        configData.load();

        spec.setConfig(configData);
    }
}
