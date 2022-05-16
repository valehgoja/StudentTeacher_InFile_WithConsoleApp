    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Bean.Config;
import ServiceInter.MenuLoginServiceInter;
import ServiceInter.MenuService;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class MenuLoginService implements MenuLoginServiceInter{

    @Override
    public void processAbs() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Username :");
        String username=sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Password :");
        String password=sc2.nextLine();
        
        if(!username.equals("a")&&password.equals("a")){
            throw new IllegalArgumentException("Username or password is invalid");
        }
        
        Config.setLoggedIn(true);
        
    }
    
}
