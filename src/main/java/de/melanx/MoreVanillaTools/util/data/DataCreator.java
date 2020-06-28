package de.melanx.MoreVanillaTools.util.data;

import de.melanx.MoreVanillaTools.MoreVanillaTools;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = MoreVanillaTools.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataCreator {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();

        if (event.includeServer()) {
            generator.addProvider(new ItemTags(generator, new BlockTagsProvider(generator)));
            generator.addProvider(new Recipes(generator));
        }
        if (event.includeClient()) {
            generator.addProvider(new ItemModels(generator, helper));
            generator.addProvider(new Languages.English(generator));
            generator.addProvider(new Languages.German(generator));
        }
    }

}
