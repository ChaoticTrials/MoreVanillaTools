package de.melanx.MoreVanillaTools.data;

import de.melanx.MoreVanillaTools.util.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import org.moddingx.libx.datagen.DatagenContext;
import org.moddingx.libx.datagen.provider.model.ItemModelProviderBase;

public class ItemModelProvider extends ItemModelProviderBase {

    public ItemModelProvider(DatagenContext context) {
        super(context);
    }

    @Override
    protected void setup() {
        // NO-OP
    }

    @Override
    protected void defaultItem(ResourceLocation id, Item item) {
        if (item == ModItems.obsidianShard) {
            super.defaultItem(id, item);
        } else {
            this.withExistingParent(id.getPath(), HANDHELD).texture("layer0", ResourceLocation.fromNamespaceAndPath(id.getNamespace(), "item/" + id.getPath()));
        }
    }
}
