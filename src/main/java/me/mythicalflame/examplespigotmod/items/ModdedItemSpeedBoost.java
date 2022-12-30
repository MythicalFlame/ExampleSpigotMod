package me.mythicalflame.examplespigotmod.items;

import me.mythicalflame.spigotmodding.items.ModdedItem;
import org.bukkit.Bukkit;
import org.bukkit.Material;

public class ModdedItemSpeedBoost extends ModdedItem
{
    public ModdedItemSpeedBoost()
    {
        super("example", "speed_feather", Material.FEATHER, "Speedy Feather");
    }

    @Override
    public void onRightClick()
    {
        //The speedy feather blesses the entire server with a speed boost!
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "effect give @a speed 30 1 true");
    }
}
