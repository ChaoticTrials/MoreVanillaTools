package de.melanx.MoreVanillaTools;

import de.melanx.MoreVanillaTools.enchantments.LuckOfCheapRepairing;
import de.melanx.MoreVanillaTools.util.*;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nonnull;

@Mod(MoreVanillaTools.MODID)
public class MoreVanillaTools {

    public static final String MODID = "morevanillatools";
    public static final Logger LOGGER = LogManager.getLogger(MODID);
    public static final ItemGroup creativeTab = new CreativeTab();
    public static MoreVanillaTools instance;

    public MoreVanillaTools() {
        instance = this;

        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, ConfigHandler.SERVER_CONFIG);

        ConfigHandler.loadConfig(ConfigHandler.SERVER_CONFIG, FMLPaths.CONFIGDIR.get().resolve(MODID + "-server.toml"));

        new Events();
        MinecraftForge.EVENT_BUS.register(this);
        Registry.registerTools();
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class EventHandlers {

        @SubscribeEvent
        public static void registerEnchantments(RegistryEvent.Register<Enchantment> event) {
            if (ConfigHandler.enchantments.get()) {
                final IForgeRegistry<Enchantment> registry = event.getRegistry();
                registry.register(new LuckOfCheapRepairing());
            }
        }

        @SubscribeEvent
        public static void registerModifierSerializiers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>> event) {
            event.getRegistry().register(new AutoSmeltModifier.Serializer().setRegistryName(new ResourceLocation(MODID, "auto_smelt")));
        }
    }
}
