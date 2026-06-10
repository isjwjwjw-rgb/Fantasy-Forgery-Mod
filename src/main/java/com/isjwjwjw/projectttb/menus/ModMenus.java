package com.isjwjwjw.projectttb.menus; // Controlla che il pacchetto sia lo stesso di ModBlockEntities

import com.isjwjwjw.projectttb.block.infuser.InfuserMenu;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModMenus {
    // Sostituisci "projectttb" con il tuo MOD ID reale se diverso
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(BuiltInRegistries.MENU, "projectttb");

    // Registriamo il tipo di Menu per l'Infuser
    public static final DeferredHolder<MenuType<?>, MenuType<InfuserMenu>> INFUSER_MENU =
            MENUS.register("infuser_menu", () ->
                    IMenuTypeExtension.create((containerId, playerInventory, buf) ->
                            new InfuserMenu(containerId, playerInventory)
                    )
            );
}