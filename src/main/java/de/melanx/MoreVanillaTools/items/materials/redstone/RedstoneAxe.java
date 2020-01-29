package de.melanx.MoreVanillaTools.items.materials.redstone;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.AxeBase;

public class RedstoneAxe extends AxeBase {

    private static final float ATTACK_DAMAGE = 6.0F;
    private static final float ATTACK_SPEED = -3.1F;

    public RedstoneAxe() {
        super("redstone_axe", ItemTiers.REDSTONE, ATTACK_DAMAGE, ATTACK_SPEED);
    }

}
