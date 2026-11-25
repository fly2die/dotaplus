package com.f2d.dota.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class QuarterstaffItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 220, 4f, 0, 2, TagKey.create(Registries.ITEM, Identifier.parse("dota:quarterstaff_repair_items")));

	public QuarterstaffItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 6.1f, -2.6f));
	}
}