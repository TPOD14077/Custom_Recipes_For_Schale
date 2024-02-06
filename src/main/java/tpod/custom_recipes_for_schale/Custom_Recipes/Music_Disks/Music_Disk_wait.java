package tpod.custom_recipes_for_schale.Custom_Recipes.Music_Disks;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Music_Disk_wait implements Listener {
    public void MDwa(){
        ShapedRecipe MDwa = new ShapedRecipe(new ItemStack(Material.MUSIC_DISC_WAIT))
                .shape("AAA","ABA","AAA")
                .setIngredient('A', Material.GUNPOWDER)
                .setIngredient('B', Material.LIGHT_BLUE_DYE);
        getServer().addRecipe(MDwa);
    }
}
