package com.f2d.dota.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class DesolatorItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 1100, 4f, 0, 10, TagKey.create(Registries.ITEM, Identifier.parse("dota:desolator_repair_items")));

	public DesolatorItem(Item.Properties properties) {
		super(properties.hoe(TOOL_MATERIAL, 7f, -2.8f).rarity(Rarity.RARE));
	}
}