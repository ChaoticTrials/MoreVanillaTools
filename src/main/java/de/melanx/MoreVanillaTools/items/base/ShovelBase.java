package de.melanx.MoreVanillaTools.items.base;

import de.melanx.MoreVanillaTools.MoreVanillaTools;
import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.util.Util;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.ShovelItem;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ShovelBase extends ShovelItem {

    private final ItemTiers mat;

    public ShovelBase(ItemTiers mat, float damage, float speed) {
        super(mat, damage, speed, new Item.Properties().group(MoreVanillaTools.creativeTab));

        this.mat = mat;
    }

    @Override
    public boolean onBlockDestroyed(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity entityLiving) {
        Util.blockDestroyUtil(world, state, pos, entityLiving, this.getToolType());
        return super.onBlockDestroyed(stack, world, state, pos, entityLiving);
    }

    @Override
    public ActionResultType onItemUse(ItemUseContext context) {
        ActionResultType result = super.onItemUse(context);
        Util.itemUseUtil(context, result, this.getToolType());
        return result;
    }

    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        Util.hitEntityUtil(target, attacker, this.getToolType());
        return super.hitEntity(stack, target, attacker);
    }

    public ItemTiers getToolType() {
        return this.mat;
    }

}
