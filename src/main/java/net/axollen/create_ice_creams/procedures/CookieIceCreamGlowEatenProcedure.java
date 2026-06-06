package net.axollen.create_ice_creams.procedures;

import net.axollen.create_ice_creams.CreateIceCreamsMod;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.LevelAccessor;

public class CookieIceCreamGlowEatenProcedure {
   public static void execute(LevelAccessor world, Entity entity) {
      if (entity != null) {

         CreateIceCreamsMod.queueServerWork(60, () -> {
            if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide()) {
               _entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1800, 0, false, false));
            }
         });

         CreateIceCreamsMod.queueServerWork(60, () -> {
            if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide()) {
               _entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 1800, 0, false, false));
            }
         });

         CreateIceCreamsMod.queueServerWork(60, () -> {
            if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide()) {
               _entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 1200, 0, false, false));
            }
         });
      }
   }
}
