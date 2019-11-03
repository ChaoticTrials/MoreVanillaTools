package de.melanx.MoreVanillaTools;

import de.melanx.MoreVanillaTools.items.ModItems;
import de.melanx.MoreVanillaTools.util.ConfigHandler;
import de.melanx.MoreVanillaTools.util.CreativeTab;
import de.melanx.MoreVanillaTools.util.Registry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(MoreVanillaTools.MODID)
public class MoreVanillaTools {

    public static MoreVanillaTools instance;

    public static final String MODID = "morevanillatools";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public static final ItemGroup creativeTab = new CreativeTab();

    public MoreVanillaTools() {
        instance = this;

        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, ConfigHandler.SERVER_CONFIG);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);

        ConfigHandler.loadConfig(ConfigHandler.SERVER_CONFIG, FMLPaths.CONFIGDIR.get().resolve("morevanillatools-server.toml"));

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("Setup method registered.");
    }

    private void clientRegistries(final FMLClientSetupEvent event) {
        LOGGER.info("clientRegistries method registered.");
    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {

        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event) {
            ModItems.init();
            for (Item item : Registry.ITEMS_TO_REGISTER) {
                event.getRegistry().register(item);
                LOGGER.debug(item.getRegistryName());
            }

            LOGGER.info("Items registered.");
        }

    }
}
