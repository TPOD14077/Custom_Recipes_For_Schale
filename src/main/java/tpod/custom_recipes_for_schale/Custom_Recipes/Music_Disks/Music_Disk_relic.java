package tpod.custom_recipes_for_schale.Custom_Recipes.Music_Disks;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Music_Disk_relic implements Listener {
    public void MDr(){
        ShapedRecipe MDr = new ShapedRecipe(new ItemStack(Material.MUSIC_DISC_RELIC))
                .shape("ABA","BCB","ABA")
                .setIngredient('A', Material.BLAZE_POWDER)
                .setIngredient('B', Material.NETHERRACK)
                .setIngredient('C', Material.DIAMOND);
        getServer().addRecipe(MDr);
    }
}
