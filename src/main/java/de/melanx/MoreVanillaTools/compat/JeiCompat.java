package de.melanx.MoreVanillaTools.compat;

import de.melanx.MoreVanillaTools.items.KnifeBase;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.runtime.IJeiRuntime;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nonnull;
import java.util.List;

@JeiPlugin
public class JeiCompat implements IModPlugin {

    public static final ResourceLocation PLUGIN_UID = ResourceLocation.fromNamespaceAndPath("morevanillatools", "jei");

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

        if (FarmersDelightCompat.isFarmersDelightLoaded()) {
            BuiltInRegistries.ITEM.stream()
                    .filter(item -> item instanceof KnifeBase)
                    .forEach(knife -> {
                        //noinspection NoTranslation
                        registration.addIngredientInfo(knife, Component.translatable("jei.farmersdelight.info.knife"));
                    });
        }
    }

    @Override
    public void onRuntimeAvailable(@Nonnull IJeiRuntime runtime) {
        if (!FarmersDelightCompat.isFarmersDelightLoaded()) {
            List<ItemStack> knives = BuiltInRegistries.ITEM.stream()
                    .filter(item -> item instanceof KnifeBase)
                    .map(ItemStack::new)
                    .toList();

            runtime.getIngredientManager().removeIngredientsAtRuntime(VanillaTypes.ITEM_STACK, knives);
        }
    }
}
