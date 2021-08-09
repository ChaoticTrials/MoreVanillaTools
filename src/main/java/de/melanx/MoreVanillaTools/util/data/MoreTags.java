package de.melanx.MoreVanillaTools.util.data;

import de.melanx.MoreVanillaTools.MoreVanillaTools;
import de.melanx.MoreVanillaTools.items.SwordBase;
import de.melanx.morevanillalib.api.BaseToolItem;
import de.melanx.morevanillalib.api.normal.ToolMaterials;
import de.melanx.morevanillalib.data.ModTags;
import io.github.noeppi_noeppi.libx.data.provider.CommonTagsProviderBase;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.ExistingFileHelper;

public class MoreTags extends CommonTagsProviderBase {

    public MoreTags(DataGenerator generator, ExistingFileHelper helper) {
        super(MoreVanillaTools.getInstance(), generator, helper);
    }

    @Override
    public void setup() {

    }

    @Override
    public void defaultItemTags(Item toCheck) {
        ToolMaterials material = null;
        if (toCheck instanceof BaseToolItem item) {
            material = (ToolMaterials) item.getToolMaterial();
        } else if (toCheck instanceof SwordBase item) {
            material = (ToolMaterials) item.getToolType();
        }

        if (material == null) {
            return;
        }

        switch (material) {
            case BONE -> this.item(ModTags.Items.BONE_TOOLS).add(toCheck);
            case COAL -> this.item(ModTags.Items.COAL_TOOLS).add(toCheck);
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
    }
}
