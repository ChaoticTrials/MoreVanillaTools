package de.melanx.MoreVanillaTools.data;

import de.melanx.MoreVanillaTools.MoreVanillaTools;
import de.melanx.MoreVanillaTools.items.*;
import de.melanx.morevanillalib.data.ModTags;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import org.moddingx.libx.datagen.DatagenContext;
import org.moddingx.libx.datagen.provider.tags.CommonTagsProviderBase;

public class MoreTags extends CommonTagsProviderBase {

    public MoreTags(DatagenContext context) {
        super(context);
    }

    @Override
    public void setup() {
        this.block(Blocks.INCORRECT_FOR_HIGHER_TOOL);
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

        TagsProvider.TagAppender<Item> swords = this.item(ItemTags.SWORDS);
        TagsProvider.TagAppender<Item> shovels = this.item(ItemTags.SHOVELS);
        TagsProvider.TagAppender<Item> pickaxes = this.item(ItemTags.PICKAXES);
        TagsProvider.TagAppender<Item> axes = this.item(ItemTags.AXES);
        TagsProvider.TagAppender<Item> hoes = this.item(ItemTags.HOES);

        if (toCheck instanceof SwordBase) {
            swords.add(BuiltInRegistries.ITEM.getResourceKey(toCheck).orElseThrow());
        }

        if (toCheck instanceof ShovelBase) {
            shovels.add(BuiltInRegistries.ITEM.getResourceKey(toCheck).orElseThrow());
        }

        if (toCheck instanceof PickaxeBase) {
            pickaxes.add(BuiltInRegistries.ITEM.getResourceKey(toCheck).orElseThrow());
        }

        if (toCheck instanceof AxeBase) {
            axes.add(BuiltInRegistries.ITEM.getResourceKey(toCheck).orElseThrow());
        }

        if (toCheck instanceof HoeBase) {
            hoes.add(BuiltInRegistries.ITEM.getResourceKey(toCheck).orElseThrow());
        }
    }

    public static class Blocks {
        public static final TagKey<Block> INCORRECT_FOR_HIGHER_TOOL = modTag("incorrect_for_higher_tool");

        private static TagKey<Block> modTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(MoreVanillaTools.getInstance().modid, name));
        }
    }
}
