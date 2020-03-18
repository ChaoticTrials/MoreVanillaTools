package de.melanx.MoreVanillaTools.util.data;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.util.Events;
import de.melanx.MoreVanillaTools.util.Registry;
import de.melanx.morevanillalib.data.ModTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class ItemTags extends ItemTagsProvider {

    public ItemTags(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void registerTags() {
        for (RegistryObject<Item> registryObject : Registry.ITEMS.getEntries()) {
            Item item = registryObject.get();
            ItemTiers itemTier = Events.getItemTiers(item);
            switch (itemTier) {
                case BONE:
                    getBuilder(ModTags.Items.BONE_TOOLS).add(item);
                    break;
                case COAL:
                    getBuilder(ModTags.Items.COAL_TOOLS).add(item);
                    break;
                case EMERALD:
                    getBuilder(ModTags.Items.EMERALD_TOOLS).add(item);
                    break;
                case ENDER:
                    getBuilder(ModTags.Items.ENDER_TOOLS).add(item);
                    break;
                case FIERY:
                    getBuilder(ModTags.Items.FIERY_TOOLS).add(item);
                    break;
                case GLOWSTONE:
                    getBuilder(ModTags.Items.GLOWSTONE_TOOLS).add(item);
                    break;
                case LAPIS:
                    getBuilder(ModTags.Items.LAPIS_TOOLS).add(item);
                    break;
                case NETHER:
                    getBuilder(ModTags.Items.NETHER_TOOLS).add(item);
                    break;
                case OBSIDIAN:
                    getBuilder(ModTags.Items.OBSIDIAN_TOOLS).add(item);
                    break;
                case PAPER:
                    getBuilder(ModTags.Items.PAPER_TOOLS).add(item);
                    break;
                case PRISMARINE:
                    getBuilder(ModTags.Items.PRISMARINE_TOOLS).add(item);
                    break;
                case QUARTZ:
                    getBuilder(ModTags.Items.QUARTZ_TOOLS).add(item);
                    break;
                case REDSTONE:
                    getBuilder(ModTags.Items.REDSTONE_TOOLS).add(item);
                    break;
                case SLIME:
                    getBuilder(ModTags.Items.SLIME_TOOLS).add(item);
                    break;
            }
        }
    }

}
