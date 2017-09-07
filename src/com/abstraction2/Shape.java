/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abstraction2;

/**
 *
 * @author rahul
 */
public abstract class Shape {
    
    public abstract double getArea();
    public abstract double getPerimeter();
    public void getInfo(){
        System.out.println("This class is abstract");
    }
}
