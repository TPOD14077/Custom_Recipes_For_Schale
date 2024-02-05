package tpod.custom_recipes_for_schale.Custom_Recipes.Music_Disks;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Music_Disk_mellohi implements Listener {
    public void MDm(){
        ShapedRecipe MDm = new ShapedRecipe(new ItemStack(Material.MUSIC_DISC_MELLOHI))
                .shape("AAA", "ABA", "AAA")
                .setIngredient('A', Material.GUNPOWDER)
                .setIngredient('B', Material.MAGENTA_DYE);
        getServer().addRecipe(MDm);
    }
}
