package de.melanx.MoreVanillaTools.util;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.*;
import de.melanx.morevanillalib.util.ToolUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.AbstractSkeletonEntity;
import net.minecraft.entity.monster.MagmaCubeEntity;
import net.minecraft.entity.monster.SlimeEntity;
import net.minecraft.entity.monster.WitherSkeletonEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class Events {

    public Events() {
        MinecraftForge.EVENT_BUS.addListener(this::livingDamage);
        MinecraftForge.EVENT_BUS.addListener(this::livingDrops);
    }

    @SubscribeEvent
    public void livingDamage(LivingDamageEvent event) {
        Entity player = event.getSource().getTrueSource();
        if (player instanceof PlayerEntity) {
            Item heldItem = ((PlayerEntity) player).getHeldItemMainhand().getItem();
            ItemTiers toolType = getItemTiers(heldItem);
            if (toolType != null) {
                LivingEntity entity = event.getEntityLiving();
                switch (toolType) {
                    case BONE:
                        if (entity instanceof AbstractSkeletonEntity)
                            ToolUtil.moreDamage(event);
                    case FIERY:
                        if (entity instanceof MagmaCubeEntity)
                            ToolUtil.moreDamage(event);
                    case SLIME:
                        if (entity instanceof SlimeEntity && !(entity instanceof MagmaCubeEntity))
                            ToolUtil.moreDamage(event);
                }
            }
        }
    }

    @SubscribeEvent
    public void livingDrops(LivingDropsEvent event) {
        if (ToolUtil.isPlayerKill(event)) {
            Item weapon = ((PlayerEntity) event.getSource().getTrueSource()).getHeldItemMainhand().getItem();
            ItemTiers toolType = getItemTiers(weapon);

            if (toolType == ItemTiers.BONE)
                ToolUtil.headDrop(event, event.getEntity() instanceof WitherSkeletonEntity ? Items.WITHER_SKELETON_SKULL : Items.SKELETON_SKULL);
        }
    }

    private static ItemTiers getItemTiers(Item heldItem) {
        ItemTiers toolType = null;
        if (heldItem instanceof SwordBase) toolType = ((SwordBase) heldItem).getToolType();
        if (heldItem instanceof AxeBase) toolType = ((AxeBase) heldItem).getToolType();
        if (heldItem instanceof PickaxeBase) toolType = ((PickaxeBase) heldItem).getToolType();
        if (heldItem instanceof ShovelBase) toolType = ((ShovelBase) heldItem).getToolType();
        if (heldItem instanceof HoeBase) toolType = ((HoeBase) heldItem).getToolType();
        return toolType;
    }

}
