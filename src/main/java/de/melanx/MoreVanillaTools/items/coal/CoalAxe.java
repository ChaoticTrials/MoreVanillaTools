package de.melanx.MoreVanillaTools.items.coal;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.AxeBase;

public class CoalAxe extends AxeBase {

    private static final int ATTACK_DAMAGE = 0;
    private static final float ATTACK_SPEED = 2.8F;

    public CoalAxe() {
        super("coal_axe", ItemTiers.COAL_TIER, ATTACK_DAMAGE, ATTACK_SPEED);
    }
}
