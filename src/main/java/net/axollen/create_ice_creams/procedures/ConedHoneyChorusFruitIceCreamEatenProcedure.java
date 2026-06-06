package net.axollen.create_ice_creams.procedures;

import net.axollen.create_ice_creams.CreateIceCreamsMod;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

public class ConedHoneyChorusFruitIceCreamEatenProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         if (world instanceof ServerLevel _level) {
            _level.sendParticles(ParticleTypes.PORTAL, x, y, z, 5, 3.0, 3.0, 3.0, 1.0);
         }

         if (world instanceof Level _level) {
            if (!_level.isClientSide()) {
               _level.playSound(
                  null,
                  BlockPos.containing(x, y, z),
                  net.minecraft.sounds.SoundEvents.ENDERMAN_TELEPORT,
                  SoundSource.MASTER,
                  5.0F,
                  1.0F
               );
            } else {
            }
         }

         Entity _ent = entity;
         _ent.teleportTo(Mth.nextDouble(RandomSource.create(), -10.0, 10.0) + x, 1.0 + y, Mth.nextDouble(RandomSource.create(), -10.0, 10.0) + z);
         if (_ent instanceof ServerPlayer _serverPlayer) {
            _serverPlayer.connection
               .teleport(
                  Mth.nextDouble(RandomSource.create(), -10.0, 10.0) + x,
                  1.0 + y,
                  Mth.nextDouble(RandomSource.create(), -10.0, 10.0) + z,
                  _ent.getYRot(),
                  _ent.getXRot()
               );
         }

         if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide()) {
            _entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 1, false, false));
         }


         CreateIceCreamsMod.queueServerWork(60, () -> {
            if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide()) {
               _entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 900, 0, false, false));
            }
         });

         CreateIceCreamsMod.queueServerWork(60, () -> {
            if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide()) {
               _entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 0, false, false));
            }
         });
      }
   }
}
