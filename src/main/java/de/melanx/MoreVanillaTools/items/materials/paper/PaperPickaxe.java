package de.melanx.MoreVanillaTools.items.materials.paper;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.PickaxeBase;

public class PaperPickaxe extends PickaxeBase {

    private static final int DAMAGE = 1;
    private static final float SPEED = -2.8F;

    public PaperPickaxe() {
        super("paper_pickaxe", ItemTiers.PAPER_TIER, DAMAGE, SPEED);
    }
}
