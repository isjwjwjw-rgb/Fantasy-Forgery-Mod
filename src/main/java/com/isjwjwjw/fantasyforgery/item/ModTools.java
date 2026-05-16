package com.isjwjwjw.fantasyforgery.item;

import com.isjwjwjw.fantasyforgery.FantasyForgery;
import com.isjwjwjw.fantasyforgery.item.tool.TiniumPickaxeItem;
import com.isjwjwjw.fantasyforgery.item.tool.TiniumShovelItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModTools {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FantasyForgery.MOD_ID);

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

    public static final DeferredItem<Item> TINIUM_STONE_SHOVEL = ITEMS.register("tinium_stone_shovel",
            ()-> new TiniumShovelItem(Tiers.STONE, new Item.Properties().attributes(
                    PickaxeItem.createAttributes(
                            Tiers.STONE,
                            1.0F,
                            -2.8F
                    )
            )));

    public static final DeferredItem<Item> TINIUM_IRON_SHOVEL = ITEMS.register("tinium_iron_shovel",
            ()-> new TiniumShovelItem(Tiers.IRON, new Item.Properties().attributes(
                    PickaxeItem.createAttributes(
                            Tiers.IRON,
                            1.0F,
                            -2.8F
                    )
            )));

    public static final DeferredItem<Item> TINIUM_GOLDEN_SHOVEL = ITEMS.register("tinium_golden_shovel",
            ()-> new TiniumShovelItem(Tiers.GOLD, new Item.Properties().attributes(
                    PickaxeItem.createAttributes(
                            Tiers.GOLD,
                            1.0F,
                            -2.8F
                    )
            )));

    public static final DeferredItem<Item> TINIUM_DIAMOND_SHOVEL = ITEMS.register("tinium_diamond_shovel",
            ()-> new TiniumShovelItem(Tiers.DIAMOND, new Item.Properties().attributes(
                    PickaxeItem.createAttributes(
                            Tiers.DIAMOND,
                            1.0F,
                            -2.8F
                    )
            )));

    public static final DeferredItem<Item> TINIUM_NETHERITE_SHOVEL = ITEMS.register("tinium_netherite_shovel",
            ()-> new TiniumShovelItem(Tiers.NETHERITE, new Item.Properties().attributes(
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
