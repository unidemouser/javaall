/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rahul.niraula;

import java.util.ArrayList;
/**
 *
 * @author rahul
 */
public class ClassDemo {
    public static void main(String args[]){
    
        Person p=new Person("rahul","biratnagar");
        System.out.println(p.getFullInformation());
        ArrayList a=new ArrayList();
        System.out.println(Util.getAreaOfRectangle(12, 56));
        
        System.out.println(Util.sum(12,12,12,12,242,252,23,23212,1242214,4));
        
    }
}
