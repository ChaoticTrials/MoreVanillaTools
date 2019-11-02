package de.melanx.MoreVanillaTools.util;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class ConfigHandler {

    public static final Common COMMON;
    public static final ForgeConfigSpec COMMON_SPEC;

    static
    {
        final Pair<Common, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(Common::new);
        COMMON_SPEC = specPair.getRight();
        COMMON = specPair.getLeft();
    }

    public static class Common {
        public final ForgeConfigSpec.IntValue extraDropChance;
        public final ForgeConfigSpec.IntValue extraDamageChance;
        public final ForgeConfigSpec.IntValue headDropChance;
        public final ForgeConfigSpec.IntValue damageByPaperToolsChance;

        public final ForgeConfigSpec.BooleanValue extraDrop;
        public final ForgeConfigSpec.BooleanValue extraDamage;
        public final ForgeConfigSpec.BooleanValue headDrop;
        public final ForgeConfigSpec.BooleanValue damageByPaperTools;

        Common(ForgeConfigSpec.Builder builder) {
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
    }

}
