package tpod.custom_recipes_for_schale.Custom_Recipes.Music_Disks;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Music_Disk_pigstep implements Listener {
    public void MDp(){
        ShapedRecipe MDp = new ShapedRecipe(new ItemStack(Material.MUSIC_DISC_PIGSTEP))
                .shape("ABA","BCB","ABA")
                .setIngredient('A', Material.BLAZE_POWDER)
                .setIngredient('B', Material.NETHERRACK)
                .setIngredient('C', Material.GOLD_INGOT);
        getServer().addRecipe(MDp);
    }
}
