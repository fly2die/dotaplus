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

import com.f2d.dota.item.*;
import com.f2d.dota.DotaMod;

public class DotaModItems {
	public static Item BATTLE_FURY;
	public static Item BUTTERFLY;
	public static Item DESOLATOR;
	public static Item DIVINE_RAPIER;
	public static Item SATANIC;
	public static Item ABYSSAL_BLADE;
	public static Item ECHO_SABRE;
	public static Item FALCONE_BLADE;
	public static Item WITCH_BLADE;
	public static Item CRYSTALYS;
	public static Item MONKEY_KING_BAR;
	public static Item SILVER_EDGE;
	public static Item DIFFUSAL_BLADE;
	public static Item HEAVENS_HALBERD;
	public static Item SHADOW_BLADE;
	public static Item PARASMA;

	public static void load() {
		BATTLE_FURY = register("battle_fury", BattleFuryItem::new);
		BUTTERFLY = register("butterfly", ButterflyItem::new);
		DESOLATOR = register("desolator", DesolatorItem::new);
		DIVINE_RAPIER = register("divine_rapier", DivineRapierItem::new);
		SATANIC = register("satanic", SatanicItem::new);
		ABYSSAL_BLADE = register("abyssal_blade", AbyssalBladeItem::new);
		ECHO_SABRE = register("echo_sabre", EchoSabreItem::new);
		FALCONE_BLADE = register("falcone_blade", FalconeBladeItem::new);
		WITCH_BLADE = register("witch_blade", WitchBladeItem::new);
		CRYSTALYS = register("crystalys", CrystalysItem::new);
		MONKEY_KING_BAR = register("monkey_king_bar", MonkeyKingBarItem::new);
		SILVER_EDGE = register("silver_edge", SilverEdgeItem::new);
		DIFFUSAL_BLADE = register("diffusal_blade", DiffusalBladeItem::new);
		HEAVENS_HALBERD = register("heavens_halberd", HeavensHalberdItem::new);
		SHADOW_BLADE = register("shadow_blade", ShadowBladeItem::new);
		PARASMA = register("parasma", ParasmaItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> I register(String name, Function<Item.Properties, ? extends I> supplier) {
		return (I) Items.registerItem(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(DotaMod.MODID, name)), (Function<Item.Properties, Item>) supplier);
	}
}