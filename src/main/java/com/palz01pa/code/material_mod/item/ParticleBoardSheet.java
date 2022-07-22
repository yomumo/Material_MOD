package com.palz01pa.code.material_mod.item;

import com.palz01pa.code.material_mod.Material_mod;
import com.palz01pa.code.material_mod.event.IItemRegisterEvent;
import com.palz01pa.code.material_mod.init.ItemInit;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;

public class ParticleBoardSheet extends Item implements IItemRegisterEvent {

    private final String name;

    public ParticleBoardSheet(String name) {
        super();
        this.name = name;
        this.setTranslationKey(this.name);
        this.setRegistryName(Material_mod.MOD_ID, this.name);
        this.setCreativeTab(Material_mod.MaterialItemTab);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerItem(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(this);
    }

    public void registerModel(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(this, 0,
                new ModelResourceLocation(new ResourceLocation(Material_mod.MOD_ID, this.name), "inventory"));
    }
}
