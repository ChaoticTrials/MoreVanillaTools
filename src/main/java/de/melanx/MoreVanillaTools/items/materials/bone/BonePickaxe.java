package de.melanx.MoreVanillaTools.items.materials.bone;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.PickaxeBase;

public class BonePickaxe extends PickaxeBase {

    private static final int DAMAGE = 0;
    private static final int SPEED = -3;

    public BonePickaxe() {
        super("bone_pickaxe", ItemTiers.BONE, DAMAGE, SPEED);
    }
}
