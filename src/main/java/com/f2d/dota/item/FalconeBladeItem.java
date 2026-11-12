package com.f2d.dota.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import com.f2d.dota.procedures.FalconeBladePrProcedure;

public class FalconeBladeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 700, 4f, 0, 15, TagKey.create(Registries.ITEM, Identifier.parse("dota:falcone_blade_repair_items")));

	public FalconeBladeItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 4f, -2.8f).rarity(Rarity.RARE));
	}

	@Override
	public void hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		super.hurtEnemy(itemstack, entity, sourceentity);
		FalconeBladePrProcedure.execute(sourceentity);
	}
}