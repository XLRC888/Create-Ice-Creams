package net.axollen.create_ice_creams.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item.Properties;

public class MysteryCreamItem extends Item {
   public MysteryCreamItem() {
      super(new Properties().stacksTo(64).rarity(Rarity.COMMON));
   }
}
