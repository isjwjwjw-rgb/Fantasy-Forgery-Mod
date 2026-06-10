package com.isjwjwjw.projectttb.block.infuser;

import com.isjwjwjw.projectttb.menus.ModMenus;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;

public class InfuserMenu extends AbstractContainerMenu {

    private final Container container;

    public InfuserMenu(int containerId, Inventory playerInventory) {
        this(containerId, playerInventory, new SimpleContainer(4));
    }
    public InfuserMenu(int containerId, Inventory playerInventory, Container container) {
        super(ModMenus.INFUSER_MENU.get(), containerId);

        checkContainerSize(container, 4);
        this.container = container;
        container.startOpen(playerInventory.player);


        this.addSlot(new Slot(container, 0, 50, 48));
        this.addSlot(new Slot(container, 1, 72, 48));
        this.addSlot(new Slot(container, 2, 60, 26));
        this.addSlot(new Slot(container, 3, 134, 48) {
            @Override
            public boolean mayPlace(ItemStack stack) {
                return false;
            }

            @Override
            public void onTake(Player player, ItemStack stack) {
                decreaseInputItems();
                super.onTake(player, stack);
            }
        });


        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 9; col++) {
                this.addSlot(new Slot(playerInventory, col + row * 9 + 9, 8 + col * 18, 84 + row * 18));
            }
        }

        for (int col = 0; col < 9; col++) {
            this.addSlot(new Slot(playerInventory, col, 8 + col * 18, 142));
        }
    }


    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.slots.get(index);

        if (slot != null && slot.hasItem()) {
            ItemStack itemstack1 = slot.getItem();
            itemstack = itemstack1.copy();


            if (index < 4) {

                if (!this.moveItemStackTo(itemstack1, 4, 40, true)) {
                    return ItemStack.EMPTY;
                }
            }
            else {
                if (!this.moveItemStackTo(itemstack1, 0, 3, false)) {
                    if (index < 31) {
                        if (!this.moveItemStackTo(itemstack1, 31, 40, false)) {
                            return ItemStack.EMPTY;
                        }
                    } else if (!this.moveItemStackTo(itemstack1, 4, 31, false)) {
                        return ItemStack.EMPTY;
                    }
                }
            }

            if (itemstack1.isEmpty()) {
                slot.setByPlayer(ItemStack.EMPTY);
            } else {
                slot.setChanged();
            }
        }
        return itemstack;
    }

    @Override
    public boolean stillValid(Player player) {
        return this.container.stillValid(player);
    }

    @Override
    public void removed(Player player) {
        super.removed(player);
        this.container.stopOpen(player);
    }

    private void decreaseInputItems() {
        ItemStack mineral = this.slots.get(0).getItem();
        ItemStack upgrade = this.slots.get(1).getItem();
        ItemStack tool = this.slots.get(2).getItem();

        if (!mineral.isEmpty()) mineral.shrink(1);
        if (!upgrade.isEmpty()) upgrade.shrink(1);
        if (!tool.isEmpty()) tool.shrink(1);

        this.broadcastChanges();
    }
}