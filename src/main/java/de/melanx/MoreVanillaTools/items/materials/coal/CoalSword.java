package de.melanx.MoreVanillaTools.items.materials.coal;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.SwordBase;

public class CoalSword extends SwordBase {

    private static final int DAMAGE = 2;
    private static final float SPEED = -2.6F;

    public CoalSword() {
        super("coal_sword", ItemTiers.COAL_TIER, DAMAGE, SPEED);
    }
}
