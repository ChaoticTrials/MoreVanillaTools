package de.melanx.MoreVanillaTools.compat;

import de.melanx.MoreVanillaTools.items.BaseTool;
import de.melanx.MoreVanillaTools.util.ModItems;
import de.melanx.morevanillalib.FeatureConfig;
import de.melanx.morevanillalib.compat.JeiCompat;
import de.melanx.morevanillalib.util.ComponentUtil;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.fml.ModList;

import java.util.List;

public class LibCompat {

    public static final String MODID = "morevanillalib";

    public static void editHoverText(BaseTool item, ItemStack stack, Level level, List<Component> tooltip, TooltipFlag isAdvanced) {
        if (Screen.hasShiftDown()) {
            tooltip.add(ComponentUtil.getTooltip("durability", item.getTier().getUses()).withStyle(ChatFormatting.GRAY));
            tooltip.add(ComponentUtil.getTooltip("harvest_level", item.getTier().getLevel()).withStyle(ChatFormatting.GRAY));
            tooltip.add(ComponentUtil.getTooltip("repairing_item", item.getTier().getRepairIngredient().getItems()[0].getItem().getDescription().getString()).withStyle(ChatFormatting.GRAY));
        } else {
            tooltip.add(ComponentUtil.getTooltip("more_information").withStyle(ChatFormatting.ITALIC, ChatFormatting.GRAY));
        }
    }

    public static void jei(IRecipeRegistration registration) {
        if (FeatureConfig.DoubleDrop.enabledAll) {
            if (FeatureConfig.DoubleDrop.Coal.enabled) {
                JeiCompat.addValueInfoPage(registration, ModItems.coalPickaxe, "coal_double_drop", FeatureConfig.DoubleDrop.Coal.chance * 100);
            }
            if (FeatureConfig.DoubleDrop.Emerald.enabled) {
                JeiCompat.addValueInfoPage(registration, ModItems.emeraldPickaxe, "emerald_double_drop", FeatureConfig.DoubleDrop.Emerald.chance * 100);
            }
            if (FeatureConfig.DoubleDrop.Lapis.enabled) {
                JeiCompat.addValueInfoPage(registration, ModItems.lapisPickaxe, "lapis_double_drop", FeatureConfig.DoubleDrop.Lapis.chance * 100);
            }
            if (FeatureConfig.DoubleDrop.Quartz.enabled) {
                JeiCompat.addValueInfoPage(registration, ModItems.quartzPickaxe, "quartz_double_drop", FeatureConfig.DoubleDrop.Quartz.chance * 100);
            }
            if (FeatureConfig.DoubleDrop.Redstone.enabled) {
                JeiCompat.addValueInfoPage(registration, ModItems.redstonePickaxe, "redstone_double_drop", FeatureConfig.DoubleDrop.Redstone.chance * 100);
            }
        }
    }

    public static boolean isMoreVanillaLibLoaded() {
        return ModList.get().isLoaded(MODID);
    }
}
