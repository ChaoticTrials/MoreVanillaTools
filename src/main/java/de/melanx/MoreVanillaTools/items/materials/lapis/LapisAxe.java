package de.melanx.MoreVanillaTools.items.materials.lapis;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.AxeBase;

public class LapisAxe extends AxeBase {

    private static final int ATTACK_DAMAGE = 0;
    private static final float ATTACK_SPEED = 2.8F;

    public LapisAxe() {
        super("lapis_axe", ItemTiers.LAPIS_TIER, ATTACK_DAMAGE, ATTACK_SPEED);
    }
}
