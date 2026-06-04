package net.axollen.create_ice_creams.init;

import net.axollen.create_ice_creams.item.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CreateIceCreamsModItems {
   public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, "create_ice_creams");
   public static final RegistryObject<Item> CONED_VANILLA_ICE_CREAM = REGISTRY.register("coned_vanilla_ice_cream", () -> new ConedVanillaIceCreamItem());
   public static final RegistryObject<Item> VANILLA = REGISTRY.register("vanilla", () -> new VanillaItem());
   public static final RegistryObject<Item> CONE = REGISTRY.register("cone", () -> new ConeItem());
   public static final RegistryObject<Item> CONED_VANILLA_SWEET_BERRIES_ICE_CREAM = REGISTRY.register(
      "coned_vanilla_sweet_berries_ice_cream", () -> new ConedVanillaSweetBerriesIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_VANILLA_CARROT_ICE_CREAM = REGISTRY.register(
      "coned_vanilla_carrot_ice_cream", () -> new ConedVanillaCarrotIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_VANILLA_GLOW_BERRIES_ICE_CREAM = REGISTRY.register(
      "coned_vanilla_glow_berries_ice_cream", () -> new ConedVanillaGlowBerriesIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_VANILLA_CHORUS_FRUIT_ICE_CREAM = REGISTRY.register(
      "coned_vanilla_chorus_fruit_ice_cream", () -> new ConedVanillaChorusFruitIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_CHOCOLATE_ICE_CREAM = REGISTRY.register("coned_chocolate_ice_cream", () -> new ChocolateIceCreamItem());
   public static final RegistryObject<Item> CHOCOLATE_CREAM = REGISTRY.register("chocolate_cream", () -> new ChocolateCreamItem());
   public static final RegistryObject<Item> CONED_CHOCOLATE_SWEET_BERRIES_ICE_CREAM = REGISTRY.register(
      "coned_chocolate_sweet_berries_ice_cream", () -> new ConedChocolateSweetBerriesIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_CHOCOLATE_CARROT_ICE_CREAM = REGISTRY.register(
      "coned_chocolate_carrot_ice_cream", () -> new ConedChocolateCarrotIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_CHOCOLATE_GLOW_BERRIES_ICE_CREAM = REGISTRY.register(
      "coned_chocolate_glow_berries_ice_cream", () -> new ConedChocolateGlowBerriesIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_CHOCOLATE_CHORUS_FRUIT_ICE_CREAM = REGISTRY.register(
      "coned_chocolate_chorus_fruit_ice_cream", () -> new ConedChocolateChorusFruitIceCreamItem()
   );
   public static final RegistryObject<Item> TOFFEE_CREAM = REGISTRY.register("toffee_cream", () -> new ToffeeCreamItem());
   public static final RegistryObject<Item> CONED_TOFFEE_ICE_CREAM = REGISTRY.register("coned_toffee_ice_cream", () -> new ConedToffeeIceCreamItem());
   public static final RegistryObject<Item> CONED_TOFFEE_SWEET_BERRIES_ICE_CREAM = REGISTRY.register(
      "coned_toffee_sweet_berries_ice_cream", () -> new ConedToffeeSweetBerriesIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_TOFFEE_CHORUS_FRUIT_ICE_CREAM = REGISTRY.register(
      "coned_toffee_chorus_fruit_ice_cream", () -> new ConedToffeeChorusFruitIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_TOFFEE_CARROT_ICE_CREAM = REGISTRY.register(
      "coned_toffee_carrot_ice_cream", () -> new ConedToffeCarrotIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_TOFFEE_GLOW_BERRIES_ICE_CREAM = REGISTRY.register(
      "coned_toffee_glow_berries_ice_cream", () -> new ConedToffeeGlowBerriesIceCreamItem()
   );
   public static final RegistryObject<Item> BUBBLEGUM_FLAVORED_CREAM = REGISTRY.register("bubblegum_flavored_cream", () -> new BubblegumFlavoredCreamItem());
   public static final RegistryObject<Item> CONED_BUBBLEGUM_FLAVORED_ICE_CREAM = REGISTRY.register(
      "coned_bubblegum_flavored_ice_cream", () -> new ConedBubblegumFlavoredIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_BUBBLEGUM_FLAVORED_SWEET_BERRIES_ICE_CREAM = REGISTRY.register(
      "coned_bubblegum_flavored_sweet_berries_ice_cream", () -> new ConedBubblegumFlavoredSweetBerriesIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_BUBBLEGUM_FLAVORED_CARROT_ICE_CREAM = REGISTRY.register(
      "coned_bubblegum_flavored_carrot_ice_cream", () -> new ConedBubblegumFlavoredCarrotIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_BUBBLEGUM_FLAVORED_GLOW_BERRIES_ICE_CREAM = REGISTRY.register(
      "coned_bubblegum_flavored_glow_berries_ice_cream", () -> new ConedBubblegumFlavoredGlowBerriesIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_BUBBLEGUM_FLAVORED_CHORUS_FRUIT_ICE_CREAM = REGISTRY.register(
      "coned_bubblegum_flavored_chorus_fruit_ice_cream", () -> new ConedBubblegumFlavoredChorusFruitIceCreamItem()
   );
   public static final RegistryObject<Item> MINT_CREAM = REGISTRY.register("mint_cream", () -> new MintCreamItem());
   public static final RegistryObject<Item> CONED_MINT_ICE_CREAM = REGISTRY.register("coned_mint_ice_cream", () -> new ConedMintIceCreamItem());
   public static final RegistryObject<Item> CONED_MINT_SWEET_BERRIES_ICE_CREAM = REGISTRY.register(
      "coned_mint_sweet_berries_ice_cream", () -> new ConedMintSweetBerriesIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_MINT_CARROT_ICE_CREAM = REGISTRY.register(
      "coned_mint_carrot_ice_cream", () -> new ConedMintCarrotIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_MINT_GLOW_BERRIES_ICE_CREAM = REGISTRY.register(
      "coned_mint_glow_berries_ice_cream", () -> new ConedMintGlowBerriesIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_MINT_CHORUS_FRUIT_ICE_CREAM = REGISTRY.register(
      "coned_mint_chorus_fruit_ice_cream", () -> new ConedMintChorusFruitIceCreamItem()
   );
   public static final RegistryObject<Item> MYSTERY_CREAM = REGISTRY.register("mystery_cream", () -> new MysteryCreamItem());
   public static final RegistryObject<Item> CONED_MYSTERY_ICE_CRAM = REGISTRY.register("coned_mystery_ice_cram", () -> new ConedMysteryIceCramItem());
   public static final RegistryObject<Item> CONED_MYSTERY_ICE_CREM = REGISTRY.register("coned_mystery_ice_crem", () -> new ConedMysteryIceCremItem());
   public static final RegistryObject<Item> CONED_MYSTERY_ICE_CRAEM = REGISTRY.register("coned_mystery_ice_craem", () -> new ConedMysteryIceCraemItem());
   public static final RegistryObject<Item> CONED_MYSTERY_ICE_CREAM = REGISTRY.register("coned_mystery_ice_cream", () -> new ConedMysteryIceCreamItem());
   public static final RegistryObject<Item> CONED_WATERMELON_ICE_CREAM = REGISTRY.register(
      "coned_watermelon_ice_cream", () -> new ConedWatermelonIceCreamItem()
   );
   public static final RegistryObject<Item> WATERMELON_CREAM = REGISTRY.register("watermelon_cream", () -> new WatermelonCreamItem());
   public static final RegistryObject<Item> CONED_WATERMELON_SWEET_BERRIES_ICE_CREAM = REGISTRY.register(
      "coned_watermelon_sweet_berries_ice_cream", () -> new ConedWatermelonSweetBerriesIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_WATERMELON_CARROT_ICE_CREAM = REGISTRY.register(
      "coned_watermelon_carrot_ice_cream", () -> new ConedWatermelonCarrotIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_WATERMELON_GLOW_BERRIES_ICE_CREAM = REGISTRY.register(
      "coned_watermelon_glow_berries_ice_cream", () -> new ConedWatermelonGlowBerriesIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_WATERMELON_CHORUS_FRUIT_ICE_CREAM = REGISTRY.register(
      "coned_watermelon_chorus_fruit_ice_cream", () -> new ConedWatermelonChorusFruitIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_VANILLA_FUSION_ICE_CREAM = REGISTRY.register(
      "coned_vanilla_fusion_ice_cream", () -> new ConedVanillaFusionIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_CHOCOLATE_FUSION_ICE_CREAM = REGISTRY.register(
      "coned_chocolate_fusion_ice_cream", () -> new ConedChocolateFusionIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_TOFFEE_FUSION_ICE_CREAM = REGISTRY.register(
      "coned_toffee_fusion_ice_cream", () -> new ConedToffeeFusionIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_BUBBLEGUM_FLAVORED_FUSION_ICE_CREAM = REGISTRY.register(
      "coned_bubblegum_flavored_fusion_ice_cream", () -> new ConedBubblegumFlavoredFusionIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_MINT_FUSION_ICE_CREAM = REGISTRY.register(
      "coned_mint_fusion_ice_cream", () -> new ConedMintFusionIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_WATERMELON_FUSION_ICE_CREAM = REGISTRY.register(
      "coned_watermelon_fusion_ice_cream", () -> new ConedWatermelonFusionIceCreamItem()
   );
   public static final RegistryObject<Item> HONEY_CREAM = REGISTRY.register("honey_cream", () -> new HoneyCreamItem());
   public static final RegistryObject<Item> CONED_HONEY_ICE_CREAM = REGISTRY.register(
      "coned_honey_ice_cream", () -> new ConedHoneyIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_HONEY_SWEET_BERRIES_ICE_CREAM = REGISTRY.register(
      "coned_honey_sweet_berries_ice_cream", () -> new ConedHoneySweetBerriesIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_HONEY_CARROT_ICE_CREAM = REGISTRY.register(
      "coned_honey_carrot_ice_cream", () -> new ConedHoneyCarrotIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_HONEY_GLOW_BERRIES_ICE_CREAM = REGISTRY.register(
      "coned_honey_glow_berries_ice_cream", () -> new ConedHoneyGlowBerriesIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_HONEY_CHORUS_FRUIT_ICE_CREAM = REGISTRY.register(
      "coned_honey_chorus_fruit_ice_cream", () -> new ConedHoneyChorusFruitIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_HONEY_FUSION_ICE_CREAM = REGISTRY.register(
      "coned_honey_fusion_ice_cream", () -> new ConedHoneyFusionIceCreamItem()
   );
   public static final RegistryObject<Item> APPLE_CREAM = REGISTRY.register("apple_cream", () -> new AppleCreamItem());
   public static final RegistryObject<Item> CONED_APPLE_ICE_CREAM = REGISTRY.register(
      "coned_apple_ice_cream", () -> new ConedAppleIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_APPLE_SWEET_BERRIES_ICE_CREAM = REGISTRY.register(
      "coned_apple_sweet_berries_ice_cream", () -> new ConedAppleSweetBerriesIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_APPLE_CARROT_ICE_CREAM = REGISTRY.register(
      "coned_apple_carrot_ice_cream", () -> new ConedAppleCarrotIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_APPLE_GLOW_BERRIES_ICE_CREAM = REGISTRY.register(
      "coned_apple_glow_berries_ice_cream", () -> new ConedAppleGlowBerriesIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_APPLE_CHORUS_FRUIT_ICE_CREAM = REGISTRY.register(
      "coned_apple_chorus_fruit_ice_cream", () -> new ConedAppleChorusFruitIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_APPLE_FUSION_ICE_CREAM = REGISTRY.register(
      "coned_apple_fusion_ice_cream", () -> new ConedAppleFusionIceCreamItem()
   );
   public static final RegistryObject<Item> COOKIE_CREAM = REGISTRY.register("cookie_cream", () -> new CookieCreamItem());
   public static final RegistryObject<Item> CONED_COOKIE_ICE_CREAM = REGISTRY.register(
      "coned_cookie_ice_cream", () -> new ConedCookieIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_COOKIE_SWEET_BERRIES_ICE_CREAM = REGISTRY.register(
      "coned_cookie_sweet_berries_ice_cream", () -> new ConedCookieSweetBerriesIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_COOKIE_CARROT_ICE_CREAM = REGISTRY.register(
      "coned_cookie_carrot_ice_cream", () -> new ConedCookieCarrotIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_COOKIE_GLOW_BERRIES_ICE_CREAM = REGISTRY.register(
      "coned_cookie_glow_berries_ice_cream", () -> new ConedCookieGlowBerriesIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_COOKIE_CHORUS_FRUIT_ICE_CREAM = REGISTRY.register(
      "coned_cookie_chorus_fruit_ice_cream", () -> new ConedCookieChorusFruitIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_COOKIE_FUSION_ICE_CREAM = REGISTRY.register(
      "coned_cookie_fusion_ice_cream", () -> new ConedCookieFusionIceCreamItem()
   );
   public static final RegistryObject<Item> CACTUS_CREAM = REGISTRY.register("cactus_cream", () -> new CactusCreamItem());
   public static final RegistryObject<Item> CONED_CACTUS_ICE_CREAM = REGISTRY.register(
      "coned_cactus_ice_cream", () -> new ConedCactusIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_CACTUS_SWEET_BERRIES_ICE_CREAM = REGISTRY.register(
      "coned_cactus_sweet_berries_ice_cream", () -> new ConedCactusSweetBerriesIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_CACTUS_CARROT_ICE_CREAM = REGISTRY.register(
      "coned_cactus_carrot_ice_cream", () -> new ConedCactusCarrotIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_CACTUS_GLOW_BERRIES_ICE_CREAM = REGISTRY.register(
      "coned_cactus_glow_berries_ice_cream", () -> new ConedCactusGlowBerriesIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_CACTUS_CHORUS_FRUIT_ICE_CREAM = REGISTRY.register(
      "coned_cactus_chorus_fruit_ice_cream", () -> new ConedCactusChorusFruitIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_CACTUS_FUSION_ICE_CREAM = REGISTRY.register(
      "coned_cactus_fusion_ice_cream", () -> new ConedCactusFusionIceCreamItem()
   );
   public static final RegistryObject<Item> BEETROOT_CREAM = REGISTRY.register("beetroot_cream", () -> new BeetrootCreamItem());
   public static final RegistryObject<Item> CONED_BEETROOT_ICE_CREAM = REGISTRY.register(
      "coned_beetroot_ice_cream", () -> new ConedBeetrootIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_BEETROOT_SWEET_BERRIES_ICE_CREAM = REGISTRY.register(
      "coned_beetroot_sweet_berries_ice_cream", () -> new ConedBeetrootSweetBerriesIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_BEETROOT_CARROT_ICE_CREAM = REGISTRY.register(
      "coned_beetroot_carrot_ice_cream", () -> new ConedBeetrootCarrotIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_BEETROOT_GLOW_BERRIES_ICE_CREAM = REGISTRY.register(
      "coned_beetroot_glow_berries_ice_cream", () -> new ConedBeetrootGlowBerriesIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_BEETROOT_CHORUS_FRUIT_ICE_CREAM = REGISTRY.register(
      "coned_beetroot_chorus_fruit_ice_cream", () -> new ConedBeetrootChorusFruitIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_BEETROOT_FUSION_ICE_CREAM = REGISTRY.register(
      "coned_beetroot_fusion_ice_cream", () -> new ConedBeetrootFusionIceCreamItem()
   );
   public static final RegistryObject<Item> POTATO_CREAM = REGISTRY.register("potato_cream", () -> new PotatoCreamItem());
   public static final RegistryObject<Item> CONED_POTATO_ICE_CREAM = REGISTRY.register(
      "coned_potato_ice_cream", () -> new ConedPotatoIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_POTATO_SWEET_BERRIES_ICE_CREAM = REGISTRY.register(
      "coned_potato_sweet_berries_ice_cream", () -> new ConedPotatoSweetBerriesIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_POTATO_CARROT_ICE_CREAM = REGISTRY.register(
      "coned_potato_carrot_ice_cream", () -> new ConedPotatoCarrotIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_POTATO_GLOW_BERRIES_ICE_CREAM = REGISTRY.register(
      "coned_potato_glow_berries_ice_cream", () -> new ConedPotatoGlowBerriesIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_POTATO_CHORUS_FRUIT_ICE_CREAM = REGISTRY.register(
      "coned_potato_chorus_fruit_ice_cream", () -> new ConedPotatoChorusFruitIceCreamItem()
   );
   public static final RegistryObject<Item> CONED_POTATO_FUSION_ICE_CREAM = REGISTRY.register(
      "coned_potato_fusion_ice_cream", () -> new ConedPotatoFusionIceCreamItem()
   );
}
