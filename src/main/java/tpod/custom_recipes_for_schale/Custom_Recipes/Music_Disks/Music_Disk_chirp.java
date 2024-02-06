package tpod.custom_recipes_for_schale.Custom_Recipes.Music_Disks;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Music_Disk_chirp implements Listener {
    public void MDch(){
        ShapedRecipe MDch = new ShapedRecipe(new ItemStack(Material.MUSIC_DISC_CHIRP))
                .shape("AAA","ABA","AAA")
                .setIngredient('A', Material.GUNPOWDER)
                .setIngredient('B', Material.RED_DYE);
        getServer().addRecipe(MDch);
    }
}
