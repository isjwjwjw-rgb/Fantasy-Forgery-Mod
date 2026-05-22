package com.isjwjwjw.fantasyforgery.item;

import com.isjwjwjw.fantasyforgery.FantasyForgery;
import com.isjwjwjw.fantasyforgery.item.tool.terrium.TerriumPickaxeItem;
import com.isjwjwjw.fantasyforgery.item.tool.tinium.TiniumAxeItem;
import com.isjwjwjw.fantasyforgery.item.tool.tinium.TiniumHoeItem;
import com.isjwjwjw.fantasyforgery.item.tool.tinium.TiniumPickaxeItem;
import com.isjwjwjw.fantasyforgery.item.tool.tinium.TiniumShovelItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ShovelItem;
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
                    ShovelItem.createAttributes(
                            Tiers.STONE,
                            1.0F,
                            -2.8F
                    )
            )));

    public static final DeferredItem<Item> TINIUM_IRON_SHOVEL = ITEMS.register("tinium_iron_shovel",
            ()-> new TiniumShovelItem(Tiers.IRON, new Item.Properties().attributes(
                    ShovelItem.createAttributes(
                            Tiers.IRON,
                            1.0F,
                            -2.8F
                    )
            )));

    public static final DeferredItem<Item> TINIUM_GOLDEN_SHOVEL = ITEMS.register("tinium_golden_shovel",
            ()-> new TiniumShovelItem(Tiers.GOLD, new Item.Properties().attributes(
                    ShovelItem.createAttributes(
                            Tiers.GOLD,
                            1.0F,
                            -2.8F
                    )
            )));

    public static final DeferredItem<Item> TINIUM_DIAMOND_SHOVEL = ITEMS.register("tinium_diamond_shovel",
            ()-> new TiniumShovelItem(Tiers.DIAMOND, new Item.Properties().attributes(
                    ShovelItem.createAttributes(
                            Tiers.DIAMOND,
                            1.0F,
                            -2.8F
                    )
            )));

    public static final DeferredItem<Item> TINIUM_NETHERITE_SHOVEL = ITEMS.register("tinium_netherite_shovel",
            ()-> new TiniumShovelItem(Tiers.NETHERITE, new Item.Properties().attributes(
                    ShovelItem.createAttributes(
                            Tiers.NETHERITE,
                            1.0F,
                            -2.8F
                    )
            )));

    public static final DeferredItem<Item> TINIUM_STONE_AXE = ITEMS.register("tinium_stone_axe",
            ()-> new TiniumAxeItem(Tiers.STONE, new Item.Properties().attributes(
                    AxeItem.createAttributes(
                            Tiers.STONE,
                            1.0F,
                            -2.8F
                    )
            )));

    public static final DeferredItem<Item> TINIUM_IRON_AXE = ITEMS.register("tinium_iron_axe",
            ()-> new TiniumAxeItem(Tiers.IRON, new Item.Properties().attributes(
                    AxeItem.createAttributes(
                            Tiers.IRON,
                            1.0F,
                            -2.8F
                    )
            )));

    public static final DeferredItem<Item> TINIUM_GOLDEN_AXE = ITEMS.register("tinium_golden_axe",
            ()-> new TiniumAxeItem(Tiers.GOLD, new Item.Properties().attributes(
                    AxeItem.createAttributes(
                            Tiers.GOLD,
                            1.0F,
                            -2.8F
                    )
            )));

    public static final DeferredItem<Item> TINIUM_DIAMOND_AXE = ITEMS.register("tinium_diamond_axe",
            ()-> new TiniumAxeItem(Tiers.DIAMOND, new Item.Properties().attributes(
                    AxeItem.createAttributes(
                            Tiers.DIAMOND,
                            1.0F,
                            -2.8F
                    )
            )));

    public static final DeferredItem<Item> TINIUM_NETHERITE_AXE = ITEMS.register("tinium_netherite_axe",
            ()-> new TiniumHoeItem(Tiers.NETHERITE, new Item.Properties().attributes(
                    AxeItem.createAttributes(
                            Tiers.NETHERITE,
                            1.0F,
                            -2.8F
                    )
            )));

    public static final DeferredItem<Item> TINIUM_STONE_HOE = ITEMS.register("tinium_stone_hoe",
            ()-> new TiniumHoeItem(Tiers.STONE, new Item.Properties().attributes(
                    HoeItem.createAttributes(
                            Tiers.STONE,
                            1.0F,
                            -2.8F
                    )
            )));

    public static final DeferredItem<Item> TINIUM_IRON_HOE = ITEMS.register("tinium_iron_hoe",
            ()-> new TiniumHoeItem(Tiers.IRON, new Item.Properties().attributes(
                    HoeItem.createAttributes(
                            Tiers.IRON,
                            1.0F,
                            -2.8F
                    )
            )));

    public static final DeferredItem<Item> TINIUM_GOLDEN_HOE = ITEMS.register("tinium_golden_hoe",
            ()-> new TiniumHoeItem(Tiers.GOLD, new Item.Properties().attributes(
                    HoeItem.createAttributes(
                            Tiers.GOLD,
                            1.0F,
                            -2.8F
                    )
            )));

    public static final DeferredItem<Item> TINIUM_DIAMOND_HOE = ITEMS.register("tinium_diamond_hoe",
            ()-> new TiniumHoeItem(Tiers.DIAMOND, new Item.Properties().attributes(
                    HoeItem.createAttributes(
                            Tiers.DIAMOND,
                            1.0F,
                            -2.8F
                    )
            )));

    public static final DeferredItem<Item> TINIUM_NETHERITE_HOE = ITEMS.register("tinium_netherite_hoe",
            ()-> new TiniumHoeItem(Tiers.NETHERITE, new Item.Properties().attributes(
                    HoeItem.createAttributes(
                            Tiers.NETHERITE,
                            1.0F,
                            -2.8F
                    )
            )));

    public static final DeferredItem<Item> TERRIUM_IRON_PICKAXE = ITEMS.register("terrium_iron_pickaxe",
            ()-> new TerriumPickaxeItem(Tiers.IRON, new Item.Properties().attributes(
                    PickaxeItem.createAttributes(
                            Tiers.IRON,
                            1.0F,
                            -2.8F
                    )
            )));

    public static final DeferredItem<Item> TERRIUM_DIAMOND_PICKAXE = ITEMS.register("terrium_diamond_pickaxe",
            ()-> new TerriumPickaxeItem(Tiers.DIAMOND, new Item.Properties().attributes(
                    PickaxeItem.createAttributes(
                            Tiers.DIAMOND,
                            1.0F,
                            -2.8F
                    )
            )));

    public static final DeferredItem<Item> TERRIUM_NETHERITE_PICKAXE = ITEMS.register("terrium_netherite_pickaxe",
            ()-> new TerriumPickaxeItem(Tiers.NETHERITE, new Item.Properties().attributes(
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
