package com.f2d.dota.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionResult;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.fabricmc.fabric.api.event.player.UseEntityCallback;

import com.f2d.dota.init.DotaModItems;

public class ProccesPKMbyModProcedure {
	public static boolean eventResult = true;

	public ProccesPKMbyModProcedure() {
		UseEntityCallback.EVENT.register((player, level, hand, entity, hitResult) -> {
			if (hand == player.getUsedItemHand())
				execute(level, entity.getX(), entity.getY(), entity.getZ(), entity, player);
			boolean result = eventResult;
			eventResult = true;
			return result ? InteractionResult.PASS : InteractionResult.FAIL;
		});
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == DotaModItems.ABYSSAL_BLADE) {
			if (!(sourceentity instanceof Player _plrCldCheck2 && _plrCldCheck2.getCooldowns().isOnCooldown(new ItemStack(DotaModItems.ABYSSAL_BLADE)))) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("dota:item.abyssal_blade")), SoundSource.PLAYERS, (float) 0.8,
								(float) Mth.nextDouble(RandomSource.create(), 0.8, 1.2));
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("dota:item.abyssal_blade")), SoundSource.PLAYERS, (float) 0.8, (float) Mth.nextDouble(RandomSource.create(), 0.8, 1.2), false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SMALL_GUST, x, (y + 1), z, 8, 0.5, 1, 0.5, 1);
				if (sourceentity instanceof Player _player)
					_player.getCooldowns().addCooldown(new ItemStack(DotaModItems.ABYSSAL_BLADE), 400);
				entity.makeStuckInBlock(Blocks.AIR.defaultBlockState(), new Vec3(0.25, 0.05, 0.25));
				if (entity instanceof Mob _entity)
					_entity.getNavigation().stop();
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 60, 5, true, true));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.SLOWNESS, 60, 5, true, true));
			}
		}
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == DotaModItems.DIFFUSAL_BLADE) {
			if (!(sourceentity instanceof Player _plrCldCheck13 && _plrCldCheck13.getCooldowns().isOnCooldown(new ItemStack(DotaModItems.DIFFUSAL_BLADE)))) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("dota:item.diffusal_blade")), SoundSource.PLAYERS, (float) 0.8,
								(float) Mth.nextDouble(RandomSource.create(), 0.8, 1.2));
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("dota:item.diffusal_blade")), SoundSource.PLAYERS, (float) 0.8, (float) Mth.nextDouble(RandomSource.create(), 0.8, 1.2), false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.CLOUD, x, (y + 1), z, 8, 0.5, 1, 0.5, 0.1);
				if (sourceentity instanceof Player _player)
					_player.getCooldowns().addCooldown(new ItemStack(DotaModItems.DIFFUSAL_BLADE), 200);
				entity.makeStuckInBlock(Blocks.AIR.defaultBlockState(), new Vec3(0.25, 0.05, 0.25));
				if (entity instanceof Mob _entity)
					_entity.getNavigation().stop();
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.SLOWNESS, 100, 1, true, true));
			}
		}
	}
}