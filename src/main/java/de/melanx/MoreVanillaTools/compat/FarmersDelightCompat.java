package de.melanx.MoreVanillaTools.compat;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.fml.ModList;

public class FarmersDelightCompat {

    public static final String MODID = "farmersdelight";

    public static ResourceLocation location(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }

    public static boolean isFarmersDelightLoaded() {
        return ModList.get().isLoaded(MODID);
    }
}
