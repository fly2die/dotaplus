/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.f2d.dota.init;

import net.minecraft.world.item.CreativeModeTabs;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;

public class DotaModTabs {
	public static void load() {
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COMBAT).register(tabData -> {
			tabData.accept(DotaModItems.BATTLE_FURY);
			tabData.accept(DotaModItems.BUTTERFLY);
			tabData.accept(DotaModItems.DESOLATOR);
			tabData.accept(DotaModItems.DIVINE_RAPIER);
		});
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(tabData -> {
			tabData.accept(DotaModItems.SATANIC);
		});
	}
}