package de.melanx.MoreVanillaTools.config;

import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public record ConfigurableMaterial(float speed, float attackDamageBonus, TagKey<Block> incorrectBlockForDrops, int durability, int enchantmentValue) {}
