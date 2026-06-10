package com.isjwjwjw.projectttb.block.infuser;

import com.isjwjwjw.projectttb.block.ModBlockEntities;
import com.isjwjwjw.projectttb.item.ModItems;
import com.isjwjwjw.projectttb.item.ModTools;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Container;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class InfuserBlockEntity extends BlockEntity implements MenuProvider {

    private final SimpleContainer inventory = new SimpleContainer(9) {
        @Override
        public void setChanged() {
            super.setChanged();
            InfuserBlockEntity.this.setChanged();
        }
    };

    public InfuserBlockEntity(BlockPos pos, BlockState blockState) {
        super(ModBlockEntities.INFUSER_BE.get(), pos, blockState);
    }

    @Override
    public Component getDisplayName() {
        return Component.translatable("block.projectttb.infuser");
    }

    @Override
    public @Nullable AbstractContainerMenu createMenu(int containerId, Inventory playerInventory, Player player) {
        return new InfuserMenu(containerId, playerInventory, this.inventory);
    }


    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.saveAdditional(tag, registries);
        tag.put("inventory", inventory.createTag(registries));
    }


    @Override
    protected void loadAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.loadAdditional(tag, registries);
        if (tag.contains("inventory")) {
            inventory.fromTag(tag.getList("inventory", 10), registries);
        }
    }

    private ItemStack getResultingItem() {
        ItemStack tool = this.inventory.getItem(2);
        ItemStack mineral = this.inventory.getItem(0);
        ItemStack upgrade = this.inventory.getItem(1);

        List<Item> upgradeValid = List.of(
                ModItems.UPGRADE_PICKAXE.get(),
                ModItems.UPGRADE_AXE.get(),
                ModItems.UPGRADE_SHOVEL.get(),
                ModItems.UPGRADE_HOE.get());
        if (tool.isEmpty() || mineral.isEmpty() || upgrade.isEmpty()) {
            return ItemStack.EMPTY;
        }
        boolean correctOutput = upgradeValid.contains(upgrade.getItem());
        if (!correctOutput) {
            return ItemStack.EMPTY;
        }

        if (tool.is(Items.IRON_PICKAXE) && mineral.is(ModItems.TERRIUM_INGOT.get()) && upgrade.is(ModItems.UPGRADE_PICKAXE.get())) {
            return new ItemStack(ModTools.TERRIUM_IRON_PICKAXE.get());
        }
        if (tool.is(Items.DIAMOND_PICKAXE) && mineral.is(ModItems.TERRIUM_INGOT.get()) && upgrade.is(ModItems.UPGRADE_PICKAXE.get())) {
            return new ItemStack(ModTools.TERRIUM_DIAMOND_PICKAXE.get());
        }
        if (tool.is(Items.NETHERITE_PICKAXE) && mineral.is(ModItems.TERRIUM_INGOT.get()) && upgrade.is(ModItems.UPGRADE_AXE.get())) {
            return new ItemStack(ModTools.TERRIUM_NETHERITE_PICKAXE.get());
        }
        if (tool.is(Items.IRON_AXE) && mineral.is(ModItems.TERRIUM_INGOT.get()) && upgrade.is(ModItems.UPGRADE_AXE.get())) {
            return new ItemStack(ModTools.TERRIUM_IRON_AXE.get());
        }
        if (tool.is(Items.DIAMOND_AXE) && mineral.is(ModItems.TERRIUM_INGOT.get()) && upgrade.is(ModItems.UPGRADE_AXE.get())) {
            return new ItemStack(ModTools.TERRIUM_DIAMOND_AXE.get());
        }
        if (tool.is(Items.NETHERITE_AXE) && mineral.is(ModItems.TERRIUM_INGOT.get()) && upgrade.is(ModItems.UPGRADE_AXE.get())) {
            return new ItemStack(ModTools.TERRIUM_NETHERITE_AXE.get());
        }
        if (tool.is(Items.IRON_SHOVEL) && mineral.is(ModItems.TERRIUM_INGOT.get()) && upgrade.is(ModItems.UPGRADE_SHOVEL.get())) {
            return new ItemStack(ModTools.TERRIUM_IRON_SHOVEL.get());
        }
        if (tool.is(Items.DIAMOND_SHOVEL) && mineral.is(ModItems.TERRIUM_INGOT.get()) && upgrade.is(ModItems.UPGRADE_SHOVEL.get())) {
            return new ItemStack(ModTools.TERRIUM_DIAMOND_SHOVEL.get());
        }
        if (tool.is(Items.NETHERITE_SHOVEL) && mineral.is(ModItems.TERRIUM_INGOT.get()) && upgrade.is(ModItems.UPGRADE_SHOVEL.get())) {
            return new ItemStack(ModTools.TERRIUM_NETHERITE_SHOVEL.get());
        }
        if (tool.is(Items.IRON_HOE) && mineral.is(ModItems.TERRIUM_INGOT.get()) && upgrade.is(ModItems.UPGRADE_HOE.get())) {
            return new ItemStack(ModTools.TERRIUM_IRON_HOE.get());
        }
        if (tool.is(Items.DIAMOND_HOE) && mineral.is(ModItems.TERRIUM_INGOT.get()) && upgrade.is(ModItems.UPGRADE_HOE.get())) {
            return new ItemStack(ModTools.TERRIUM_DIAMOND_HOE.get());
        }
        if (tool.is(Items.NETHERITE_HOE) && mineral.is(ModItems.TERRIUM_INGOT.get()) && upgrade.is(ModItems.UPGRADE_HOE.get())) {
            return new ItemStack(ModTools.TERRIUM_NETHERITE_HOE.get());
        }
        if (tool.is(Items.STONE_AXE) && mineral.is(ModItems.TINIUM_INGOT.get()) && upgrade.is(ModItems.UPGRADE_AXE.get())) {
            return new ItemStack(ModTools.TINIUM_STONE_AXE.get());
        }
        if (tool.is(Items.IRON_AXE) && mineral.is(ModItems.TINIUM_INGOT.get()) && upgrade.is(ModItems.UPGRADE_AXE.get())) {
            return new ItemStack(ModTools.TINIUM_IRON_AXE.get());
        }
        if (tool.is(Items.GOLDEN_AXE) && mineral.is(ModItems.TINIUM_INGOT.get()) && upgrade.is(ModItems.UPGRADE_AXE.get())) {
            return new ItemStack(ModTools.TINIUM_GOLDEN_AXE.get());
        }
        if (tool.is(Items.DIAMOND_AXE) && mineral.is(ModItems.TINIUM_INGOT.get()) && upgrade.is(ModItems.UPGRADE_AXE.get())) {
            return new ItemStack(ModTools.TINIUM_DIAMOND_AXE.get());
        }
        if (tool.is(Items.NETHERITE_AXE) && mineral.is(ModItems.TINIUM_INGOT.get()) && upgrade.is(ModItems.UPGRADE_AXE.get())) {
            return new ItemStack(ModTools.TINIUM_NETHERITE_AXE.get());
        }
        if (tool.is(Items.STONE_SHOVEL) && mineral.is(ModItems.TINIUM_INGOT.get()) && upgrade.is(ModItems.UPGRADE_SHOVEL.get())) {
            return new ItemStack(ModTools.TINIUM_STONE_SHOVEL.get());
        }
        if (tool.is(Items.IRON_SHOVEL) && mineral.is(ModItems.TINIUM_INGOT.get()) && upgrade.is(ModItems.UPGRADE_SHOVEL.get())) {
            return new ItemStack(ModTools.TINIUM_IRON_SHOVEL.get());
        }
        if (tool.is(Items.GOLDEN_SHOVEL) && mineral.is(ModItems.TINIUM_INGOT.get()) && upgrade.is(ModItems.UPGRADE_SHOVEL.get())) {
            return new ItemStack(ModTools.TINIUM_GOLDEN_SHOVEL.get());
        }
        if (tool.is(Items.DIAMOND_SHOVEL) && mineral.is(ModItems.TINIUM_INGOT.get()) && upgrade.is(ModItems.UPGRADE_SHOVEL.get())) {
            return new ItemStack(ModTools.TINIUM_DIAMOND_SHOVEL.get());
        }
        if (tool.is(Items.NETHERITE_SHOVEL) && mineral.is(ModItems.TINIUM_INGOT.get()) && upgrade.is(ModItems.UPGRADE_SHOVEL.get())) {
            return new ItemStack(ModTools.TINIUM_NETHERITE_SHOVEL.get());
        }
        if (tool.is(Items.STONE_PICKAXE) && mineral.is(ModItems.TINIUM_INGOT.get()) && upgrade.is(ModItems.UPGRADE_PICKAXE.get())) {
            return new ItemStack(ModTools.TINIUM_STONE_PICKAXE.get());
        }
        if (tool.is(Items.IRON_PICKAXE) && mineral.is(ModItems.TINIUM_INGOT.get()) && upgrade.is(ModItems.UPGRADE_PICKAXE.get())) {
            return new ItemStack(ModTools.TINIUM_IRON_PICKAXE.get());
        }
        if (tool.is(Items.GOLDEN_PICKAXE) && mineral.is(ModItems.TINIUM_INGOT.get()) && upgrade.is(ModItems.UPGRADE_PICKAXE.get())) {
            return new ItemStack(ModTools.TINIUM_GOLDEN_PICKAXE.get());
        }
        if (tool.is(Items.DIAMOND_PICKAXE) && mineral.is(ModItems.TINIUM_INGOT.get()) && upgrade.is(ModItems.UPGRADE_PICKAXE.get())) {
            return new ItemStack(ModTools.TINIUM_DIAMOND_PICKAXE.get());
        }
        if (tool.is(Items.NETHERITE_PICKAXE) && mineral.is(ModItems.TINIUM_INGOT.get()) && upgrade.is(ModItems.UPGRADE_PICKAXE.get())) {
            return new ItemStack(ModTools.TINIUM_NETHERITE_PICKAXE.get());
        }
        if (tool.is(Items.STONE_HOE) && mineral.is(ModItems.TINIUM_INGOT.get()) && upgrade.is(ModItems.UPGRADE_HOE.get())) {
            return new ItemStack(ModTools.TINIUM_STONE_HOE.get());
        }
        if (tool.is(Items.IRON_HOE) && mineral.is(ModItems.TINIUM_INGOT.get()) && upgrade.is(ModItems.UPGRADE_HOE.get())) {
            return new ItemStack(ModTools.TINIUM_IRON_HOE.get());
        }
        if (tool.is(Items.GOLDEN_HOE) && mineral.is(ModItems.TINIUM_INGOT.get()) && upgrade.is(ModItems.UPGRADE_HOE.get())) {
            return new ItemStack(ModTools.TINIUM_GOLDEN_HOE.get());
        }
        if (tool.is(Items.DIAMOND_HOE) && mineral.is(ModItems.TINIUM_INGOT.get()) && upgrade.is(ModItems.UPGRADE_HOE.get())) {
            return new ItemStack(ModTools.TINIUM_DIAMOND_HOE.get());
        }
        if (tool.is(Items.NETHERITE_HOE) && mineral.is(ModItems.TINIUM_INGOT.get()) && upgrade.is(ModItems.UPGRADE_HOE.get())) {
            return new ItemStack(ModTools.TINIUM_NETHERITE_HOE.get());
        }

        return ItemStack.EMPTY;
    }

    private void craftItem() {
        this.inventory.removeItem(0, 1);
        this.inventory.removeItem(1, 1);
        this.inventory.removeItem(2, 1);
    }

    public Container getInventory(){
        return this.inventory;
    }

    public static void tick(Level level, BlockPos pos, BlockState state, InfuserBlockEntity blockEntity) {
        if (level.isClientSide()) return;

        ItemStack possibleResult = blockEntity.getResultingItem();
        ItemStack currentOutput = blockEntity.inventory.getItem(3);

        if (!possibleResult.isEmpty()) {
            if (currentOutput.isEmpty() || currentOutput.getItem() != possibleResult.getItem()) {
                blockEntity.inventory.setItem(3, possibleResult.copy());
            }
        } else {
            if (!currentOutput.isEmpty()) {
                blockEntity.inventory.setItem(3, ItemStack.EMPTY);
            }
        }
    }
}