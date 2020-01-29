package de.melanx.MoreVanillaTools.items.materials.obsidian;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.PickaxeBase;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class ObsidianPickaxe extends PickaxeBase {

    private static final int DAMAGE = 0;
    private static final int SPEED = -3;

    public ObsidianPickaxe() {
        super("obsidian_pickaxe", ItemTiers.OBSIDIAN, DAMAGE, SPEED);
    }

    @Override
    public float getDestroySpeed(@Nonnull ItemStack stack, BlockState state) {
        if (state.getBlock() == Blocks.OBSIDIAN) {
            int efficiencyLevel = EnchantmentHelper.getEnchantmentLevel(Enchantment.getEnchantmentByID(18), stack);
            return 15.0F * (efficiencyLevel / 3.5F + 1);
        } else {
            Material material = state.getMaterial();
            return material != Material.IRON && material != Material.ANVIL && material != Material.ROCK ? super.getDestroySpeed(stack, state) : this.efficiency;
        }
    }

}
