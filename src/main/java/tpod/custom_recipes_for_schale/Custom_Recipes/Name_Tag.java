package tpod.custom_recipes_for_schale.Custom_Recipes;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Name_Tag implements Listener {
    public void NT(){
        ShapedRecipe NT = new ShapedRecipe(new ItemStack(Material.NAME_TAG))
                .shape("ABB","CDB","D  ")
                .setIngredient('A', Material.FEATHER)
                .setIngredient('B', Material.STRING)
                .setIngredient('C', Material.INK_SAC)
                .setIngredient('D', Material.PAPER);
        getServer().addRecipe(NT);
    }
}
