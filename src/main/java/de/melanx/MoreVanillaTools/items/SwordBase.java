package de.melanx.MoreVanillaTools.items;

import de.melanx.MoreVanillaTools.compat.LibCompat;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;

import javax.annotation.Nonnull;
import java.util.List;

public class SwordBase extends SwordItem implements BaseTool {

    private final ToolMaterials tier;

    public SwordBase(ToolMaterials tier, Properties properties) {
        super(tier, properties);

        this.tier = tier;
    }

    @Nonnull
    public ToolMaterials getTier() {
        return this.tier;
    }

    @Override
    public int getEnchantmentLevel(@Nonnull ItemStack stack, Holder<Enchantment> enchantment) {
        if (enchantment.is(Enchantments.KNOCKBACK) && stack.getItem() instanceof SwordBase item && item.tier == ToolMaterials.SLIME) {
            return 3;
        }

        return super.getEnchantmentLevel(stack, enchantment);
    }

    @Override
    public void appendHoverText(@Nonnull ItemStack stack, @Nonnull TooltipContext context, @Nonnull List<Component> tooltipComponents, @Nonnull TooltipFlag tooltipFlag) {
        if (LibCompat.isMoreVanillaLibLoaded()) {
            LibCompat.editHoverText(this, stack, context, tooltipComponents, tooltipFlag);
        }

        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }
}
