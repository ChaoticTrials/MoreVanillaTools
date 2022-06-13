package de.melanx.MoreVanillaTools.compat;

import de.melanx.MoreVanillaTools.MoreVanillaTools;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.resources.ResourceLocation;

import javax.annotation.Nonnull;

@JeiPlugin
public class JeiCompat implements IModPlugin {

    public static final ResourceLocation PLUGIN_UID = MoreVanillaTools.getInstance().resource("jei");

    @Nonnull
    @Override
    public ResourceLocation getPluginUid() {
        return PLUGIN_UID;
    }

    @Override
    public void registerRecipes(@Nonnull IRecipeRegistration registration) {
        if (LibCompat.isMoreVanillaLibLoaded()) {
            LibCompat.jei(registration);
        }
    }
}
