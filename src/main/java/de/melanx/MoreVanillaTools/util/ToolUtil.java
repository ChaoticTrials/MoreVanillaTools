package de.melanx.MoreVanillaTools.util;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.monster.AbstractSkeletonEntity;
import net.minecraft.entity.monster.WitherSkeletonEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

import java.util.Random;

public class ToolUtil {

    public static void moreDamage(LivingDamageEvent event) {
        LivingEntity entity = event.getEntityLiving();
        Random rand = event.getEntityLiving().world.rand;

        if (entity instanceof AbstractSkeletonEntity && rand.nextInt(10) <= 2) {
            event.setAmount(event.getAmount() * (rand.nextInt(26) / 10 + 1));
        }
    }

    public static void headDrop(LivingDropsEvent event, Item item) {
        if(event.isRecentlyHit() && event.getSource().getTrueSource() != null && event.getSource().getTrueSource() instanceof PlayerEntity) {
            ItemStack weapon = ((PlayerEntity) event.getSource().getTrueSource()).getHeldItemMainhand();
            if(!weapon.isEmpty() && weapon.getItem() == item) {
                Random rand = event.getEntityLiving().world.rand;
                int looting = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, weapon);

                if(event.getEntityLiving() instanceof AbstractSkeletonEntity && rand.nextInt(26) <= 3 + looting)
                    addDrop(event, new ItemStack(event.getEntity() instanceof WitherSkeletonEntity ? Items.WITHER_SKELETON_SKULL : Items.SKELETON_SKULL));
            }
        }
    }

    private static void addDrop(LivingDropsEvent event, ItemStack drop) {
        ItemEntity entityitem = new ItemEntity(event.getEntityLiving().world, event.getEntityLiving().posX, event.getEntityLiving().posY, event.getEntityLiving().posZ, drop);
        entityitem.setPickupDelay(10);
        event.getDrops().add(entityitem);
    }

}
