package de.melanx.MoreVanillaTools;

import de.melanx.MoreVanillaTools.util.CreativeTab;
import de.melanx.MoreVanillaTools.util.Events;
import de.melanx.MoreVanillaTools.util.Registry;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
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
}
