/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceInter;

import Bean.Config;

/**
 *
 * @author User
 */
public interface  MenuService {
    public default void process(){
        processAbs();
        Config.save();
    }
    public abstract void processAbs();
}
