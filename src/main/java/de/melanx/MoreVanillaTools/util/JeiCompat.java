package de.melanx.MoreVanillaTools.util;

import de.melanx.morevanillalib.config.FeatureConfig;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.resources.ResourceLocation;

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
        if (FeatureConfig.DoubleDrop.enabledAll) {
            if (FeatureConfig.DoubleDrop.Coal.enabled)
                addValueInfoPage(registration, ModItems.coalPickaxe, "coal_double_drop", FeatureConfig.DoubleDrop.Coal.chance * 100);
            if (FeatureConfig.DoubleDrop.Emerald.enabled)
                addValueInfoPage(registration, ModItems.emeraldPickaxe, "emerald_double_drop", FeatureConfig.DoubleDrop.Emerald.chance * 100);
            if (FeatureConfig.DoubleDrop.Lapis.enabled)
                addValueInfoPage(registration, ModItems.lapisPickaxe, "lapis_double_drop", FeatureConfig.DoubleDrop.Lapis.chance * 100);
            if (FeatureConfig.DoubleDrop.Quartz.enabled)
                addValueInfoPage(registration, ModItems.quartzPickaxe, "quartz_double_drop", FeatureConfig.DoubleDrop.Quartz.chance * 100);
            if (FeatureConfig.DoubleDrop.Redstone.enabled)
                addValueInfoPage(registration, ModItems.redstonePickaxe, "redstone_double_drop", FeatureConfig.DoubleDrop.Redstone.chance * 100);
        }
    }
}
