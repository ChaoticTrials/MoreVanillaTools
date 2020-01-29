package de.melanx.MoreVanillaTools.items.materials.bone;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.SwordBase;
import de.melanx.MoreVanillaTools.util.ToolUtil;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class BoneSword extends SwordBase {

    private static final int DAMAGE = 2;
    private static final float SPEED = -2.6F;

    public BoneSword() {
        super("bone_sword", ItemTiers.BONE, DAMAGE, SPEED);
        MinecraftForge.EVENT_BUS.addListener(this::onHitEntity);
        MinecraftForge.EVENT_BUS.addListener(this::onEntityDrops);
    }

    private void onHitEntity(LivingDamageEvent event) {
        ToolUtil.moreDamage(event);
    }

    private void onEntityDrops(LivingDropsEvent event) {
        ToolUtil.headDrop(event, this);
    }
}
