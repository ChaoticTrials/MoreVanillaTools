package de.melanx.MoreVanillaTools.items.quartz;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.AxeBase;

public class QuartzAxe extends AxeBase {

    private static final int ATTACK_DAMAGE = 6;
    private static final float ATTACK_SPEED = -3.4F;

    public QuartzAxe() {
        super("quartz_axe", ItemTiers.QUARTZ_TIER, ATTACK_DAMAGE, ATTACK_SPEED);
    }
}
