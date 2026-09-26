package ru.objminecra.stalkerjackets;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, StalkerJackets.MOD_ID);

    public static final RegistryObject<Item> JACKET_STALKER = register(JacketMaterial.STALKER, false);
    public static final RegistryObject<Item> JACKET_STALKER_1 = register(JacketMaterial.STALKER_1, false);
    public static final RegistryObject<Item> JACKET_STALKER_2 = register(JacketMaterial.STALKER_2, false);
    public static final RegistryObject<Item> JACKET_STALKER_3 = register(JacketMaterial.STALKER_3, false);
    public static final RegistryObject<Item> JACKET_STALKER_4 = register(JacketMaterial.STALKER_4, false);
    public static final RegistryObject<Item> JACKET_STALKER_5 = register(JacketMaterial.STALKER_5, false);
    public static final RegistryObject<Item> JACKET_STALKER_6 = register(JacketMaterial.STALKER_6, false);
    public static final RegistryObject<Item> JACKET_STALKER_7 = register(JacketMaterial.STALKER_7, false);
    public static final RegistryObject<Item> JACKET_WHITE = register(JacketMaterial.WHITE, false);
    public static final RegistryObject<Item> JACKET_VETERAN = register(JacketMaterial.VETERAN, false);
    public static final RegistryObject<Item> JACKET_BANDITS = register(JacketMaterial.BANDITS, false);
    public static final RegistryObject<Item> JACKET_BANDITS_2 = register(JacketMaterial.BANDITS_2, false);
    public static final RegistryObject<Item> JACKET_BANDITS_3 = register(JacketMaterial.BANDITS_3, false);
    public static final RegistryObject<Item> JACKET_RENEGADE = register(JacketMaterial.RENEGADE, false);
    public static final RegistryObject<Item> JACKET_CS = register(JacketMaterial.CS, false);
    public static final RegistryObject<Item> JACKET_MERC = register(JacketMaterial.MERC, false);
    public static final RegistryObject<Item> JACKET_MILITARY = register(JacketMaterial.MILITARY, false);
    public static final RegistryObject<Item> JACKET_FREEDOM = register(JacketMaterial.FREEDOM, false);
    public static final RegistryObject<Item> JACKET_DOLG = register(JacketMaterial.DOLG, true);

    private static RegistryObject<Item> register(JacketMaterial material, boolean fireResistant) {
        Item.Properties props = new Item.Properties().stacksTo(1).rarity(material.getRarity());
        if (fireResistant) {
            props.fireResistant();
        }
        return ITEMS.register(material.getRegName(), () -> new JacketItem(material, props));
    }
}
