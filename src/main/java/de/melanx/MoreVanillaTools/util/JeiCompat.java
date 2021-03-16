package de.melanx.MoreVanillaTools.util;

import de.melanx.morevanillalib.LibConfigHandler;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;

import static de.melanx.morevanillalib.compat.JeiCompat.PLUGIN_UID;
import static de.melanx.morevanillalib.compat.JeiCompat.addValueInfoPage;

@JeiPlugin
public class JeiCompat implements IModPlugin {

    @Nonnull
    @Override
    public ResourceLocation getPluginUid() {
        return PLUGIN_UID;
    }

    @Override
    public void registerRecipes(@Nonnull IRecipeRegistration registration) {
        if (LibConfigHandler.doubleDrop.get()) {
            if (LibConfigHandler.coalDoubleDrop.get())
                addValueInfoPage(registration, Registry.COAL_PICKAXE.get(), "coal_double_drop", LibConfigHandler.coalDoubleDropChance.get() / 10);
            if (LibConfigHandler.emeraldDoubleDrop.get())
                addValueInfoPage(registration, Registry.EMERALD_PICKAXE.get(), "emerald_double_drop", LibConfigHandler.emeraldDoubleDropChance.get() / 10);
            if (LibConfigHandler.lapisDoubleDrop.get())
                addValueInfoPage(registration, Registry.LAPIS_PICKAXE.get(), "lapis_double_drop", LibConfigHandler.lapisDoubleDropChance.get() / 10);
            if (LibConfigHandler.quartzDoubleDrop.get())
                addValueInfoPage(registration, Registry.QUARTZ_PICKAXE.get(), "quartz_double_drop", LibConfigHandler.quartzDoubleDropChance.get() / 10);
            if (LibConfigHandler.redstoneDoubleDrop.get())
                addValueInfoPage(registration, Registry.REDSTONE_PICKAXE.get(), "redstone_double_drop", LibConfigHandler.redstoneDoubleDropChance.get() / 10);
        }
    }
}
