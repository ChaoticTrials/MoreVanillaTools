package de.melanx.MoreVanillaTools.items.materials.emerald;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.SwordBase;

public class EmeraldSword extends SwordBase {

    private static final int DAMAGE = 2;
    private static final float SPEED = -2.4F;

    public EmeraldSword() {
        super("emerald_sword", ItemTiers.EMERALD_TIER, DAMAGE, SPEED);
    }
}
