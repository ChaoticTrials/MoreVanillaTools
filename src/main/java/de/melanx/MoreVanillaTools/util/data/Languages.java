package de.melanx.MoreVanillaTools.util.data;

import de.melanx.MoreVanillaTools.MoreVanillaTools;
import de.melanx.MoreVanillaTools.items.base.*;
import de.melanx.MoreVanillaTools.util.Registry;
import de.melanx.morevanillalib.util.TranslationHelper;
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
            for (RegistryObject<Item> object : Registry.ITEMS.getEntries()) {
                Item item = object.get();
                //noinspection ConstantConditions
                String path = item.getRegistryName().getPath();
                String name = path.split("_")[0];
                String tool = path.split("_")[1];
                add(item, TranslationHelper.capitalize(name) + " " + TranslationHelper.capitalize(tool));
            }
        }
    }

    public static class German extends LanguageProvider {
        public German(DataGenerator generator) {
            super(generator, MoreVanillaTools.MODID, "de_de");
        }

        @Override
        protected void addTranslations() {
            for (RegistryObject<Item> object : Registry.ITEMS.getEntries()) {
                Item item = object.get();
                //noinspection ConstantConditions
                String path = item.getRegistryName().getPath();
                add(item, TranslationHelper.getGermanMaterial(path) + getToolTypeName(item));
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

}
