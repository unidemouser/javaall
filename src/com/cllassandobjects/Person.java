/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cllassandobjects;

import java.time.LocalTime;

/**
 *
 * @author rahul
 */
public class Person {
    
    private String name;
    private String address;
    private int age;
    char gender;
    
    public Person(String name, String address,int age,char gender){
        System.out.println("I am constructor");
        setName(name);
        setAge(age);
        setAddress(address);
        setGender(gender);
    }
    
    public Person(String name, char gender){
        setName(name);
        setGender(gender);
    }
    
    public void setName(String n){
        if(n.length()<5 || n.length()>20){
            System.out.println("Invalid names");
        }else{
            name=n;
        }
    }
    
    public void setAge(int a){
        if(a>15 && a<40){
            this.age=a;
        }
    }
    
    public void setAge(){
        this.age=0;
    }
    
    public void setGender(char g){
        if(g=='m' || g=='M' || g=='f' || g=='F'){
            this.gender=g;
        }
    }
    
    public void setAddress(String a){
        if(a.length()>5 && a.length()<100){
            this.address=a;
        }
    }
    
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public char getGender(){
        return gender;
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
    
    public void greet(String p){
        LocalTime t=LocalTime.now();
        String time="";
        if(t.getHour()<=12){
            time="Morning";
        }else if(t.getHour()>12 && t.getHour()<17){
            time="Afternoon";
        }else{
            time="Night";
        }
        System.out.println("Good  "+time+" "+p+" I am "+getName()+" The time now is "+t);
        
    }
    
    public void increaseAge(){
        this.age+=1;
    }
}
