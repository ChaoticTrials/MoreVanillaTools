package de.melanx.MoreVanillaTools.util.data;

import de.melanx.MoreVanillaTools.MoreVanillaTools;
import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.*;
import de.melanx.MoreVanillaTools.util.Registry;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.fml.RegistryObject;

public class Languages {

    public static class English extends LanguageProvider {
        public English(DataGenerator generator) {
            super(generator, MoreVanillaTools.MODID, "en_us");
        }

        @Override
        protected void addTranslations() {
            add("itemGroup.morevanillatools", "MoreVanillaTools");
            add("enchantment.morevanillatools.repairing_luck.repairing_luck", "Luck of Cheap Repairing");
            add("enchantment.morevanillatools.repairing_luck.desc", "Reduces the repair costs in the anvil to a minimum.");
            add("death.attack.paperCut", "%1$s was struck down by paper.");
            for (RegistryObject<Item> object : Registry.ITEMS.getEntries()) {
                Item item = object.get();
                String name = item.getRegistryName().getPath().split("_")[0];
                add(item, Languages.capitalize(name) + " " + getToolTypeName(item));
            }
        }

        private static String getToolTypeName(Item item) {
            if (item instanceof SwordBase)
                return "Sword";
            else if (item instanceof AxeBase)
                return "Axe";
            else if (item instanceof PickaxeBase)
                return "Pickaxe";
            else if (item instanceof ShovelBase)
                return "Shovel";
            else if (item instanceof HoeBase)
                return "Hoe";
            return null;
        }
    }

    public static class German extends LanguageProvider {
        public German(DataGenerator generator) {
            super(generator, MoreVanillaTools.MODID, "de_de");
        }

        @Override
        protected void addTranslations() {
            add("enchantment.morevanillatools.repairing_luck", "Gl\u00FCck der billigen Reparatur");
            add("enchantment.morevanillatools.repairing_luck.desc", "Verringert die Reperaturkosten im Amboss auf ein Minimum.");
            add("death.attack.paperCut", "%1$s wurde durch Papier niedergestreckt.");
            for (RegistryObject<Item> object : Registry.ITEMS.getEntries()) {
                Item item = object.get();
                add(item, getGermanMaterialName(item) + getToolTypeName(item));
            }
        }

        private static String getGermanMaterialName(Item item) {
            ItemTiers type = null;
            if (item instanceof SwordBase)
                type = ((SwordBase) item).getToolType();
            else if (item instanceof AxeBase)
                type = ((AxeBase) item).getToolType();
            else if (item instanceof PickaxeBase)
                type = ((PickaxeBase) item).getToolType();
            else if (item instanceof ShovelBase)
                type = ((ShovelBase) item).getToolType();
            else if (item instanceof HoeBase)
                type = ((HoeBase) item).getToolType();
            switch (type) {
                case BONE:
                    return "Knochen";
                case COAL:
                    return "Kohle";
                case EMERALD:
                    return "Smaragd";
                case ENDER:
                    return "Ender";
                case FIERY:
                    return "Feuer";
                case GLOWSTONE:
                    return "Glowstone";
                case LAPIS:
                    return "Lapis";
                case NETHER:
                    return "Nether";
                case OBSIDIAN:
                    return "Obsidian";
                case PAPER:
                    return "Papier";
                case PRISMARINE:
                    return "Prismarin";
                case QUARTZ:
                    return "Netherquartz";
                case REDSTONE:
                    return "Redstone";
                case SLIME:
                    return "Schleim";
                default:
                    return null;
            }
        }

        private static String getToolTypeName(Item item) {
            if (item instanceof SwordBase)
                return "schwert";
            else if (item instanceof AxeBase)
                return "axt";
            else if (item instanceof PickaxeBase)
                return "spitzhacke";
            else if (item instanceof ShovelBase)
                return "schaufel";
            else if (item instanceof HoeBase)
                return "hacke";
            return null;
        }
    }

    private static String capitalize(String string) {
        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }

}
