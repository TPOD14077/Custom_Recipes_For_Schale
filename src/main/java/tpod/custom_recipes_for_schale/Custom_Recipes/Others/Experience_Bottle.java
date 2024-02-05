package tpod.custom_recipes_for_schale.Custom_Recipes.Others;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Experience_Bottle implements Listener {
    public void EB(){
        ShapedRecipe EB = new ShapedRecipe(new ItemStack(Material.EXPERIENCE_BOTTLE,3))
                .shape(" A ","BCB"," B ")
                .setIngredient('A', Material.OAK_LOG)
                .setIngredient('B', Material.GLASS)
                .setIngredient('C', Material.EMERALD);
        getServer().addRecipe(EB);
    }
}
