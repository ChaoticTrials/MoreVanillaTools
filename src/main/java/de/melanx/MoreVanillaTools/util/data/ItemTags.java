package de.melanx.MoreVanillaTools.util.data;

import de.melanx.MoreVanillaTools.util.Events;
import de.melanx.MoreVanillaTools.util.Registry;
import de.melanx.morevanillalib.api.ToolMaterials;
import de.melanx.morevanillalib.data.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class ItemTags extends ItemTagsProvider {

    public ItemTags(DataGenerator generator, BlockTagsProvider blockTags) {
        super(generator, blockTags);
    }

    @Override
    protected void registerTags() {
        for (RegistryObject<Item> registryObject : Registry.ITEMS.getEntries()) {
            Item item = registryObject.get();
            ToolMaterials itemTier = Events.getToolMaterials(item);
            switch (itemTier) {
                case BONE:
                    getOrCreateBuilder(ModTags.Items.BONE_TOOLS).add(item);
                    break;
                case COAL:
                    getOrCreateBuilder(ModTags.Items.COAL_TOOLS).add(item);
                    break;
                case EMERALD:
                    getOrCreateBuilder(ModTags.Items.EMERALD_TOOLS).add(item);
                    break;
                case ENDER:
                    getOrCreateBuilder(ModTags.Items.ENDER_TOOLS).add(item);
                    break;
                case FIERY:
                    getOrCreateBuilder(ModTags.Items.FIERY_TOOLS).add(item);
                    break;
                case GLOWSTONE:
                    getOrCreateBuilder(ModTags.Items.GLOWSTONE_TOOLS).add(item);
                    break;
                case LAPIS:
                    getOrCreateBuilder(ModTags.Items.LAPIS_TOOLS).add(item);
                    break;
                case NETHER:
                    getOrCreateBuilder(ModTags.Items.NETHER_TOOLS).add(item);
                    break;
                case OBSIDIAN:
                    getOrCreateBuilder(ModTags.Items.OBSIDIAN_TOOLS).add(item);
                    break;
                case PAPER:
                    getOrCreateBuilder(ModTags.Items.PAPER_TOOLS).add(item);
                    break;
                case PRISMARINE:
                    getOrCreateBuilder(ModTags.Items.PRISMARINE_TOOLS).add(item);
                    break;
                case QUARTZ:
                    getOrCreateBuilder(ModTags.Items.QUARTZ_TOOLS).add(item);
                    break;
                case REDSTONE:
                    getOrCreateBuilder(ModTags.Items.REDSTONE_TOOLS).add(item);
                    break;
                case SLIME:
                    getOrCreateBuilder(ModTags.Items.SLIME_TOOLS).add(item);
                    break;
            }
        }
    }

}
