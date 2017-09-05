/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rahul.niraula;

import java.time.LocalDate;

/**
 *
 * @author rahul
 */
public class Util {
   static final int tax=13;
    
    public static double getAreaOfCircle(double r){
//        tax=45;
        return Math.PI*r*r;
    }
    
    public static String getUserName(String name){
        String cap=name.toUpperCase();
        LocalDate ld=LocalDate.now();
        int year=ld.getYear();
        int rand=(int)(Math.random()*100);
        return cap+year+""+rand;
    }
    
//    public static int sum(int... nos){
//        int sum=0;
//        for (int i = 0; i < nos.length; i++) {
//            sum+=nos[i];
//        }
//        return sum;
//    }
    
    public static int max(int[] nos){
    
        int max=0;
        for (int i = 0; i < nos.length; i++) {
            if(nos[i]>max){
                max=nos[i];
            }
        }
        return max;
    }
    
    public static int getAreaOfRectangle(int l,int b){
        return l*b;
    }
    
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    
    public static int sum(int... num){
        int sum=0;
        for (int i = 0; i < num.length; i++) {
            sum+=num[i];
        }
        return sum;
    }
}
