package tpod.custom_recipes_for_schale.Custom_Recipes.Others;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Name_Tag implements Listener {
    NamespacedKey key = new NamespacedKey("Name_Tag","Custom_Recipes_For_Schale");
    public void NT(){
        ShapedRecipe NT = new ShapedRecipe(key,new ItemStack(Material.NAME_TAG))
                .shape("ABB","CDB","D  ")
                .setIngredient('A', Material.FEATHER)
                .setIngredient('B', Material.STRING)
                .setIngredient('C', Material.INK_SAC)
                .setIngredient('D', Material.PAPER);
        getServer().addRecipe(NT);
    }
}
