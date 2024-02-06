package tpod.custom_recipes_for_schale.Custom_Recipes.Others;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Cobweb implements Listener {
    NamespacedKey key = new NamespacedKey("Custom_Recipes_For_Schale","Cobweb");
    public void CW(){
        ShapedRecipe CW = new ShapedRecipe(key,new ItemStack(Material.COBWEB))
                .shape("AAA","ABA","AAA")
                .setIngredient('A', Material.STRING)
                .setIngredient('B', Material.SLIME_BALL);
        getServer().addRecipe(CW);
    }
}
