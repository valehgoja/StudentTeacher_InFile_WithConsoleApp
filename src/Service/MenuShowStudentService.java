/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Bean.Config;
import Bean.Student;
import ServiceInter.MenuShowStudentServiceInter;

/**
 *
 * @author User
 */
public class MenuShowStudentService implements MenuShowStudentServiceInter{

    @Override
    public void processAbs() {
        Student[] allStudents=Config.instance().getStudents();
        for(int i=0;i<allStudents.length;i++){
            System.out.println(allStudents[i]);
        }
    }
    
}
