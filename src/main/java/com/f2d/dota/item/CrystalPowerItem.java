package com.f2d.dota.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CrystalPowerItem extends Item {
	public CrystalPowerItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE));
	}
}