package com.f2d.dota.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class SilverEdgeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 1100, 4f, 0, 10, TagKey.create(Registries.ITEM, Identifier.parse("dota:silver_edge_repair_items")));

	public SilverEdgeItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 5.5f, -2.2f).rarity(Rarity.RARE));
	}
}