/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.f2d.dota.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import java.util.function.Function;

import com.f2d.dota.item.SatanicItem;
import com.f2d.dota.item.DivineRapierItem;
import com.f2d.dota.item.DesolatorItem;
import com.f2d.dota.item.ButterflyItem;
import com.f2d.dota.item.BattleFuryItem;
import com.f2d.dota.DotaMod;

public class DotaModItems {
	public static Item BATTLE_FURY;
	public static Item BUTTERFLY;
	public static Item DESOLATOR;
	public static Item DIVINE_RAPIER;
	public static Item SATANIC;

	public static void load() {
		BATTLE_FURY = register("battle_fury", BattleFuryItem::new);
		BUTTERFLY = register("butterfly", ButterflyItem::new);
		DESOLATOR = register("desolator", DesolatorItem::new);
		DIVINE_RAPIER = register("divine_rapier", DivineRapierItem::new);
		SATANIC = register("satanic", SatanicItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> I register(String name, Function<Item.Properties, ? extends I> supplier) {
		return (I) Items.registerItem(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(DotaMod.MODID, name)), (Function<Item.Properties, Item>) supplier);
	}
}