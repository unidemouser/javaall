/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inheritance2;

/**
 *
 * @author rahul
 */
public class MainClass {
    public static void main(String args[]){
        
        Employee e=new Employee("Rahul Nirula", "Biratnagar", "Bachelors", 24, 'm', 30000);
//        e.setName("");
        e.getFullInformation();
        
        
        Manager m=new Manager("Sanjib Niraula", "Kathmandu", "Masters", 34, 'm', "Senior", 2345);
        m.getFullInformation();
    }
}
