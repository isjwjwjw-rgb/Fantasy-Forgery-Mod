package com.isjwjwjw.projectttb.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;

public class ToolsUpgraderItem extends Item {

    private final String tool;
    public ToolsUpgraderItem(Properties properties, String tool) {
        super(properties);
        this.tool = tool;
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        if(this.tool.equals("pickaxe")){
            tooltipComponents.add(Component.literal("Applies to: ").withStyle(ChatFormatting.GRAY));
            tooltipComponents.add(Component.literal(" Pickaxe").withStyle(ChatFormatting.BLUE));
            tooltipComponents.add(Component.literal("Ingredients: ").withStyle(ChatFormatting.GRAY));
            tooltipComponents.add(Component.literal(" Terrium, Tinium").withStyle(ChatFormatting.BLUE));
        }
        if(this.tool.equals("axe")){
            tooltipComponents.add(Component.literal("Applies to: ").withStyle(ChatFormatting.GRAY));
            tooltipComponents.add(Component.literal(" Axe").withStyle(ChatFormatting.BLUE));
            tooltipComponents.add(Component.literal("Ingredients: ").withStyle(ChatFormatting.GRAY));
            tooltipComponents.add(Component.literal(" Terrium, Tinium").withStyle(ChatFormatting.BLUE));
        }
        if(this.tool.equals("shovel")){
            tooltipComponents.add(Component.literal("Applies to: ").withStyle(ChatFormatting.GRAY));
            tooltipComponents.add(Component.literal(" Shovel").withStyle(ChatFormatting.BLUE));
            tooltipComponents.add(Component.literal("Ingredients: ").withStyle(ChatFormatting.GRAY));
            tooltipComponents.add(Component.literal(" Terrium, Tinium").withStyle(ChatFormatting.BLUE));
        }
        if(this.tool.equals("hoe")){
            tooltipComponents.add(Component.literal("Applies to: ").withStyle(ChatFormatting.GRAY));
            tooltipComponents.add(Component.literal(" Hoe").withStyle(ChatFormatting.BLUE));
            tooltipComponents.add(Component.literal("Ingredients: ").withStyle(ChatFormatting.GRAY));
            tooltipComponents.add(Component.literal(" Terrium, Tinium").withStyle(ChatFormatting.BLUE));
        }
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }
}
