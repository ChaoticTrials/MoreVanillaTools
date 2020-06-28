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
                    func_240522_a_(ModTags.Items.BONE_TOOLS).func_240534_a_(item);
                    break;
                case COAL:
                    func_240522_a_(ModTags.Items.COAL_TOOLS).func_240534_a_(item);
                    break;
                case EMERALD:
                    func_240522_a_(ModTags.Items.EMERALD_TOOLS).func_240534_a_(item);
                    break;
                case ENDER:
                    func_240522_a_(ModTags.Items.ENDER_TOOLS).func_240534_a_(item);
                    break;
                case FIERY:
                    func_240522_a_(ModTags.Items.FIERY_TOOLS).func_240534_a_(item);
                    break;
                case GLOWSTONE:
                    func_240522_a_(ModTags.Items.GLOWSTONE_TOOLS).func_240534_a_(item);
                    break;
                case LAPIS:
                    func_240522_a_(ModTags.Items.LAPIS_TOOLS).func_240534_a_(item);
                    break;
                case NETHER:
                    func_240522_a_(ModTags.Items.NETHER_TOOLS).func_240534_a_(item);
                    break;
                case OBSIDIAN:
                    func_240522_a_(ModTags.Items.OBSIDIAN_TOOLS).func_240534_a_(item);
                    break;
                case PAPER:
                    func_240522_a_(ModTags.Items.PAPER_TOOLS).func_240534_a_(item);
                    break;
                case PRISMARINE:
                    func_240522_a_(ModTags.Items.PRISMARINE_TOOLS).func_240534_a_(item);
                    break;
                case QUARTZ:
                    func_240522_a_(ModTags.Items.QUARTZ_TOOLS).func_240534_a_(item);
                    break;
                case REDSTONE:
                    func_240522_a_(ModTags.Items.REDSTONE_TOOLS).func_240534_a_(item);
                    break;
                case SLIME:
                    func_240522_a_(ModTags.Items.SLIME_TOOLS).func_240534_a_(item);
                    break;
            }
        }
    }

}
