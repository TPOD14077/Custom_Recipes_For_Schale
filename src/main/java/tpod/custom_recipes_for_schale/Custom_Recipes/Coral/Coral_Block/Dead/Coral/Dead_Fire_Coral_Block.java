package tpod.custom_recipes_for_schale.Custom_Recipes.Coral.Coral_Block.Dead.Coral;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Dead_Fire_Coral_Block implements Listener {
    public void DFCB(){
        ShapedRecipe DFCB = new ShapedRecipe(new ItemStack(Material.DEAD_FIRE_CORAL_BLOCK))
                .shape("AA","AA")
                .setIngredient('A', Material.DEAD_FIRE_CORAL);
        getServer().addRecipe(DFCB);
    }
}
