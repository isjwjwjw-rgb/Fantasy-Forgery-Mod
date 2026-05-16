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

    public static final DeferredItem<Item> TINIUM_STONE_PICKAXE = ITEMS.register("tinium_stone_pickaxe",
            ()-> new TiniumPickaxeItem(Tiers.STONE, new Item.Properties().attributes(
                    PickaxeItem.createAttributes(
                            Tiers.STONE,
                            1.0F,
                            -2.8F
                    )
            )));

    public static final DeferredItem<Item> TINIUM_IRON_PICKAXE = ITEMS.register("tinium_iron_pickaxe",
            ()-> new TiniumPickaxeItem(Tiers.IRON, new Item.Properties().attributes(
                    PickaxeItem.createAttributes(
                            Tiers.IRON,
                            1.0F,
                            -2.8F
                    )
            )));

    public static final DeferredItem<Item> TINIUM_GOLDEN_PICKAXE = ITEMS.register("tinium_golden_pickaxe",
            ()-> new TiniumPickaxeItem(Tiers.GOLD, new Item.Properties().attributes(
                    PickaxeItem.createAttributes(
                            Tiers.GOLD,
                            1.0F,
                            -2.8F
                    )
            )));

    public static final DeferredItem<Item> TINIUM_DIAMOND_PICKAXE = ITEMS.register("tinium_diamond_pickaxe",
            ()-> new TiniumPickaxeItem(Tiers.DIAMOND, new Item.Properties().attributes(
                    PickaxeItem.createAttributes(
                            Tiers.DIAMOND,
                            1.0F,
                            -2.8F
                    )
            )));

    public static final DeferredItem<Item> TINIUM_NETHERITE_PICKAXE = ITEMS.register("tinium_netherite_pickaxe",
            ()-> new TiniumPickaxeItem(Tiers.NETHERITE, new Item.Properties().attributes(
                    PickaxeItem.createAttributes(
                            Tiers.NETHERITE,
                            1.0F,
                            -2.8F
                    )
            )));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
