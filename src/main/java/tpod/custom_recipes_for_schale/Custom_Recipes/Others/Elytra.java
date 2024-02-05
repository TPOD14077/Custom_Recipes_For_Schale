package tpod.custom_recipes_for_schale.Custom_Recipes.Others;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Elytra implements Listener {
    public void ely(){
        ShapedRecipe ely = new ShapedRecipe(new ItemStack(Material.ELYTRA))
                .shape("ABA", "CDC", "E E")
                .setIngredient('A', Material.WHITE_WOOL)
                .setIngredient('B', Material.CHORUS_FLOWER)
                .setIngredient('C', Material.LEATHER)
                .setIngredient('D', Material.IRON_INGOT)
                .setIngredient('E', Material.FEATHER);
        getServer().addRecipe(ely);
    }
}
