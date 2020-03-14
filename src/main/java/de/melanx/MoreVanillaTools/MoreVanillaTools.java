package de.melanx.MoreVanillaTools;

import de.melanx.MoreVanillaTools.enchantments.LuckOfCheapRepairing;
import de.melanx.MoreVanillaTools.util.CreativeTab;
import de.melanx.MoreVanillaTools.util.Events;
import de.melanx.MoreVanillaTools.util.Registry;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(MoreVanillaTools.MODID)
public class MoreVanillaTools {

    public static final String MODID = "morevanillatools";
    public static final Logger LOGGER = LogManager.getLogger(MODID);
    public static final ItemGroup creativeTab = new CreativeTab();
    public static MoreVanillaTools instance;

    public MoreVanillaTools() {
        instance = this;

        new Events();
        MinecraftForge.EVENT_BUS.register(this);
        Registry.registerTools();
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class EventHandlers {

        // TODO move to lib in 1.16
        @SubscribeEvent
        public static void registerEnchantments(RegistryEvent.Register<Enchantment> event) {
            final IForgeRegistry<Enchantment> registry = event.getRegistry();
            registry.register(new LuckOfCheapRepairing());
        }
    }
}
