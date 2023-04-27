package fr.iamacat.itemframeremover;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import fr.iamacat.itemframeremover.proxy.ServerProxy;
import fr.iamacat.itemframeremover.remover.ItemFrameDestroyer;
import fr.iamacat.itemframeremover.utils.Reference;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, acceptedMinecraftVersions = Reference.MC_VERSION)
public class ItemFrameRemover {
    @Mod.Instance(Reference.MOD_ID)
    public static ItemFrameRemover instance;
    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static ServerProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event) {
    }


    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        // Register the ItemFrameDestroyer class as an event handler
        MinecraftForge.EVENT_BUS.register(new ItemFrameDestroyer());
        // Register the proxy as an event handler
        MinecraftForge.EVENT_BUS.register(proxy);
    }
    }