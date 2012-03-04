/*
 * VirtualChests
 * Copyright (C) 2012 IndiPlex
 * 
 * VirtualChests is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.indiplex.virtualchests;

import de.indiplex.manager.API;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

/**
 *
 * @author IndiPlex <Cartan12@indiplex.de>
 */
public class VCAPI implements API {
    
    private VCManager cManager;

    public VCAPI(VCManager cManager) {
        this.cManager = cManager;
    }
    
    public boolean addChest(String id) {
        return cManager.addChest(id);
    }
    
    public boolean removeChest(String id) {
        return cManager.removeChest(id);
    }
    
    public boolean hasChest(String id) {
        return cManager.hasChest(id);
    }
    
    public Inventory getChest(String id) {
        return cManager.getChest(id);
    }
    
    public boolean storeInventory(Inventory inv, String id) {
        return cManager.add(inv, id);
    }
    
    public boolean removeInventory(String id) {
        return cManager.removeInventory(id);
    }
    
    public boolean hasInventory(String id) {
        return cManager.hasInv(id);
    }
    
    public ItemStack[] getInventoryContents(String id) {
        return cManager.getInventoryContent(id);
    }
    
    public boolean fillInventory(Inventory inv, String id) {
        ItemStack[] contents = getInventoryContents(id);
        if (contents==null) {
            return false;
        }
        inv.setContents(contents);
        return true;
    }
    
    public static boolean showChest(Player player, Inventory inv) {
        if (inv==null) {
            return false;
        }
        player.openInventory(inv);
        return true;
    }
    
    public boolean showChest(Player player, String id) {
        Inventory inv = getChest(id);
        return showChest(player, inv);
    }
    
}
