package de.melanx.MoreVanillaTools.items;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nonnull;

public class ObsidianPickaxe extends PickaxeBase {

    public ObsidianPickaxe(ToolMaterials tier, float attackDamageModifier, float attackSpeedModifier, Properties properties) {
        super(tier, attackDamageModifier, attackSpeedModifier, properties);
    }

    @Override
    public float getDestroySpeed(@Nonnull ItemStack stack, BlockState state) {
        if (state.getBlock() == Blocks.OBSIDIAN) {
            int efficiencyLevel = stack.getEnchantmentLevel(Enchantments.BLOCK_EFFICIENCY);
            return 15.0F * (efficiencyLevel / 3.5F + 1);
        } else {
            return super.getDestroySpeed(stack, state);
        }
    }
}
