/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.f2d.dota.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import com.f2d.dota.DotaMod;

public class DotaModSounds {
	public static SoundEvent ITEM_ABYSSAL_BLADE;
	public static SoundEvent ITEM_BASHER;
	public static SoundEvent ITEM_BATTLE_FURY;
	public static SoundEvent ITEM_BUTTERFLY;
	public static SoundEvent ITEM_DESOLATOR;
	public static SoundEvent ITEM_DIFFUSAL_BLADE;
	public static SoundEvent ITEM_HEAVEN_HALBERD;
	public static SoundEvent ITEM_MKB;
	public static SoundEvent ITEM_SHADOW_BLADE;
	public static SoundEvent ITEM_SILVER_EDGE;

	public static void load() {
		ITEM_ABYSSAL_BLADE = register("item.abyssal_blade", SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("dota", "item.abyssal_blade")));
		ITEM_BASHER = register("item.basher", SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("dota", "item.basher")));
		ITEM_BATTLE_FURY = register("item.battle_fury", SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("dota", "item.battle_fury")));
		ITEM_BUTTERFLY = register("item.butterfly", SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("dota", "item.butterfly")));
		ITEM_DESOLATOR = register("item.desolator", SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("dota", "item.desolator")));
		ITEM_DIFFUSAL_BLADE = register("item.diffusal_blade", SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("dota", "item.diffusal_blade")));
		ITEM_HEAVEN_HALBERD = register("item.heaven_halberd", SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("dota", "item.heaven_halberd")));
		ITEM_MKB = register("item.mkb", SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("dota", "item.mkb")));
		ITEM_SHADOW_BLADE = register("item.shadow_blade", SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("dota", "item.shadow_blade")));
		ITEM_SILVER_EDGE = register("item.silver_edge", SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("dota", "item.silver_edge")));
	}

	private static SoundEvent register(String registryname, SoundEvent element) {
		return Registry.register(BuiltInRegistries.SOUND_EVENT, Identifier.fromNamespaceAndPath(DotaMod.MODID, registryname), element);
	}
}