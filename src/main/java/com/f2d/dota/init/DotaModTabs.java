/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.f2d.dota.init;

import net.minecraft.world.item.CreativeModeTabs;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;

public class DotaModTabs {
	public static void load() {
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COMBAT).register(tabData -> {
			tabData.accept(DotaModItems.ABYSSAL_BLADE);
			tabData.accept(DotaModItems.BATTLE_FURY);
			tabData.accept(DotaModItems.BUTTERFLY);
			tabData.accept(DotaModItems.CRYSTALYS);
			tabData.accept(DotaModItems.DESOLATOR);
			tabData.accept(DotaModItems.DIFFUSAL_BLADE);
			tabData.accept(DotaModItems.DIVINE_RAPIER);
			tabData.accept(DotaModItems.ECHO_SABRE);
			tabData.accept(DotaModItems.FALCONE_BLADE);
			tabData.accept(DotaModItems.MONKEY_KING_BAR);
			tabData.accept(DotaModItems.SATANIC);
			tabData.accept(DotaModItems.SILVER_EDGE);
			tabData.accept(DotaModItems.WITCH_BLADE);
		});
	}
}