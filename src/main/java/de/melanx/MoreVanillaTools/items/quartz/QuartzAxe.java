package de.melanx.MoreVanillaTools.items.quartz;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.AxeBase;

public class QuartzAxe extends AxeBase {

    private static final int ATTACK_DAMAGE = 0;
    private static final float ATTACK_SPEED = 2.8F;

    public QuartzAxe() {
        super("quartz_axe", ItemTiers.QUARTZ_TIER, ATTACK_DAMAGE, ATTACK_SPEED);
    }
}
