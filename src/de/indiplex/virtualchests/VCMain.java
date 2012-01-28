/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.indiplex.virtualchests;

import de.indiplex.manager.IPMAPI;
import de.indiplex.manager.IPMPlugin;

/**
 *
 * @author temp
 */
public class VCMain extends IPMPlugin{
    
    private VCManager chestManager;

    @Override
    public void onIPMLoad() {
        chestManager = new VCManager();
        VCAPI api = new VCAPI(chestManager);
        getAPI().registerAPI("vc", api);
    }

    @Override
    public void onDisable() {
        chestManager.save();
    }

    @Override
    public void onEnable() {
        chestManager.load();
    }
    
    private static IPMAPI API;

    @Override
    protected void init(IPMAPI API) {
        VCMain.API = API;
    }

    public static IPMAPI getAPI() {
        return API;
    }
    
}
