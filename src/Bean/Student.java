/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author User
 */
public class Student extends Person{
    public String schoolName;
    public double scholarShip;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getScholarShip() {
        return scholarShip;
    }

    public void setScholarShip(double scholarShip) {
        this.scholarShip = scholarShip;
    }

    @Override
    public String toString() {
        return "Name:" + name + " Surname:" +surname;
    }

   
    
    
}
