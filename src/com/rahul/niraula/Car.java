/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rahul.niraula;

/**
 *
 * @author rahul
 */
public class Car {
   private String model="NO_96878";
   private String manufacturer;
   private int noOfWheels;
   private String color;
    
    public void drive(int speed){
        System.out.println("I am driving at a speed of"+speed);
    }
    
    public void turnRight(){
        System.out.println("Turning Right");
    }
    
    public void stop(){
        System.out.println("Stopping car");
    }
    
    public void turnLeft(){
        System.out.println("Turning Left");
    }
    
    public void getFullInfo(){
        System.out.println("------------------------------");
        System.out.println("Model\t"+model);
        System.out.println("Manufacturer\t"+manufacturer);
        System.out.println("No of Wheels\t"+noOfWheels);
        System.out.println("Color\t"+color);
        System.out.println("-------------------------------");
    }
    public void setColor(String c){
        if(c=="Red"||c=="Green"||c=="Blue"){
            color=c;
        }
        
    }
    public String getColor(){
        return color;
    }
}
