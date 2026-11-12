/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.f2d.dota.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import com.f2d.dota.DotaMod;

public class DotaModTabs {
	public static ResourceKey<CreativeModeTab> TAB_CREATIVE_TAB_DOTA = ResourceKey.create(Registries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(DotaMod.MODID, "creative_tab_dota"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_CREATIVE_TAB_DOTA,
				CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0).title(Component.translatable("item_group.dota.creative_tab_dota")).icon(() -> new ItemStack(DotaModItems.DIVINE_RAPIER)).displayItems((parameters, tabData) -> {
					tabData.accept(DotaModItems.ABYSSAL_BLADE);
					tabData.accept(DotaModItems.BATTLE_FURY);
					tabData.accept(DotaModItems.BUTTERFLY);
					tabData.accept(DotaModItems.CRYSTALYS);
					tabData.accept(DotaModItems.DESOLATOR);
					tabData.accept(DotaModItems.DIFFUSAL_BLADE);
					tabData.accept(DotaModItems.DIVINE_RAPIER);
					tabData.accept(DotaModItems.ECHO_SABRE);
					tabData.accept(DotaModItems.FALCONE_BLADE);
					tabData.accept(DotaModItems.HEAVENS_HALBERD);
					tabData.accept(DotaModItems.MONKEY_KING_BAR);
					tabData.accept(DotaModItems.PARASMA);
					tabData.accept(DotaModItems.SATANIC);
					tabData.accept(DotaModItems.SHADOW_BLADE);
					tabData.accept(DotaModItems.SILVER_EDGE);
					tabData.accept(DotaModItems.WITCH_BLADE);
				}).build());
	}
}