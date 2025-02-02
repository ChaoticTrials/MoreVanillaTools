package de.melanx.MoreVanillaTools.compat;

import de.melanx.MoreVanillaTools.util.ModItems;
import de.melanx.morevanillalib.compat.JeiCompat;
import de.melanx.morevanillalib.config.FeatureConfig;
import de.melanx.morevanillalib.util.ComponentUtil;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.fml.ModList;

import java.util.List;

public class LibCompat {

    public static final String MODID = "morevanillalib";

    public static void editHoverText(TieredItem item, ItemStack stack, Item.TooltipContext context, List<Component> tooltip, TooltipFlag isAdvanced) {
        if (Screen.hasShiftDown()) {
            tooltip.add(ComponentUtil.getTooltip("durability", item.getTier().getUses()).withStyle(ChatFormatting.GRAY));
            tooltip.add(ComponentUtil.getTooltip("repairing_item", item.getTier().getRepairIngredient().getItems()[0].getItem().getDescription().getString()).withStyle(ChatFormatting.GRAY));
        } else {
            tooltip.add(ComponentUtil.getTooltip("more_information").withStyle(ChatFormatting.ITALIC, ChatFormatting.GRAY));
        }
    }

    public static void jei(IRecipeRegistration registration) {
        if (FeatureConfig.DoubleDrop.enabledAll) {
            if (FeatureConfig.DoubleDrop.coal.enabled()) {
                JeiCompat.addValueInfoPage(registration, ModItems.coalPickaxe, "coal_double_drop", FeatureConfig.DoubleDrop.coal.getChance() * 100);
            }
            if (FeatureConfig.DoubleDrop.emerald.enabled()) {
                JeiCompat.addValueInfoPage(registration, ModItems.emeraldPickaxe, "emerald_double_drop", FeatureConfig.DoubleDrop.emerald.getChance() * 100);
            }
            if (FeatureConfig.DoubleDrop.lapis.enabled()) {
                JeiCompat.addValueInfoPage(registration, ModItems.lapisPickaxe, "lapis_double_drop", FeatureConfig.DoubleDrop.lapis.getChance() * 100);
            }
            if (FeatureConfig.DoubleDrop.quartz.enabled()) {
                JeiCompat.addValueInfoPage(registration, ModItems.quartzPickaxe, "quartz_double_drop", FeatureConfig.DoubleDrop.quartz.getChance() * 100);
            }
            if (FeatureConfig.DoubleDrop.redstone.enabled()) {
                JeiCompat.addValueInfoPage(registration, ModItems.redstonePickaxe, "redstone_double_drop", FeatureConfig.DoubleDrop.redstone.getChance() * 100);
            }
        }
    }

    public static boolean isMoreVanillaLibLoaded() {
        return ModList.get().isLoaded(MODID);
    }
}
