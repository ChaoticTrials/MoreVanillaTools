package de.melanx.MoreVanillaTools.items.materials.lapis;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.ShovelBase;

public class LapisShovel extends ShovelBase {

    private static final float DAMAGE = 1.5F;
    private static final float SPEED = -3.0F;

    public LapisShovel() {
        super("lapis_shovel", ItemTiers.LAPIS_TIER, DAMAGE, SPEED);
    }
}
