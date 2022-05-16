/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Bean.Config;
import Bean.Student;
import Bean.Teacher;
import ServiceInter.MenuShowTeacherServiceInter;

/**
 *
 * @author User
 */
public class MenuShowTeacherService implements MenuShowTeacherServiceInter{

    @Override
    public void processAbs() {
        Teacher[] allTeachers=Config.instance().getTeachers();
        for(int i=0;i<allTeachers.length;i++){
            System.out.println(allTeachers[i]);
        }
    }
    
}
