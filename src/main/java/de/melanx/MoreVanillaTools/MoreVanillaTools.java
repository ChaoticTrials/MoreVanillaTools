package de.melanx.MoreVanillaTools;

import de.melanx.MoreVanillaTools.util.Events;
import de.melanx.MoreVanillaTools.util.ModItems;
import io.github.noeppi_noeppi.libx.mod.registration.ModXRegistration;
import io.github.noeppi_noeppi.libx.mod.registration.RegistrationBuilder;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

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

        MinecraftForge.EVENT_BUS.register(new Events());
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
        builder.setVersion(1);
    }
}
