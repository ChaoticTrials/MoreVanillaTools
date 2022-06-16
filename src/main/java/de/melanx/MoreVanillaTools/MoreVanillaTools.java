package de.melanx.MoreVanillaTools;

import de.melanx.MoreVanillaTools.util.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import org.moddingx.libx.mod.ModXRegistration;
import org.moddingx.libx.registration.RegistrationBuilder;

import javax.annotation.Nonnull;

@Mod("morevanillatools")
public final class MoreVanillaTools extends ModXRegistration {

    private static MoreVanillaTools instance;

    public MoreVanillaTools() {
        super(new CreativeModeTab("morevanillatools") {
            @Nonnull
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(ModItems.redstonePickaxe);
            }
        });
        instance = this;
    }

    @Override
    protected void setup(FMLCommonSetupEvent event) {

    }

    @Override
    protected void clientSetup(FMLClientSetupEvent event) {

    }

    public static MoreVanillaTools getInstance() {
        return instance;
    }

    @Override
    protected void initRegistration(RegistrationBuilder builder) {

    }
}
