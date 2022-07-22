package com.palz01pa.code.material_mod.init;

import com.palz01pa.code.material_mod.event.IItemRegisterEvent;
import com.palz01pa.code.material_mod.item.*;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {
    public static final List<IItemRegisterEvent> ITEMS = new ArrayList<IItemRegisterEvent>();

    public static final Item.ToolMaterial TOOL_EX = EnumHelper.addToolMaterial("tool_ex", 4, 131072, 6.0F, 2.0F, 22);

    public static final Item AQUA_SOUL = new AquaSoul("aqua_soul");
    public static final Item ENERGY_SOUL = new EnergySoul("energy_soul");
    public static final Item SOUL_LESS = new SoulLess("soul_less");
    public static final Item PARTICLE_BOARD_SHEET = new ParticleBoardSheet("particle_board_sheet");
    public static final Item FRAME_PACKAGE = new FramePackage("frame_package");
    public static final Item LIFE_LIGHT = new LifeLight("life_light");
}