/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.f2d.dota.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
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
	public static Item CRYSTAL_AGILITY;
	public static Item CRYSTAL_ALMIGHTY;
	public static Item CRYSTAL_GLORY;
	public static Item CRYSTAL_INTELLIGENCE;
	public static Item CRYSTAL_POWER;
	public static Item DEEPSLATE_CRYSTAL_AGILITYA;
	public static Item DEEPSLATE_CRYSTAL_ALMIGHTY;
	public static Item DEEPSLATE_CRYSTAL_GLORY;
	public static Item DEEPSLATE_CRYSTAL_INTELLIGENCE;
	public static Item DEEPSLATE_CRYSTAL_POWER;

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
		CRYSTAL_AGILITY = register("crystal_agility", CrystalAgilityItem::new);
		CRYSTAL_ALMIGHTY = register("crystal_almighty", CrystalAlmightyItem::new);
		CRYSTAL_GLORY = register("crystal_glory", CrystalGloryItem::new);
		CRYSTAL_INTELLIGENCE = register("crystal_intelligence", CrystalIntelligenceItem::new);
		CRYSTAL_POWER = register("crystal_power", CrystalPowerItem::new);
		DEEPSLATE_CRYSTAL_AGILITYA = block(DotaModBlocks.DEEPSLATE_CRYSTAL_AGILITYA, "deepslate_crystal_agilitya", new Item.Properties().rarity(Rarity.RARE));
		DEEPSLATE_CRYSTAL_ALMIGHTY = block(DotaModBlocks.DEEPSLATE_CRYSTAL_ALMIGHTY, "deepslate_crystal_almighty", new Item.Properties().rarity(Rarity.EPIC));
		DEEPSLATE_CRYSTAL_GLORY = block(DotaModBlocks.DEEPSLATE_CRYSTAL_GLORY, "deepslate_crystal_glory", new Item.Properties().rarity(Rarity.RARE));
		DEEPSLATE_CRYSTAL_INTELLIGENCE = block(DotaModBlocks.DEEPSLATE_CRYSTAL_INTELLIGENCE, "deepslate_crystal_intelligence", new Item.Properties().rarity(Rarity.RARE));
		DEEPSLATE_CRYSTAL_POWER = block(DotaModBlocks.DEEPSLATE_CRYSTAL_POWER, "deepslate_crystal_power", new Item.Properties().rarity(Rarity.RARE));
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> I register(String name, Function<Item.Properties, ? extends I> supplier) {
		return (I) Items.registerItem(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(DotaMod.MODID, name)), (Function<Item.Properties, Item>) supplier);
	}

	private static Item block(Block block, String name) {
		return block(block, name, new Item.Properties());
	}

	private static Item block(Block block, String name, Item.Properties properties) {
		return Items.registerItem(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(DotaMod.MODID, name)), prop -> new BlockItem(block, prop), properties);
	}
}