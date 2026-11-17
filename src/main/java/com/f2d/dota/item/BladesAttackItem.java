package com.f2d.dota.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class BladesAttackItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 90, 4f, 0, 2, TagKey.create(Registries.ITEM, Identifier.parse("dota:blades_attack_repair_items")));

	public BladesAttackItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 2f, -1.8f));
	}
}