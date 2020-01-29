package de.melanx.MoreVanillaTools.items.materials.bone;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.ShovelBase;

public class BoneShovel extends ShovelBase {

    private static final float DAMAGE = 1.5F;
    private static final float SPEED = -3.2F;

    public BoneShovel() {
        super("bone_shovel", ItemTiers.BONE, DAMAGE, SPEED);
    }
}
