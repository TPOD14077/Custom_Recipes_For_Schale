package tpod.custom_recipes_for_schale.Custom_Recipes;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Budding_Amethyst implements Listener {
    public void BA()
    {
        ShapedRecipe BA = new ShapedRecipe(new ItemStack(Material.BUDDING_AMETHYST))
                .shape("ABA", "BCB", "ABA")
                .setIngredient('A', Material.AMETHYST_BLOCK)
                .setIngredient('B', Material.AMETHYST_CLUSTER)
                .setIngredient('C', Material.LAVA_BUCKET);
        getServer().addRecipe(BA);
    }
}
