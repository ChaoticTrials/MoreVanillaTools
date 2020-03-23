package de.melanx.MoreVanillaTools.items.base;

import de.melanx.MoreVanillaTools.MoreVanillaTools;
import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.morevanillalib.LibConfigHandler;
import de.melanx.morevanillalib.util.LibDamageSource;
import de.melanx.morevanillalib.util.ToolUtil;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class HoeBase extends HoeItem {

    private final ItemTiers mat;

    public HoeBase(ItemTiers mat, float speed) {
        super(mat, speed, new Item.Properties().group(MoreVanillaTools.creativeTab));

        this.mat = mat;
    }

    @Override
    public ActionResultType onItemUse(ItemUseContext context) {
        ActionResultType result = super.onItemUse(context);
        if (result == ActionResultType.SUCCESS) {
            ToolUtil.extraDrop(context.getWorld(), context.getPos(), mat);
            int chance = LibConfigHandler.damageByPaperToolsChance.get();
            if (this.getToolType() == ItemTiers.PAPER && LibConfigHandler.damageByPaperTools.get() && new Random().nextInt(1000) < chance)
                context.getPlayer().attackEntityFrom(LibDamageSource.PAPER_CUT, new Random().nextInt(LibConfigHandler.maxPaperDamage.get()) + LibConfigHandler.minPaperDamage.get());
        }
        return result;
    }

    @Override
    public boolean onBlockDestroyed(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity entityLiving) {
        if (!world.isRemote && state.getBlockHardness(world, pos) != 0.0F) {
            ToolUtil.extraDrop(world, pos, mat);
            int chance = LibConfigHandler.damageByPaperToolsChance.get();
            if (this.getToolType() == ItemTiers.PAPER && LibConfigHandler.damageByPaperTools.get() && new Random().nextInt(1000) < chance)
                entityLiving.attackEntityFrom(LibDamageSource.PAPER_CUT, new Random().nextInt(LibConfigHandler.maxPaperDamage.get()) + LibConfigHandler.minPaperDamage.get());
        }
        return super.onBlockDestroyed(stack, world, state, pos, entityLiving);
    }

    public ItemTiers getToolType() {
        return this.mat;
    }

}
