package tpod.custom_recipes_for_schale.Custom_Recipes.Others;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.NamespacedKey;

import static org.bukkit.Bukkit.getServer;

public class Flint implements Listener {
    NamespacedKey key = new NamespacedKey("crfs","flint");
    public void Fli(){
        ShapedRecipe Fli = new ShapedRecipe(new ItemStack(Material.FLINT))
                .shape(" A ","AAA"," AA")
                .setIngredient('A', Material.GRAVEL);
        getServer().addRecipe(Fli);
    }
}
