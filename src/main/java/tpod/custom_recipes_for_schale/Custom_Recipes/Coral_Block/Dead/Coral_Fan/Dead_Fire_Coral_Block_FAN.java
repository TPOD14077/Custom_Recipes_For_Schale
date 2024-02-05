package tpod.custom_recipes_for_schale.Custom_Recipes.Coral_Block.Dead.Coral_Fan;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Dead_Fire_Coral_Block_FAN implements Listener {
    public void DFCB2(){
        ShapedRecipe DFCB2 = new ShapedRecipe(new ItemStack(Material.DEAD_FIRE_CORAL_BLOCK))
                .shape("AA","AA")
                .setIngredient('A', Material.DEAD_FIRE_CORAL);
        getServer().addRecipe(DFCB2);
    }
}
