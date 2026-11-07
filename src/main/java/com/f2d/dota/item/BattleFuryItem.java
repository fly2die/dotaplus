package com.f2d.dota.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class BattleFuryItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1200, 4f, 0, 10, TagKey.create(Registries.ITEM, Identifier.parse("dota:battle_fury_repair_items")));

	public BattleFuryItem(Item.Properties properties) {
		super(properties.axe(TOOL_MATERIAL, 6f, -2.2f).rarity(Rarity.RARE));
	}
}