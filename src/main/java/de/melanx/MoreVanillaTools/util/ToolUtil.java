package de.melanx.MoreVanillaTools.util;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.monster.AbstractSkeletonEntity;
import net.minecraft.entity.monster.WitherSkeletonEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

import java.util.Random;

public class ToolUtil {

    public static void moreDamage(LivingDamageEvent event) {
        LivingEntity entity = event.getEntityLiving();
        Random rand = event.getEntityLiving().world.rand;

        int chance = ConfigHandler.extraDamageChance.get();
        if (entity instanceof AbstractSkeletonEntity && rand.nextInt(1000) < chance && ConfigHandler.extraDamage.get()) {
            event.setAmount(event.getAmount() * (rand.nextInt(26) / 10 + 1));
        }
    }

    public static void headDrop(LivingDropsEvent event, Item item) {
        if (event.isRecentlyHit() && event.getSource().getTrueSource() != null && event.getSource().getTrueSource() instanceof PlayerEntity) {
            ItemStack weapon = ((PlayerEntity) event.getSource().getTrueSource()).getHeldItemMainhand();
            if (!weapon.isEmpty() && weapon.getItem() == item) {
                Random rand = event.getEntityLiving().world.rand;
                int looting = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, weapon);

                int chance = ConfigHandler.headDropChance.get();
                if (ConfigHandler.headDrop.get() && event.getEntityLiving() instanceof AbstractSkeletonEntity && rand.nextInt(1000) < chance + looting)
                    addDrop(event, new ItemStack(event.getEntity() instanceof WitherSkeletonEntity ? Items.WITHER_SKELETON_SKULL : Items.SKELETON_SKULL));
            }
        }
    }

    private static void addDrop(LivingDropsEvent event, ItemStack drop) {
        ItemEntity entityitem = new ItemEntity(event.getEntityLiving().world, event.getEntityLiving().posX, event.getEntityLiving().posY, event.getEntityLiving().posZ, drop);
        entityitem.setPickupDelay(10);
        event.getDrops().add(entityitem);
    }

    public static void itemUseUtil(ItemUseContext context, ActionResultType result, IItemTier mat) {
        if (result == ActionResultType.SUCCESS) {
            extraDrop(context.getWorld(), context.getPos(), mat);
            int chance = ConfigHandler.damageByPaperToolsChance.get();
            if (mat == ItemTiers.PAPER_TIER && ConfigHandler.damageByPaperTools.get() && new Random().nextInt(1000) < chance)
                context.getPlayer().attackEntityFrom(ModDamageSource.PAPER_CUT, new Random().nextInt(ConfigHandler.maxPaperDamage.get()) + ConfigHandler.minPaperDamage.get());
        }
    }

    public static void blockDestroyUtil(World world, BlockState state, BlockPos pos, LivingEntity entityLiving, IItemTier mat) {
        if (!world.isRemote && state.getBlockHardness(world, pos) != 0.0F) {
            extraDrop(world, pos, mat);
            int chance = ConfigHandler.damageByPaperToolsChance.get();
            if (mat == ItemTiers.PAPER_TIER && ConfigHandler.damageByPaperTools.get() && new Random().nextInt(1000) < chance)
                entityLiving.attackEntityFrom(ModDamageSource.PAPER_CUT, new Random().nextInt(ConfigHandler.maxPaperDamage.get()) + ConfigHandler.minPaperDamage.get());
        }
    }

    private static void extraDrop(World world, BlockPos pos, IItemTier mat) {
        int chance = ConfigHandler.extraDropChance.get();
        if (new Random().nextInt(1000) < chance && ConfigHandler.extraDrop.get()) {
            ItemStack itemStack = mat.getRepairMaterial().getMatchingStacks()[0];
            world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), itemStack));
        }
    }

    public static void hitEntityUtil(LivingEntity target, LivingEntity attacker, IItemTier mat) {
        extraDrop(target.getEntityWorld().getWorld(), target.getPosition(), mat);

        int cutChance = ConfigHandler.damageByPaperToolsChance.get();
        if (mat == ItemTiers.PAPER_TIER && ConfigHandler.damageByPaperTools.get() && new Random().nextInt(1000) < cutChance)
            attacker.attackEntityFrom(ModDamageSource.PAPER_CUT, new Random().nextInt(ConfigHandler.maxPaperDamage.get() + 1) + ConfigHandler.minPaperDamage.get());

        ToolUtil.extraDrop(target.getEntityWorld(), target.getPosition(), mat);
    }

}
