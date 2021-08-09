package de.melanx.MoreVanillaTools.items;

import de.melanx.morevanillalib.api.IConfigurableTier;
import de.melanx.morevanillalib.api.normal.ToolMaterials;
import de.melanx.morevanillalib.config.FeatureConfig;
import de.melanx.morevanillalib.data.ModTags;
import de.melanx.morevanillalib.util.ComponentUtil;
import de.melanx.morevanillalib.util.ToolUtil;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

public class SwordBase extends SwordItem {

    private final ToolMaterials toolMaterial;

    public SwordBase(ToolMaterials toolMaterial, int damage, Properties properties) {
        super(toolMaterial, damage, toolMaterial.getAttackSpeed(), properties);

        this.toolMaterial = toolMaterial;
    }

    @Override
    public boolean hurtEnemy(@Nonnull ItemStack stack, @Nonnull LivingEntity target, @Nonnull LivingEntity attacker) {
        boolean result = super.hurtEnemy(stack, target, attacker);

        if (!target.level.isClientSide && ModTags.Items.PAPER_TOOLS.contains(this) && FeatureConfig.PaperDamage.enabled
                && target.level.random.nextDouble() < FeatureConfig.PaperDamage.chance) {
            ToolUtil.paperDamage(attacker);
        }

        return result;
    }

    public IConfigurableTier getToolType() {
        return this.toolMaterial;
    }

    @Override
    public void appendHoverText(@Nonnull ItemStack stack, @Nullable Level level, @Nonnull List<Component> tooltip, @Nonnull TooltipFlag flag) {
        if (Screen.hasShiftDown()) {
            tooltip.add(ComponentUtil.getTooltip("durability", this.toolMaterial.getUses()).withStyle(ChatFormatting.GRAY));
            tooltip.add(ComponentUtil.getTooltip("repairing_item", this.toolMaterial.getRepairIngredient().getItems()[0].getItem().getDescription().getString()).withStyle(ChatFormatting.GRAY));
        } else {
            tooltip.add(ComponentUtil.getTooltip("more_information").withStyle(ChatFormatting.ITALIC, ChatFormatting.GRAY));
        }

        super.appendHoverText(stack, level, tooltip, flag);
    }
}
