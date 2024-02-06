package tpod.custom_recipes_for_schale.Custom_Recipes.Others;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Cobweb implements Listener {
    public void CW(){
        ShapedRecipe CW = new ShapedRecipe(new ItemStack(Material.COBWEB))
                .shape("AAA","ABA","AAA")
                .setIngredient('A', Material.STRING)
                .setIngredient('B', Material.SLIME_BALL);
        getServer().addRecipe(CW);
    }
}
