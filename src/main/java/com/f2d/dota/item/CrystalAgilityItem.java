package com.f2d.dota.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CrystalAgilityItem extends Item {
	public CrystalAgilityItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE));
	}
}