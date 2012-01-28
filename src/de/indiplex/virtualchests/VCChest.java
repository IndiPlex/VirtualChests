/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.indiplex.virtualchests;

import net.minecraft.server.EntityHuman;
import net.minecraft.server.TileEntityChest;

/**
 *
 * @author temp
 */
public class VCChest extends TileEntityChest {
    
    @Override
    public boolean a(EntityHuman entityhuman) {
        return true;
    }
    
}
