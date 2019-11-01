package de.melanx.MoreVanillaTools.items.materials.emerald;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.ShovelBase;

public class EmeraldShovel extends ShovelBase {

    private static final int DAMAGE = 1;
    private static final float SPEED = -3.0F;

    public EmeraldShovel() {
        super("emerald_shovel", ItemTiers.EMERALD_TIER, DAMAGE, SPEED);
    }
}
