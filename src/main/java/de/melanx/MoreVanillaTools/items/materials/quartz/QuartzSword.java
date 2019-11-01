package de.melanx.MoreVanillaTools.items.materials.quartz;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.SwordBase;

public class QuartzSword extends SwordBase {

    private static final int DAMAGE = 2;
    private static final float SPEED = -2.6F;

    public QuartzSword() {
        super("quartz_sword", ItemTiers.QUARTZ_TIER, DAMAGE, SPEED);
    }
}
