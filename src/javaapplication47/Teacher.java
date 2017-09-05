package javaapplication47;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rahul
 */
public class Teacher extends Person{
    int salary;
    String position;
    ArrayList<Subject> teach;

    public Teacher(int salary, String position, ArrayList<Subject> teach) {
        
        this.teach = teach;
    }
    
    public Teacher(String name,int age,String address,char gender,int salary, String position){
        super(name,address,age,gender);
        this.salary = salary;
        this.position = position;
    
    }
    
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public ArrayList<Subject> getTeach() {
        return teach;
    }

    public void setTeach(ArrayList<Subject> teach) {
        this.teach = teach;
    }
    
    
}
