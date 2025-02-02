package de.melanx.MoreVanillaTools;

import de.melanx.MoreVanillaTools.data.ItemModelProvider;
import de.melanx.MoreVanillaTools.data.MoreTags;
import de.melanx.MoreVanillaTools.data.Recipes;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import org.moddingx.libx.datagen.DatagenSystem;
import org.moddingx.libx.mod.ModXRegistration;
import org.moddingx.libx.registration.RegistrationBuilder;

@Mod("morevanillatools")
public final class MoreVanillaTools extends ModXRegistration {

    private static MoreVanillaTools instance;

    public MoreVanillaTools() {
        instance = this;

        DatagenSystem.create(this, system -> {
            system.addDataProvider(ItemModelProvider::new);
            system.addDataProvider(MoreTags::new);
            system.addDataProvider(Recipes::new);
        });
    }

    @Override
    protected void setup(FMLCommonSetupEvent event) {
        // NO-OP
    }

    @Override
    protected void clientSetup(FMLClientSetupEvent event) {
        // NO-OP
    }

    public static MoreVanillaTools getInstance() {
        return instance;
    }

    @Override
    protected void initRegistration(RegistrationBuilder builder) {
        // NO-OP
    }
}
