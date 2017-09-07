/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abstraction;

/**
 *
 * @author rahul
 */
public class MainClass {
    
    public static void main(String args[]){
        IShape r=new Rectangle(34, 67);

        IShape c=new Circle(67);
       
        getFullInfo(r);
        
    }
    
    public static void getFullInfo(IShape s){
        System.out.println("Area:"+s.getArea());
        System.out.println("Perimeter:"+s.getPerimeter());
    }
}
