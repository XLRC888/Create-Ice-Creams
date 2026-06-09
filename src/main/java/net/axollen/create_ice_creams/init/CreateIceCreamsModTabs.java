package net.axollen.create_ice_creams.init;

import net.axollen.create_ice_creams.CreateIceCreamsMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreateIceCreamsModTabs {
   public static final ResourceKey<CreativeModeTab> CREATE_ICE_CREAMS_KEY = ResourceKey.create(
      Registries.CREATIVE_MODE_TAB, new ResourceLocation(CreateIceCreamsMod.MODID, "create_ice_creams")
   );
   public static final CreativeModeTab CREATE_ICE_CREAMS = FabricItemGroup.builder()
      .title(Component.translatable("item_group.create_ice_creams.create_ice_creams"))
      .icon(() -> new ItemStack(CreateIceCreamsModItems.CONED_VANILLA_ICE_CREAM))
      .build();

   public static void register() {
      Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, CREATE_ICE_CREAMS_KEY, CREATE_ICE_CREAMS);
      ItemGroupEvents.modifyEntriesEvent(CREATE_ICE_CREAMS_KEY).register(entries -> {
         entries.accept(CreateIceCreamsModItems.VANILLA);
         entries.accept(CreateIceCreamsModItems.CHOCOLATE_CREAM);
         entries.accept(CreateIceCreamsModItems.TOFFEE_CREAM);
         entries.accept(CreateIceCreamsModItems.BUBBLEGUM_FLAVORED_CREAM);
         entries.accept(CreateIceCreamsModItems.MINT_CREAM);
         entries.accept(CreateIceCreamsModItems.MYSTERY_CREAM);
         entries.accept(CreateIceCreamsModItems.WATERMELON_CREAM);
         entries.accept(CreateIceCreamsModItems.HONEY_CREAM);
         entries.accept(CreateIceCreamsModItems.APPLE_CREAM);
         entries.accept(CreateIceCreamsModItems.COOKIE_CREAM);
         entries.accept(CreateIceCreamsModItems.CACTUS_CREAM);
         entries.accept(CreateIceCreamsModItems.BEETROOT_CREAM);
         entries.accept(CreateIceCreamsModItems.POTATO_CREAM);
         entries.accept(CreateIceCreamsModItems.CONE);
         entries.accept(CreateIceCreamsModItems.CONED_VANILLA_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_VANILLA_SWEET_BERRIES_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_VANILLA_GLOW_BERRIES_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_VANILLA_CHORUS_FRUIT_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_VANILLA_CARROT_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_VANILLA_FUSION_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_CHOCOLATE_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_CHOCOLATE_SWEET_BERRIES_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_CHOCOLATE_GLOW_BERRIES_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_CHOCOLATE_CHORUS_FRUIT_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_CHOCOLATE_CARROT_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_CHOCOLATE_FUSION_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_TOFFEE_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_TOFFEE_SWEET_BERRIES_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_TOFFEE_GLOW_BERRIES_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_TOFFEE_CHORUS_FRUIT_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_TOFFEE_CARROT_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_TOFFEE_FUSION_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_BUBBLEGUM_FLAVORED_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_BUBBLEGUM_FLAVORED_SWEET_BERRIES_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_BUBBLEGUM_FLAVORED_GLOW_BERRIES_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_BUBBLEGUM_FLAVORED_CHORUS_FRUIT_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_BUBBLEGUM_FLAVORED_CARROT_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_BUBBLEGUM_FLAVORED_FUSION_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_MINT_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_MINT_SWEET_BERRIES_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_MINT_GLOW_BERRIES_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_MINT_CHORUS_FRUIT_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_MINT_CARROT_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_MINT_FUSION_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_MYSTERY_ICE_CREM);
         entries.accept(CreateIceCreamsModItems.CONED_MYSTERY_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_MYSTERY_ICE_CRAEM);
         entries.accept(CreateIceCreamsModItems.CONED_MYSTERY_ICE_CRAM);
         entries.accept(CreateIceCreamsModItems.CONED_WATERMELON_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_WATERMELON_SWEET_BERRIES_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_WATERMELON_GLOW_BERRIES_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_WATERMELON_CHORUS_FRUIT_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_WATERMELON_CARROT_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_WATERMELON_FUSION_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_HONEY_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_HONEY_SWEET_BERRIES_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_HONEY_GLOW_BERRIES_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_HONEY_CHORUS_FRUIT_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_HONEY_CARROT_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_HONEY_FUSION_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_APPLE_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_APPLE_SWEET_BERRIES_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_APPLE_GLOW_BERRIES_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_APPLE_CHORUS_FRUIT_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_APPLE_CARROT_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_APPLE_FUSION_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_COOKIE_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_COOKIE_SWEET_BERRIES_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_COOKIE_GLOW_BERRIES_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_COOKIE_CHORUS_FRUIT_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_COOKIE_CARROT_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_COOKIE_FUSION_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_CACTUS_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_CACTUS_SWEET_BERRIES_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_CACTUS_GLOW_BERRIES_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_CACTUS_CHORUS_FRUIT_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_CACTUS_CARROT_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_CACTUS_FUSION_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_BEETROOT_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_BEETROOT_SWEET_BERRIES_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_BEETROOT_GLOW_BERRIES_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_BEETROOT_CHORUS_FRUIT_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_BEETROOT_CARROT_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_BEETROOT_FUSION_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_POTATO_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_POTATO_SWEET_BERRIES_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_POTATO_GLOW_BERRIES_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_POTATO_CHORUS_FRUIT_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_POTATO_CARROT_ICE_CREAM);
         entries.accept(CreateIceCreamsModItems.CONED_POTATO_FUSION_ICE_CREAM);
      });
   }
}
