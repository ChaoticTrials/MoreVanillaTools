package de.melanx.MoreVanillaTools.util.data;

import net.minecraft.block.Block;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.item.Item;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;

public class ModTags {

    public static class Blocks {
        public static final Tag<Block> STORAGE_BLOCKS_GLOWSTONE = tag("storage_blocks/glowstone");

        private static Tag<Block> tag(String name) {
            return new net.minecraft.tags.BlockTags.Wrapper(new ResourceLocation("forge", name));
        }
    }

    public static class Items {
        public static final Tag<Item> STORAGE_BLOCKS_GLOWSTONE = tag("storage_blocks/glowstone");
        public static final Tag<Item> PAPER = tag("paper");

        private static Tag<Item> tag(String name) {
            return new net.minecraft.tags.ItemTags.Wrapper(new ResourceLocation("forge", name));
        }
    }

    public static class BlockTags extends BlockTagsProvider {
        public BlockTags(DataGenerator generator) {
            super(generator);
        }

        @Override
        protected void registerTags() {
            getBuilder(Blocks.STORAGE_BLOCKS_GLOWSTONE).add(net.minecraft.block.Blocks.GLOWSTONE);
        }
    }

    public static class ItemTags extends ItemTagsProvider {
        public ItemTags(DataGenerator generator) {
            super(generator);
        }

        @Override
        protected void registerTags() {
            getBuilder(Items.PAPER).add(net.minecraft.item.Items.PAPER);

            copy(ModTags.Blocks.STORAGE_BLOCKS_GLOWSTONE, ModTags.Items.STORAGE_BLOCKS_GLOWSTONE);
        }
    }

}
