/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Bean.Config;
import Bean.Student;
import ServiceInter.MenuAddStudentServiceInter;
import Util.FileUtility;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class MenuAddStudentService implements MenuAddStudentServiceInter {

    @Override
    public void processAbs() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        String name = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter surname: ");
        String surname = sc2.nextLine();

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter age : ");
        int age = sc3.nextInt();
        
        Student s = new Student();
        s.setName(name);
        s.setSurname(surname);
        s.setAge(age);
        
        Config.instance().appendStudent(s);
        System.out.println("Added");
        
        
    }

}
