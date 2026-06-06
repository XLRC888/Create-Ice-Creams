package net.axollen.create_ice_creams.item;

import net.minecraft.world.food.FoodProperties.Builder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item.Properties;

public class ConeItem extends Item {
   public ConeItem() {
      super(new Properties().stacksTo(64).rarity(Rarity.COMMON).food(new Builder().nutrition(4).saturationModifier(0.7F).build()));
   }
}
