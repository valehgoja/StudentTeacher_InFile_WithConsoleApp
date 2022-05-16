/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class MenuUtil {

    public static void showMenu() {
        System.out.println("Please select menu : ");
        Menu.showAllMenu();
        Scanner sc = new Scanner(System.in);
        int selectedMenuNumber = sc.nextInt();
        Menu selectedMenu =Menu.find(selectedMenuNumber);
        selectedMenu.process();


    }

    public static void process(Menu menu) {
        menu.process();
    }

}
