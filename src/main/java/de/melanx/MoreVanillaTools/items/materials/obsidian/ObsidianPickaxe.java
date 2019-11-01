package de.melanx.MoreVanillaTools.items.materials.obsidian;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.PickaxeBase;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class ObsidianPickaxe extends PickaxeBase {

    private static final int DAMAGE = 0;
    private static final int SPEED = -3;

    public ObsidianPickaxe() {
        super("obsidian_pickaxe", ItemTiers.OBSIDIAN_TIER, DAMAGE, SPEED);
    }

    @Override
    public float getDestroySpeed(@Nonnull ItemStack stack, BlockState state) {
        if (state.getBlock() == Blocks.OBSIDIAN) {
            // TODO efficiency enchantment
            return 15.0F;
        } else {
            Material material = state.getMaterial();
            return material != Material.IRON && material != Material.ANVIL && material != Material.ROCK ? super.getDestroySpeed(stack, state) : this.efficiency;
        }
    }

}
