package de.melanx.MoreVanillaTools.data;

import de.melanx.MoreVanillaTools.items.*;
import de.melanx.morevanillalib.data.ModTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.moddingx.libx.annotation.data.Datagen;
import org.moddingx.libx.datagen.provider.CommonTagsProviderBase;
import org.moddingx.libx.mod.ModX;

@Datagen
public class MoreTags extends CommonTagsProviderBase {

    public MoreTags(ModX mod, DataGenerator generator, ExistingFileHelper helper) {
        super(mod, generator, helper);
    }

    @Override
    public void setup() {

    }

    @Override
    public void defaultItemTags(Item toCheck) {
        ToolMaterials material = null;
        if (toCheck instanceof BaseTool item) {
            material = item.getTier();
        }

        if (material == null) {
            return;
        }

        switch (material) {
            case BONE -> this.item(ModTags.Items.BONE_TOOLS).add(toCheck);
            case COAL -> this.item(ModTags.Items.COAL_TOOLS).add(toCheck);
            case COPPER -> this.item(ModTags.Items.COPPER_TOOLS).add(toCheck);
            case EMERALD -> this.item(ModTags.Items.EMERALD_TOOLS).add(toCheck);
            case ENDER -> this.item(ModTags.Items.ENDER_TOOLS).add(toCheck);
            case FIERY -> this.item(ModTags.Items.FIERY_TOOLS).add(toCheck);
            case GLOWSTONE -> this.item(ModTags.Items.GLOWSTONE_TOOLS).add(toCheck);
            case LAPIS -> this.item(ModTags.Items.LAPIS_TOOLS).add(toCheck);
            case NETHER -> this.item(ModTags.Items.NETHER_TOOLS).add(toCheck);
            case OBSIDIAN -> this.item(ModTags.Items.OBSIDIAN_TOOLS).add(toCheck);
            case PAPER -> this.item(ModTags.Items.PAPER_TOOLS).add(toCheck);
            case PRISMARINE -> this.item(ModTags.Items.PRISMARINE_TOOLS).add(toCheck);
            case QUARTZ -> this.item(ModTags.Items.QUARTZ_TOOLS).add(toCheck);
            case REDSTONE -> this.item(ModTags.Items.REDSTONE_TOOLS).add(toCheck);
            case SLIME -> this.item(ModTags.Items.SLIME_TOOLS).add(toCheck);
        }

        TagsProvider.TagAppender<Item> swords = this.item(Tags.Items.TOOLS_SWORDS);
        TagsProvider.TagAppender<Item> shovels = this.item(Tags.Items.TOOLS_SHOVELS);
        TagsProvider.TagAppender<Item> pickaxes = this.item(Tags.Items.TOOLS_PICKAXES);
        TagsProvider.TagAppender<Item> axes = this.item(Tags.Items.TOOLS_AXES);
        TagsProvider.TagAppender<Item> hoes = this.item(Tags.Items.TOOLS_HOES);

        if (toCheck instanceof SwordBase) {
            swords.add(toCheck);
        }

        if (toCheck instanceof ShovelBase) {
            shovels.add(toCheck);
        }

        if (toCheck instanceof PickaxeBase) {
            pickaxes.add(toCheck);
        }

        if (toCheck instanceof AxeBase) {
            axes.add(toCheck);
        }

        if (toCheck instanceof HoeBase) {
            hoes.add(toCheck);
        }
    }
}
