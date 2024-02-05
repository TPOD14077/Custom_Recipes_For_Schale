package tpod.custom_recipes_for_schale.Custom_Recipes.Others;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Trident implements Listener {
    public void Tr(){
        ShapedRecipe Tr = new ShapedRecipe(new ItemStack(Material.TRIDENT))
                .shape(" AA"," BA","A  ")
                .setIngredient('A', Material.NETHER_STAR)
                .setIngredient('B', Material.DIAMOND);
        getServer().addRecipe(Tr);
    }
}
