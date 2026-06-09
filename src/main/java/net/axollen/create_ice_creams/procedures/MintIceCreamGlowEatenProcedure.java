package net.axollen.create_ice_creams.procedures;

import net.axollen.create_ice_creams.CreateIceCreamsMod;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.LevelAccessor;

public class MintIceCreamGlowEatenProcedure {
   public static void execute(LevelAccessor world, Entity entity) {
      if (entity != null) {
         if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide()) {
            _entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 1, false, false));
         }

         CreateIceCreamsMod.queueServerWork(40, () -> {
            if (entity instanceof LivingEntity _entityxxxx && !_entityxxxx.level().isClientSide()) {
               _entityxxxx.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1200, 0, false, false));
            }

            if (entity instanceof LivingEntity _entityxxx && !_entityxxx.level().isClientSide()) {
               _entityxxx.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 2, false, false));
            }

            if (entity instanceof LivingEntity _entityxx && !_entityxx.level().isClientSide()) {
               _entityxx.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 1200, 0, false, false));
            }

            if (entity instanceof LivingEntity _entityx && !_entityx.level().isClientSide()) {
               _entityx.addEffect(new MobEffectInstance(MobEffects.GLOWING, 1200, 0, false, false));
            }
         });
      }
   }
}
