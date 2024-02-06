package tpod.custom_recipes_for_schale.Custom_Recipes.Others;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Trident implements Listener {
    NamespacedKey key = new NamespacedKey("Trident","Custom_Recipes_For_Schale");
    public void Tr(){
        ShapedRecipe Tr = new ShapedRecipe(key,new ItemStack(Material.TRIDENT))
                .shape(" AA"," BA","B  ")
                .setIngredient('A', Material.NETHER_STAR)
                .setIngredient('B', Material.DIAMOND);
        getServer().addRecipe(Tr);
    }
}
