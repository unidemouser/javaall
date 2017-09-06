/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inheritance;

/**
 *
 * @author rahul
 */
public class Employee extends  Person {
    
    private int salary;

    public Employee(String name,String address,String qualification,int age,char gender,int salary){
        super(name,address,qualification,age,gender);
        this.salary=salary;
    }
    
    public Employee(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    @Override
    public void getFullInformation(){
        super.getFullInformation();
        System.out.println("Salary:"+getSalary());
    }
    
    
}
