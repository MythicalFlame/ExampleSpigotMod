package me.mythicalflame.examplespigotmod.items;

import me.mythicalflame.spigotmodding.items.ModdedConsumable;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.player.PlayerItemConsumeEvent;

public class ModdedConsumableSpeedBoost extends ModdedConsumable
{
    public ModdedConsumableSpeedBoost()
    {
        super("example", "speed_charm", Material.RABBIT, "Speed Charm");
    }

    @Override
    public void onConsume(PlayerItemConsumeEvent event)
    {
        //The speed charm blesses the entire server with a speed boost!
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "effect give @a speed 30 0 true");
    }
}
