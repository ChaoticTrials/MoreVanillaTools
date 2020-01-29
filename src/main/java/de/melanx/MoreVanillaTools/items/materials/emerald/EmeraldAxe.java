package de.melanx.MoreVanillaTools.items.materials.emerald;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.AxeBase;

public class EmeraldAxe extends AxeBase {

    private static final int ATTACK_DAMAGE = 4;
    private static final float ATTACK_SPEED = -2.8F;

    public EmeraldAxe() {
        super("emerald_axe", ItemTiers.EMERALD, ATTACK_DAMAGE, ATTACK_SPEED);
    }
}
