package de.melanx.MoreVanillaTools.util;

import de.melanx.morevanillalib.api.BaseToolItem;
import de.melanx.morevanillalib.api.IConfigurableTier;
import de.melanx.morevanillalib.api.normal.ToolMaterials;
import de.melanx.morevanillalib.util.ToolUtil;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class Events {

    @SubscribeEvent
    public void livingDamage(LivingDamageEvent event) {
        Entity player = event.getSource().getEntity();
        if (player instanceof Player) {
            Item heldItem = ((Player) player).getMainHandItem().getItem();
            IConfigurableTier toolType = heldItem instanceof BaseToolItem item ? item.getToolMaterial() : null;
            if (toolType != null) {
                LivingEntity entity = event.getEntityLiving();
                if (toolType == ToolMaterials.BONE) {
                    if (entity instanceof AbstractSkeleton) {
                        ToolUtil.moreDamage(event);
                    }
                } else if (toolType == ToolMaterials.ENDER) {
                    if (entity instanceof EnderMan || entity instanceof Endermite) {
                        ToolUtil.moreDamage(event);
                    }
                } else if (toolType == ToolMaterials.FIERY) {
                    if (entity instanceof MagmaCube) {
                        ToolUtil.moreDamage(event);
                    }
                } else if (toolType == ToolMaterials.PRISMARINE) {
                    if (entity instanceof Guardian) {
                        ToolUtil.moreDamage(event);
                    }
                } else if (toolType == ToolMaterials.SLIME) {
                    if (entity instanceof Slime && !(entity instanceof MagmaCube)) {
                        ToolUtil.moreDamage(event);
                    }
                }
            }
        }
    }
}
