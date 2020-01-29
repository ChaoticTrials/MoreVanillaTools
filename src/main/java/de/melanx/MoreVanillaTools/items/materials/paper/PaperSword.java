package de.melanx.MoreVanillaTools.items.materials.paper;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.SwordBase;

public class PaperSword extends SwordBase {

    private static final int DAMAGE = 3;
    private static final float SPEED = -2.4F;

    public PaperSword() {
        super("paper_sword", ItemTiers.PAPER, DAMAGE, SPEED);
    }
}
