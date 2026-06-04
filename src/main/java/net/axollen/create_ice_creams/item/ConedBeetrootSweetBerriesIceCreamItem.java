package net.axollen.create_ice_creams.item;

import net.axollen.create_ice_creams.procedures.BeetrootIceCreamEatenProcedure;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties.Builder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.Level;

public class ConedBeetrootSweetBerriesIceCreamItem extends Item {
   public ConedBeetrootSweetBerriesIceCreamItem() {
      super(new Properties().stacksTo(64).rarity(Rarity.COMMON).food(new Builder().nutrition(6).saturationMod(4.0F).alwaysEat().build()));
   }

   public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
      ItemStack retval = super.finishUsingItem(itemstack, world, entity);
      double x = entity.getX();
      double y = entity.getY();
      double z = entity.getZ();
      BeetrootIceCreamEatenProcedure.execute(world, entity);
      return retval;
   }
}
