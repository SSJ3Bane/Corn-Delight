package cn.mcmod.corn_delight.client;

import cn.mcmod.corn_delight.CornDelight;
import cn.mcmod.corn_delight.block.BlockRegistry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = CornDelight.MODID, value = Dist.CLIENT)
public class ClientEvents {
    @SubscribeEvent
    public static void clientStuff(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            RenderTypeLookup.setRenderLayer(BlockRegistry.WILD_CORN.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(BlockRegistry.CORN_CROP.get(), RenderType.cutout());

        });
    }
}
