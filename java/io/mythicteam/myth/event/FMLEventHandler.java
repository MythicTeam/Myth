package io.mythicteam.myth.event;

import io.mythicteam.myth.Myth;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

public class FMLEventHandler {
    @SubscribeEvent
    public void clientConnection(PlayerLoggedInEvent event)
    {
    	event.player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GREEN + "This world is running " + EnumChatFormatting.LIGHT_PURPLE + Myth.NAME + EnumChatFormatting.AQUA + " version " + Myth.VERSION + EnumChatFormatting.GREEN + "."));
    }
}
