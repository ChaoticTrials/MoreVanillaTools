package de.melanx.MoreVanillaTools.items;

import de.melanx.MoreVanillaTools.compat.FarmersDelightCompat;
import de.melanx.MoreVanillaTools.compat.LibCompat;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.ItemAbilities;
import net.neoforged.neoforge.common.ItemAbility;

import javax.annotation.Nonnull;
import java.util.List;
import java.util.Set;

public class KnifeBase extends DiggerItem {

    public static final TagKey<Block> MINEABLE_WITH_KNIFE = BlockTags.create(FarmersDelightCompat.location("mineable/knife"));
    public static final ItemAbility KNIFE_DIG = ItemAbility.get("knife_dig");
    public static final ItemAbility KNIFE_HARVEST = ItemAbility.get("knife_harvest");

    private static final Set<ItemAbility> KNIFE_ACTIONS = Set.of(ItemAbilities.SHEARS_CARVE, ItemAbilities.SWORD_DIG, KNIFE_DIG, KNIFE_HARVEST);

    private final ToolMaterials tier;

    public KnifeBase(ToolMaterials tier, Item.Properties properties) {
        super(tier, MINEABLE_WITH_KNIFE, properties);
        this.tier = tier;
    }

    @Nonnull
    @Override
    public ToolMaterials getTier() {
        return this.tier;
    }

    @Override
    public boolean canAttackBlock(@Nonnull BlockState state, @Nonnull Level level, @Nonnull BlockPos pos, @Nonnull Player player) {
        return !player.isCreative();
    }

    @Override
    public void postHurtEnemy(@Nonnull ItemStack stack, @Nonnull LivingEntity target, @Nonnull LivingEntity attacker) {
        stack.hurtAndBreak(1, attacker, EquipmentSlot.MAINHAND);
    }

    @Override
    public boolean isPrimaryItemFor(@Nonnull ItemStack stack, @Nonnull Holder<Enchantment> enchantment) {
        return !enchantment.is(Enchantments.SWEEPING_EDGE) && super.isPrimaryItemFor(stack, enchantment);
    }

    @Override
    public boolean supportsEnchantment(@Nonnull ItemStack stack, @Nonnull Holder<Enchantment> enchantment) {
        return !enchantment.is(Enchantments.SWEEPING_EDGE) && super.supportsEnchantment(stack, enchantment);
    }

    @Override
    public boolean canPerformAction(@Nonnull ItemStack stack, @Nonnull ItemAbility itemAbility) {
        return KNIFE_ACTIONS.contains(itemAbility);
    }

    @Override
    public int getEnchantmentLevel(@Nonnull ItemStack stack, Holder<Enchantment> enchantment) {
        if (enchantment.is(Enchantments.KNOCKBACK) && stack.getItem() instanceof KnifeBase item && item.tier == ToolMaterials.SLIME) {
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
