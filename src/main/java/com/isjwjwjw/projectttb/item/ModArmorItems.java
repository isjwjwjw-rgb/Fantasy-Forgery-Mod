package com.isjwjwjw.projectttb.item;

import com.isjwjwjw.projectttb.ProjectTTB;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModArmorItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(ProjectTTB.MOD_ID);

    public static final DeferredItem<ArmorItem> TERRIUM_HELMET = ITEMS.register("terrium_helmet",
            ()-> new ArmorItem(ModArmorMaterials.TERRIUM, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final DeferredItem<ArmorItem> TERRIUM_CHESTPLATE = ITEMS.register("terrium_chestplate",
            ()-> new ArmorItem(ModArmorMaterials.TERRIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final DeferredItem<ArmorItem> TERRIUM_LEGGINGS = ITEMS.register("terrium_leggings",
            ()-> new ArmorItem(ModArmorMaterials.TERRIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final DeferredItem<ArmorItem> TERRIUM_BOOTS = ITEMS.register("terrium_boots",
            ()-> new ArmorItem(ModArmorMaterials.TERRIUM, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final DeferredItem<ArmorItem> TINIUM_HELMET = ITEMS.register("tinium_helmet",
            ()-> new ArmorItem(ModArmorMaterials.TINIUM, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final DeferredItem<ArmorItem> TINIUM_CHESTPLATE = ITEMS.register("tinium_chestplate",
            ()-> new ArmorItem(ModArmorMaterials.TINIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final DeferredItem<ArmorItem> TINIUM_LEGGINGS = ITEMS.register("tinium_leggings",
            ()-> new ArmorItem(ModArmorMaterials.TINIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final DeferredItem<ArmorItem> TINIUM_BOOTS = ITEMS.register("tinium_boots",
            ()-> new ArmorItem(ModArmorMaterials.TINIUM, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
