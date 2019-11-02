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

        public final ForgeConfigSpec.BooleanValue extraDrop;
        public final ForgeConfigSpec.BooleanValue extraDamage;
        public final ForgeConfigSpec.BooleanValue headDrop;

        Common(ForgeConfigSpec.Builder builder) {
            builder.push("chances");
            extraDropChance = builder.comment("Sets the chance of an extra drop when using a tool. If set to -1, the default will be used. e.g. 5 = 0.5%")
                    .defineInRange("dropChance", 5, -1, 1000);
            extraDamageChance = builder.comment("Sets the chance of extra damage when using bone axe or sword on a (wither) skeleton. If set to -1, the default will be used. e.g. 50 = 5%")
                    .defineInRange("extraDamageChance", 200, -1, 1000);
            headDropChance = builder.comment("Sets the chance of an head drop when using bone axe or sword. If set to -1, the default will be used. e.g. 50 = 5%")
                    .defineInRange("headDropChance", 50, -1, 1000);
            builder.pop();

            builder.push("features");
            extraDrop = builder.comment("If set true, tools may drop an item when they'll be used.")
                    .define("extraDrop", true);
            extraDamage = builder.comment("If set true, bone axe and sword make extra damage against skeletons.")
                    .define("extraDamage", true);
            headDrop = builder.comment("If set true, (wither) skeletons will drop their head with a defined chance if killed with bone axe or sword.")
                    .define("headDrop", true);
            builder.pop();
        }
    }

}
