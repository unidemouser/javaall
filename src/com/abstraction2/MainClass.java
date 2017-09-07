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
public class MainClass {
    public static void main(String args[]){
        IShape r=new Rectangle(45, 89);
        
        IShape c=new Circle(56);
        
        printFUllINfo(r);
        
    }
    
    
    public static void printFUllINfo(IShape s){
        System.out.println("Area"+s.getArea()+"Permimeter:"+s.getPerimeter());
    }
}
