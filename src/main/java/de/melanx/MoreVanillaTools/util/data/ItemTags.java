package de.melanx.MoreVanillaTools.util.data;

import de.melanx.MoreVanillaTools.util.Registry;
import de.melanx.morevanillalib.data.ModTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;

public class ItemTags extends ItemTagsProvider {

    public ItemTags(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void registerTags() {
        getBuilder(ModTags.Items.FIERY).add(Registry.FIERY_SWORD.get())
                .add(Registry.FIERY_AXE.get())
                .add(Registry.FIERY_PICKAXE.get())
                .add(Registry.FIERY_SHOVEL.get())
                .add(Registry.FIERY_HOE.get());
    }

}
