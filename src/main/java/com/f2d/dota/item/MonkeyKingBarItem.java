package com.f2d.dota.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class MonkeyKingBarItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 1200, 4f, 0, 10, TagKey.create(Registries.ITEM, Identifier.parse("dota:monkey_king_bar_repair_items")));

	public MonkeyKingBarItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 5f, -1.8f).rarity(Rarity.RARE));
	}
}