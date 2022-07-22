package com.palz01pa.code.material_mod.proxy;

import com.palz01pa.code.material_mod.init.ItemInit;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
    }

    @SubscribeEvent
    public void registerModels(ModelRegistryEvent event) {
        ItemInit.ITEMS.forEach(f -> f.registerModel(event));
    }
}