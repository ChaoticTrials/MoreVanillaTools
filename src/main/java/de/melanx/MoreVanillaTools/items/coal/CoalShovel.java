package de.melanx.MoreVanillaTools.items.coal;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.ShovelBase;

public class CoalShovel extends ShovelBase {

    private static final float DAMAGE = 1.5F;
    private static final float SPEED = -3.2F;

    public CoalShovel() {
        super("coal_shovel", ItemTiers.COAL_TIER, DAMAGE, SPEED);
    }
}
