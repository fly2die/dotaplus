package com.f2d.dota.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CrystalAlmightyItem extends Item {
	public CrystalAlmightyItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC));
	}
}