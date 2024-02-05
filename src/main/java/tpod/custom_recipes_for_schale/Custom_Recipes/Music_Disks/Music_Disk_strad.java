package tpod.custom_recipes_for_schale.Custom_Recipes.Music_Disks;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Music_Disk_strad implements Listener {
    public void MDs(){
        ShapedRecipe MDs = new ShapedRecipe(new ItemStack(Material.MUSIC_DISC_STRAD))
                .shape("AAA", "ABA", "AAA")
                .setIngredient('A', Material.GUNPOWDER)
                .setIngredient('B', Material.WHITE_DYE);
        getServer().addRecipe(MDs);
    }
}
