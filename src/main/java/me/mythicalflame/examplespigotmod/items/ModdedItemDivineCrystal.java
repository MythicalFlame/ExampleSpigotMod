package me.mythicalflame.examplespigotmod.items;

import me.mythicalflame.spigotmodding.items.ModdedItem;
import org.bukkit.Material;

public class ModdedItemDivineCrystal extends ModdedItem
{
    public ModdedItemDivineCrystal()
    {
        super("example", "divine_crystal", Material.DIAMOND, "Divine Crystal");
    }

    @Override
    public void onRightClick()
    {
        //tells console that the divine crystal was right clicked with
        System.out.println("The divine crystal was used!");
    }
}
