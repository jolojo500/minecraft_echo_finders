package com.jolojo500.echofinders.item;

import com.jolojo500.echofinders.EchoFindersMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(
            //no need to specify a registry since it extends Deferred register but is for well Items thus making it built for it
            EchoFindersMod.MODID
    );

    //TODO see if the current implementation in the main mod file works, if it does this function is only for good looking code
    // either implement (ModItems.register(modeEventBus) instead of the current one or delete it
    public static  void register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }

    public static final DeferredItem<Item> ANORE = ITEMS.register("amogus", ()->new Item(new Item.Properties()));


    //BlockItems, almost the same syntax

}
