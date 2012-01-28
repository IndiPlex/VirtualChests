/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.indiplex.virtualchests;

import net.minecraft.server.InventoryLargeChest;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 *
 * @author temp
 */
public class VCLargeChest {
    
    private VCChest chest1;
    private VCChest chest2;
    private InventoryLargeChest largeChest;

    public VCLargeChest(String id) {
        chest1 = new VCChest();
        chest2 = new VCChest();
        largeChest = new InventoryLargeChest(id, chest1, chest2);
    }
    
    public boolean removeItem(Material mat, int amount) {
        ItemStack iStack = new ItemStack(mat, amount);
        return true;
    }
    
}
