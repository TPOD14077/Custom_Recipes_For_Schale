package tpod.custom_recipes_for_schale.Custom_Recipes.Music_Disks;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Music_Disk_13 implements Listener {
    public void MD13(){
        ShapedRecipe MD13 = new ShapedRecipe(new ItemStack(Material.MUSIC_DISC_13))
                .shape("AAA","ABA","AAA")
                .setIngredient('A', Material.GUNPOWDER)
                .setIngredient('B', Material.YELLOW_DYE);
        getServer().addRecipe(MD13);
    }
}
