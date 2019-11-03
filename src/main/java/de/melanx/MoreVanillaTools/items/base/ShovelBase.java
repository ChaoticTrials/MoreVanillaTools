package de.melanx.MoreVanillaTools.items.base;

import de.melanx.MoreVanillaTools.MoreVanillaTools;
import de.melanx.MoreVanillaTools.util.ModDamageSource;
import de.melanx.MoreVanillaTools.util.Registry;
import de.melanx.MoreVanillaTools.util.ToolUtil;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ShovelBase extends ShovelItem {

    private final IItemTier mat;

    public ShovelBase(String name, IItemTier mat, float damage, float speed) {
        super(mat, damage, speed, new Item.Properties().group(MoreVanillaTools.creativeTab));
        Registry.registerItem(this, name);
        Registry.registerModel(this);

        this.mat = mat;
    }

    @Override
    public boolean onBlockDestroyed(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity entityLiving) {
        return ToolUtil.damageItem(stack, world, state, pos, entityLiving, mat);
    }

    @Override
    public ActionResultType onItemUse(ItemUseContext context) {
        World world = context.getWorld();
        BlockPos pos = context.getPos();
        if (context.getFace() != Direction.DOWN && world.getBlockState(pos.up()).isAir(world, pos.up())) {
            BlockState blockstate = field_195955_e.get(world.getBlockState(pos).getBlock());
            if (blockstate != null) {
                PlayerEntity playerentity = context.getPlayer();
                world.playSound(playerentity, pos, SoundEvents.ITEM_SHOVEL_FLATTEN, SoundCategory.BLOCKS, 1.0F, 1.0F);
                if (ToolUtil.paperDamage(mat)) playerentity.attackEntityFrom(ModDamageSource.PAPER_CUT, 1);
                return ToolUtil.itemUsed(context, world, pos, blockstate, playerentity, mat);
            }
        }

        return ActionResultType.PASS;
    }

}
