package net.Yanni.mccourse.item;

import net.Yanni.mccourse.MCCourseMod;
import net.Yanni.mccourse.item.custom.ChainsawItem;
import net.Yanni.mccourse.item.custom.Paxelitem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MCCourseMod.MOD_ID);

    public static final DeferredItem<Item> BLACK_OPAL = ITEMS.registerSimpleItem("black_opal");
    public static final DeferredItem<Item> RAW_BLACK_OPAL = ITEMS.registerItem("raw_black_opal",
            properties -> new Item(properties) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.mccourse.raw_black_opal.tooltip.1"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            }, new Item.Properties());

    public static final DeferredItem<Item> CHAINSAW = ITEMS.registerItem("chainsaw",
            ChainsawItem::new, new Item.Properties().durability(128));

    public static final DeferredItem<Item> BLACK_OPAL_SWORD = ITEMS.register("black_opal_sword",
            () -> new SwordItem(ModToolsTiers.BLACK_OPAL, new Item.Properties().attributes(SwordItem.createAttributes(ModToolsTiers.BLACK_OPAL,3,-2.4f))));
    public static final DeferredItem<Item> BLACK_OPAL_PICKAXE = ITEMS.register("black_opal_pickaxe",
            () -> new PickaxeItem(ModToolsTiers.BLACK_OPAL, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolsTiers.BLACK_OPAL,1,-2.8f))));
    public static final DeferredItem<Item> BLACK_OPAL_AXE = ITEMS.register("black_opal_axe",
            () -> new AxeItem(ModToolsTiers.BLACK_OPAL, new Item.Properties().attributes(AxeItem.createAttributes(ModToolsTiers.BLACK_OPAL,6,-3.2f))));
    public static final DeferredItem<Item> BLACK_OPAL_SHOVEL = ITEMS.register("black_opal_shovel",
            () -> new ShovelItem(ModToolsTiers.BLACK_OPAL, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolsTiers.BLACK_OPAL,1.5f,-3f))));
    public static final DeferredItem<Item> BLACK_OPAL_HOE = ITEMS.register("black_opal_hoe",
            () -> new HoeItem(ModToolsTiers.BLACK_OPAL, new Item.Properties().attributes(HoeItem.createAttributes(ModToolsTiers.BLACK_OPAL,0,-3f))));

    public static final DeferredItem<Item> BLACK_OPAL_PAXEL = ITEMS.register("black_opal_paxel",
            () -> new Paxelitem(ModToolsTiers.BLACK_OPAL, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolsTiers.BLACK_OPAL,1,-2.8f))));




    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
