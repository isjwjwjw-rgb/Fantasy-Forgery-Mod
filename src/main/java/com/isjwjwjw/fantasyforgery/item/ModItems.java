package com.isjwjwjw.fantasyforgery.item;

import com.isjwjwjw.fantasyforgery.FantasyForgery;
import com.isjwjwjw.fantasyforgery.item.tool.TiniumPickaxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.Tiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FantasyForgery.MOD_ID);

    public static final DeferredItem<Item> TERRIUM_INGOT = ITEMS.register("terrium_ingot",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_TERRIUM = ITEMS.register("raw_terrium",
            ()-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_TINIUM = ITEMS.register("raw_tinium",
            ()-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TINIUM_INGOT = ITEMS.register("tinium_ingot",
            ()-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> BRONZIUM_INGOT = ITEMS.register("bronzium_ingot",
            ()-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TERRIUM_SHIELD = ITEMS.register("terrium_shield",
            () -> new ShieldItem(new Item.Properties()
                    .durability(660)));

    public static final DeferredItem<Item> MAGNESIS_INGOT = ITEMS.register("magnesis_ingot",
            ()-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> OBSIDIUM_INGOT = ITEMS.register("obsidium_ingot",
            ()-> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
