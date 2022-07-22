package com.palz01pa.code.material_mod;

import com.palz01pa.code.material_mod.proxy.CommonProxy;
import com.palz01pa.code.material_mod.tab.MaterialItemTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(
        modid = Material_mod.MOD_ID,
        name = Material_mod.MOD_NAME,
        version = Material_mod.VERSION
)
public class Material_mod {

    public static final String MOD_ID = "material_mod";
    public static final String MOD_NAME = "Material_mod";
    public static final String VERSION = "0.1.0";

    public static final String CLIENT_PROXY = "com.palz01pa.code." + MOD_ID + ".proxy.ClientProxy";
    public static final String SERVER_PROXY = "com.palz01pa.code." + MOD_ID + ".proxy.ServerProxy";

    @SidedProxy(clientSide = CLIENT_PROXY, serverSide = SERVER_PROXY)
    public static CommonProxy proxy;

    public static CreativeTabs MaterialItemTab = new MaterialItemTab();

    @Mod.EventHandler
    public void construct(FMLConstructionEvent event) {
        MinecraftForge.EVENT_BUS.register(proxy);
    }

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

}