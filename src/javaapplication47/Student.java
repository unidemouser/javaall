/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication47;

import java.util.ArrayList;

/**
 *
 * @author rahul
 */
public class Student extends Person {
    ArrayList<Subject> takes;
    String studentId;

    public Student(ArrayList<Subject> takes, String studentId) {
        this.takes = takes;
        this.studentId = studentId;
    }

    public ArrayList<Subject> getTakes() {
        return takes;
    }

    public void setTakes(ArrayList<Subject> takes) {
        this.takes = takes;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    
    
}
