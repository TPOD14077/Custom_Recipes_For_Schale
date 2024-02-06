package tpod.custom_recipes_for_schale.Custom_Recipes.Music_Disks;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Music_Disk_cat implements Listener {
    public void MDc(){
        ShapedRecipe MDc = new ShapedRecipe(new ItemStack(Material.MUSIC_DISC_CAT))
                .shape("AAA","ABA","AAA")
                .setIngredient('A', Material.GUNPOWDER)
                .setIngredient('B', Material.LIME_DYE);
        getServer().addRecipe(MDc);
    }
}
