package de.melanx.MoreVanillaTools.items.materials.bone;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.HoeBase;

public class BoneHoe extends HoeBase {

    private static final int SPEED = -2;

    public BoneHoe() {
        super("bone_hoe", ItemTiers.BONE, SPEED);
    }
}
