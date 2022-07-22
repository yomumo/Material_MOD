package com.palz01pa.code.material_mod.tab;

import com.palz01pa.code.material_mod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MaterialItemTab extends CreativeTabs {

    public MaterialItemTab() {
        super("material_item_tab");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemInit.AQUA_SOUL);
    }
}