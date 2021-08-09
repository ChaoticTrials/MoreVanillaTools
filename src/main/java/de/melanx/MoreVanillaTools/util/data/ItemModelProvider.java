package de.melanx.MoreVanillaTools.util.data;

import de.melanx.MoreVanillaTools.MoreVanillaTools;
import io.github.noeppi_noeppi.libx.data.provider.ItemModelProviderBase;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemModelProvider extends ItemModelProviderBase {

    public ItemModelProvider(DataGenerator generator, ExistingFileHelper helper) {
        super(MoreVanillaTools.getInstance(), generator, helper);
    }

    @Override
    protected void setup() {

    }
}
