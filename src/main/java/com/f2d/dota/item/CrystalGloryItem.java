package com.f2d.dota.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CrystalGloryItem extends Item {
	public CrystalGloryItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE));
	}
}