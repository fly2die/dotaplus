package com.f2d.dota.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class QuellingAxeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 100, 6f, 0, 2, TagKey.create(Registries.ITEM, Identifier.parse("dota:quelling_axe_repair_items")));

	public QuellingAxeItem(Item.Properties properties) {
		super(properties.axe(TOOL_MATERIAL, 5f, -3.3f));
	}
}