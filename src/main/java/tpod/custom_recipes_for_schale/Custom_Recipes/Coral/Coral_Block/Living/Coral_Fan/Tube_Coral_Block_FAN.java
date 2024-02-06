package tpod.custom_recipes_for_schale.Custom_Recipes.Coral.Coral_Block.Living.Coral_Fan;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Tube_Coral_Block_FAN implements Listener {
    public void TCB2(){
        ShapedRecipe TCB2 = new ShapedRecipe(new ItemStack(Material.TUBE_CORAL_BLOCK))
                .shape("AA","AA")
                .setIngredient('A', Material.TUBE_CORAL_FAN);
        getServer().addRecipe(TCB2);
    }
}
