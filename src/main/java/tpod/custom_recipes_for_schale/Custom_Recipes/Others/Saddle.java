package tpod.custom_recipes_for_schale.Custom_Recipes.Others;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Saddle implements Listener {
    public void sd(){
        ShapedRecipe sd = new ShapedRecipe(new ItemStack(Material.SADDLE))
                .shape("ABA","CDC","C C")
                .setIngredient('A', Material.STRING)
                .setIngredient('B', Material.WHITE_WOOL)
                .setIngredient('C', Material.LEATHER)
                .setIngredient('D', Material.IRON_INGOT);
        getServer().addRecipe(sd);
    }
}
