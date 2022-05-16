/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Bean.Config;
import Bean.Student;
import Bean.Teacher;
import ServiceInter.MenuAddTeacherServiceInter;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class MenuAddTeacherService implements MenuAddTeacherServiceInter {

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

        Teacher t = new Teacher();
        t.setName(name);
        t.setSurname(surname);
        t.setAge(age);

        Config.instance().appendTeacher(t);
        System.out.println("Added");
        

    }

}
