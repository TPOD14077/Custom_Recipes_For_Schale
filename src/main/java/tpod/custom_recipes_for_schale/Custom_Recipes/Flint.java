package tpod.custom_recipes_for_schale.Custom_Recipes;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Flint implements Listener {
    public void Fli(){
        ShapedRecipe Fli = new ShapedRecipe(new ItemStack(Material.FLINT))
                .shape(" A ","AAA"," AA")
                .setIngredient('A', Material.GRAVEL);
        getServer().addRecipe(Fli);
    }
}
