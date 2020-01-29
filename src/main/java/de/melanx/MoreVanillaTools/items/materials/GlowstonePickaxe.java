package de.melanx.MoreVanillaTools.items.materials;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.PickaxeBase;

public class GlowstonePickaxe extends PickaxeBase {

    private static final int DAMAGE = 0;
    private static final float SPEED = -2.6F;

    public GlowstonePickaxe() {
        super(ItemTiers.GLOWSTONE, DAMAGE, SPEED);
    }

    // TODO everytime drop 4 dust from block
}
