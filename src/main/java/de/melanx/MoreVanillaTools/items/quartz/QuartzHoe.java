package de.melanx.MoreVanillaTools.items.quartz;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.HoeBase;

public class QuartzHoe extends HoeBase {

    private static final int SPEED = -2;

    public QuartzHoe() {
        super("quartz_hoe", ItemTiers.QUARTZ_TIER, SPEED);
    }
}
