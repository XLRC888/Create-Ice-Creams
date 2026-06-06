package net.axollen.create_ice_creams.init;

import net.axollen.create_ice_creams.init.CreateIceCreamsModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.Holder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CreateIceCreamsModTabs {
    public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "create_ice_creams");
    public static final Holder<CreativeModeTab> CREATE_ICE_CREAMS = REGISTRY.register(
        "create_ice_creams",
        () -> CreativeModeTab.builder()
            .title(Component.translatable("item_group.create_ice_creams.create_ice_creams"))
            .icon(() -> new ItemStack(CreateIceCreamsModItems.CONED_VANILLA_ICE_CREAM.value()))
            .displayItems((parameters, tabData) -> {
                tabData.accept(CreateIceCreamsModItems.VANILLA.value());
                tabData.accept(CreateIceCreamsModItems.CHOCOLATE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.TOFFEE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.BUBBLEGUM_FLAVORED_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.MINT_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.MYSTERY_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.WATERMELON_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.HONEY_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.APPLE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.COOKIE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CACTUS_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.BEETROOT_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.POTATO_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONE.value());
                tabData.accept(CreateIceCreamsModItems.CONED_VANILLA_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_VANILLA_SWEET_BERRIES_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_VANILLA_GLOW_BERRIES_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_VANILLA_CHORUS_FRUIT_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_VANILLA_CARROT_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_VANILLA_FUSION_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_CHOCOLATE_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_CHOCOLATE_SWEET_BERRIES_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_CHOCOLATE_GLOW_BERRIES_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_CHOCOLATE_CHORUS_FRUIT_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_CHOCOLATE_CARROT_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_CHOCOLATE_FUSION_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_TOFFEE_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_TOFFEE_SWEET_BERRIES_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_TOFFEE_GLOW_BERRIES_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_TOFFEE_CHORUS_FRUIT_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_TOFFEE_CARROT_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_TOFFEE_FUSION_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_BUBBLEGUM_FLAVORED_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_BUBBLEGUM_FLAVORED_SWEET_BERRIES_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_BUBBLEGUM_FLAVORED_GLOW_BERRIES_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_BUBBLEGUM_FLAVORED_CHORUS_FRUIT_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_BUBBLEGUM_FLAVORED_CARROT_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_BUBBLEGUM_FLAVORED_FUSION_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_MINT_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_MINT_SWEET_BERRIES_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_MINT_GLOW_BERRIES_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_MINT_CHORUS_FRUIT_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_MINT_CARROT_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_MINT_FUSION_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_MYSTERY_ICE_CREM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_MYSTERY_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_MYSTERY_ICE_CRAEM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_MYSTERY_ICE_CRAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_WATERMELON_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_WATERMELON_SWEET_BERRIES_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_WATERMELON_GLOW_BERRIES_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_WATERMELON_CHORUS_FRUIT_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_WATERMELON_CARROT_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_WATERMELON_FUSION_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_HONEY_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_HONEY_SWEET_BERRIES_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_HONEY_GLOW_BERRIES_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_HONEY_CHORUS_FRUIT_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_HONEY_CARROT_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_HONEY_FUSION_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_APPLE_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_APPLE_SWEET_BERRIES_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_APPLE_GLOW_BERRIES_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_APPLE_CHORUS_FRUIT_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_APPLE_CARROT_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_APPLE_FUSION_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_COOKIE_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_COOKIE_SWEET_BERRIES_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_COOKIE_GLOW_BERRIES_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_COOKIE_CHORUS_FRUIT_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_COOKIE_CARROT_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_COOKIE_FUSION_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_CACTUS_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_CACTUS_SWEET_BERRIES_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_CACTUS_GLOW_BERRIES_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_CACTUS_CHORUS_FRUIT_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_CACTUS_CARROT_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_CACTUS_FUSION_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_BEETROOT_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_BEETROOT_SWEET_BERRIES_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_BEETROOT_GLOW_BERRIES_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_BEETROOT_CHORUS_FRUIT_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_BEETROOT_CARROT_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_BEETROOT_FUSION_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_POTATO_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_POTATO_SWEET_BERRIES_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_POTATO_GLOW_BERRIES_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_POTATO_CHORUS_FRUIT_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_POTATO_CARROT_ICE_CREAM.value());
                tabData.accept(CreateIceCreamsModItems.CONED_POTATO_FUSION_ICE_CREAM.value());
            })
            .build()
    );
}
