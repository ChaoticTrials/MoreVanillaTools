package de.melanx.MoreVanillaTools.items;

import de.melanx.MoreVanillaTools.compat.LibCompat;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

public class SwordBase extends SwordItem implements BaseTool {

    private final ToolMaterials tier;

    public SwordBase(ToolMaterials tier, int attackDamageModifier, float attackSpeedModifier, Properties properties) {
        super(tier, attackDamageModifier, attackSpeedModifier, properties);

        this.tier = tier;
    }

    @Nonnull
    public ToolMaterials getTier() {
        return this.tier;
    }

    @Override
    public int getEnchantmentLevel(ItemStack stack, Enchantment enchantment) {
        if (enchantment == Enchantments.KNOCKBACK && stack.getItem() instanceof SwordBase item && item.tier == ToolMaterials.SLIME) {
            return 3;
        }

        return super.getEnchantmentLevel(stack, enchantment);
    }

    @Override
    public void appendHoverText(@Nonnull ItemStack stack, @Nullable Level level, @Nonnull List<Component> tooltip, @Nonnull TooltipFlag flag) {
        if (LibCompat.isMoreVanillaLibLoaded()) {
            LibCompat.editHoverText(this, stack, level, tooltip, flag);
        }

        super.appendHoverText(stack, level, tooltip, flag);
    }
}
