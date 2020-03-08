package de.melanx.MoreVanillaTools;

import de.melanx.MoreVanillaTools.enchantments.LuckOfCheapRepairing;
import de.melanx.MoreVanillaTools.util.ConfigHandler;
import de.melanx.MoreVanillaTools.util.CreativeTab;
import de.melanx.MoreVanillaTools.util.Registry;
import de.melanx.MoreVanillaTools.util.ToolUtil;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
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

        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, ConfigHandler.SERVER_CONFIG);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addGenericListener(Enchantment.class, this::registerEnchantments);

        ConfigHandler.loadConfig(ConfigHandler.SERVER_CONFIG, FMLPaths.CONFIGDIR.get().resolve(MODID + "-server.toml"));

        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.addListener(ToolUtil::moreDamage);
        Registry.registerTools();
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("Setup method registered.");
    }

    private void registerEnchantments(RegistryEvent.Register<Enchantment> event) {
        if (ConfigHandler.enchantments.get()) {
            final IForgeRegistry<Enchantment> registry = event.getRegistry();
            registry.register(new LuckOfCheapRepairing());
        }
    }
}
