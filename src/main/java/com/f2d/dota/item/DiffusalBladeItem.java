package com.f2d.dota.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class DiffusalBladeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 800, 4f, 0, 15, TagKey.create(Registries.ITEM, Identifier.parse("dota:diffusal_blade_repair_items")));

	public DiffusalBladeItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 3f, -2.6f).rarity(Rarity.RARE));
	}
}