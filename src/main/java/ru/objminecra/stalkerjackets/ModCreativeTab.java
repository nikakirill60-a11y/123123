package ru.objminecra.stalkerjackets;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StalkerJackets.MOD_ID);

    public static final RegistryObject<CreativeModeTab> JACKETS = TABS.register("jackets",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.JACKET_STALKER.get()))
                    .title(Component.translatable("itemGroup.stalkerjackets"))
                    .displayItems((params, output) -> {
                        // Куртки
                        output.accept(ModItems.JACKET_STALKER.get());
                        output.accept(ModItems.JACKET_STALKER_1.get());
                        output.accept(ModItems.JACKET_STALKER_2.get());
                        output.accept(ModItems.JACKET_STALKER_3.get());
                        output.accept(ModItems.JACKET_STALKER_4.get());
                        output.accept(ModItems.JACKET_STALKER_5.get());
                        output.accept(ModItems.JACKET_STALKER_6.get());
                        output.accept(ModItems.JACKET_STALKER_7.get());
                        output.accept(ModItems.JACKET_WHITE.get());
                        output.accept(ModItems.JACKET_VETERAN.get());
                        output.accept(ModItems.JACKET_BANDITS.get());
                        output.accept(ModItems.JACKET_BANDITS_2.get());
                        output.accept(ModItems.JACKET_BANDITS_3.get());
                        output.accept(ModItems.JACKET_RENEGADE.get());
                        output.accept(ModItems.JACKET_CS.get());
                        output.accept(ModItems.JACKET_MERC.get());
                        output.accept(ModItems.JACKET_MILITARY.get());
                        output.accept(ModItems.JACKET_FREEDOM.get());
                        output.accept(ModItems.JACKET_DOLG.get());

                        // Комбинезоны «Заря»
                        output.accept(ModItems.ZARYA_STALKER.get());
                        output.accept(ModItems.ZARYA_DOLG.get());
                        output.accept(ModItems.ZARYA_FREEDOM.get());
                        output.accept(ModItems.ZARYA_CS.get());
                        output.accept(ModItems.ZARYA_MONOLITH.get());
                        output.accept(ModItems.ZARYA_ECOLOG.get());
                        output.accept(ModItems.ZARYA_GREH.get());
                        output.accept(ModItems.ZARYA_GREH_2.get());
                    })
                    .build());
}
