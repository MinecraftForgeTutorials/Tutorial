package ninja.moddingtuts;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import ninja.moddingtuts.init.MTItems;
import ninja.moddingtuts.proxy.IProxy;
import ninja.moddingtuts.reference.Reference;

@Mod(modid = ModdingTuts.MOD_ID, name = ModdingTuts.MOD_NAME, version = ModdingTuts.MOD_VERSION)
public class ModdingTuts 
{
    public static final String MOD_ID = "moddingtuts";
    public static final String MOD_NAME = "Modding Tuts";
    public static final String MOD_VERSION = "@VERSION@";

    @Mod.Instance(ModdingTuts.MOD_ID)
    public static ModdingTuts instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        MTItems.initializeItems();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
