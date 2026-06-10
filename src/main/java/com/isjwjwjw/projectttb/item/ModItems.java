package com.isjwjwjw.projectttb.item;

import com.isjwjwjw.projectttb.ProjectTTB;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShieldItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ProjectTTB.MOD_ID);

    public static final DeferredItem<Item> TERRIUM_INGOT = ITEMS.register("terrium_ingot",
            ()-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_TERRIUM = ITEMS.register("raw_terrium",
            ()-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_TINIUM = ITEMS.register("raw_tinium",
            ()-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TINIUM_INGOT = ITEMS.register("tinium_ingot",
            ()-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TERRIUM_SHIELD = ITEMS.register("terrium_shield",
            () -> new ShieldItem(new Item.Properties()
                    .durability(660)));

    public static final DeferredItem<Item> BRONZIUM_INGOT = ITEMS.register("bronzium_ingot",
            ()-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> UPGRADE_PICKAXE = ITEMS.register("upgrade_pickaxe",
            ()-> new ToolsUpgraderItem(new Item.Properties(), "pickaxe"));

    public static final DeferredItem<Item> UPGRADE_AXE = ITEMS.register("upgrade_axe",
            ()-> new ToolsUpgraderItem(new Item.Properties(), "axe"));

    public static final DeferredItem<Item> UPGRADE_SHOVEL = ITEMS.register("upgrade_shovel",
            ()-> new ToolsUpgraderItem(new Item.Properties(), "shovel"));

    public static final DeferredItem<Item> UPGRADE_HOE = ITEMS.register("upgrade_hoe",
            ()-> new ToolsUpgraderItem(new Item.Properties(), "hoe"));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
