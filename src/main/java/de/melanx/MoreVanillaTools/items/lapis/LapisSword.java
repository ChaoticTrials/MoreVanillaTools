package de.melanx.MoreVanillaTools.items.lapis;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.SwordBase;

public class LapisSword extends SwordBase {

    private static final int DAMAGE = 2;
    private static final float SPEED = -2.4F;

    public LapisSword() {
        super("lapis_sword", ItemTiers.LAPIS_TIER, DAMAGE, SPEED);
    }
}
