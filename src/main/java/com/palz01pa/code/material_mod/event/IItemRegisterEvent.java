package com.palz01pa.code.material_mod.event;

import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;

public interface IItemRegisterEvent {
    void registerItem(RegistryEvent.Register<Item> event);

    void registerModel(ModelRegistryEvent event);
}