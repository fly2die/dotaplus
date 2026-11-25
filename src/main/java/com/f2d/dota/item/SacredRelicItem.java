package com.f2d.dota.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class SacredRelicItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 50, 4f, 0, 5, TagKey.create(Registries.ITEM, Identifier.parse("dota:sacred_relic_repair_items")));

	public SacredRelicItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 11f, -3f).rarity(Rarity.RARE));
	}
}