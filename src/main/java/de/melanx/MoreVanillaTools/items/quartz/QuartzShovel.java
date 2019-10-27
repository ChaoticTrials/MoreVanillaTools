package de.melanx.MoreVanillaTools.items.quartz;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.ShovelBase;

public class QuartzShovel extends ShovelBase {

    private static final int DAMAGE = 1;
    private static final float SPEED = -3.0F;

    public QuartzShovel() {
        super("quartz_shovel", ItemTiers.QUARTZ_TIER, DAMAGE, SPEED);
    }
}
