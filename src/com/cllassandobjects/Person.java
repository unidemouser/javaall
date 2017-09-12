/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cllassandobjects;

/**
 *
 * @author rahul
 */
public class Person {
    
    private String name;
    String address;
    int age;
    char gender;
     
    public void setName(String n){
        if(n.length()<5 || n.length()>20){
            System.out.println("Invalid names");
        }else{
            name=n;
        }
    }
    
    public void getFullInfo(){
        System.out.println("Name:"+name+"\nAddress:"+address+"\nGender:"+gender+"\nAge:"+age);
    }
    public void move(){
        System.out.println("The person is moving");
    }
    
    public int getAge(){
        return 12;
    }
}
