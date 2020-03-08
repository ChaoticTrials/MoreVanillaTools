package de.melanx.MoreVanillaTools.items.materials;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.AxeBase;
import de.melanx.MoreVanillaTools.util.ToolUtil;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class BoneAxe extends AxeBase {

    private static final int ATTACK_DAMAGE = 6;
    private static final float ATTACK_SPEED = -3.4F;

    public BoneAxe() {
        super(ItemTiers.BONE, ATTACK_DAMAGE, ATTACK_SPEED);
        MinecraftForge.EVENT_BUS.addListener(this::onEntityDrops);
    }

    private void onEntityDrops(LivingDropsEvent event) {
        ToolUtil.headDrop(event, this);
    }

}
