package de.melanx.MoreVanillaTools.items.base;

import de.melanx.MoreVanillaTools.MoreVanillaTools;
import de.melanx.MoreVanillaTools.util.Registry;
import de.melanx.MoreVanillaTools.util.ToolUtil;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class AxeBase extends AxeItem {

    private final IItemTier mat;

    public AxeBase(String name, IItemTier mat, float ATTACK_DAMAGE, float ATTACK_SPEED) {
        super(mat, ATTACK_DAMAGE, ATTACK_SPEED, new Item.Properties().group(MoreVanillaTools.creativeTab));
        Registry.registerItem(this, name);
        Registry.registerModel(this);

        this.mat = mat;
    }

    @Override
    public boolean onBlockDestroyed(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity entityLiving) {
        ToolUtil.blockDestroyUtil(world, state, pos, entityLiving, mat);
        return super.onBlockDestroyed(stack, world, state, pos, entityLiving);
    }

    @Override
    public ActionResultType onItemUse(ItemUseContext context) {
        ActionResultType result = super.onItemUse(context);
        ToolUtil.itemUseUtil(context, result, mat);
        return result;
    }

    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        ToolUtil.hitEntityUtil(target, attacker, mat);
        return super.hitEntity(stack, target, attacker);
    }
}
