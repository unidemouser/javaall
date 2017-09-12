/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com.exception;

import java.util.Scanner;

/**
 *
 * @author rahul
 */
public class NewClass {
    public static void main(String args[]){
//        try{
//            int x=23;
//            int y=10;
//            int z=x/y;
//            System.out.println(z);
//            int ages[]={12,15};
//            int e=ages[6];
//        }
//        catch(ArithmeticException  e){
//            System.out.println("You cannot divide anumber by zero");
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Array Index not valid"+e.getMessage());
//        }catch(Exception e){
//            System.out.println("Error Occured "+e.getMessage());
//        }
//        try{
//            Scanner s=new Scanner(System.in);
//            System.out.println("Pls input first nos");
//            int a=s.nextInt();
//            System.out.println("Pls input second nos");
//            int b=s.nextInt();
//            int c=a/b;
//            System.out.println(c);
//        }catch(ArithmeticException e){
//            System.out.println("You cannot divide a number by Zero");
//        }catch(NumberFormatException e){
//            System.out.println("Pls input a valid number");
//        }catch(Exception e){
//            System.out.println("An error occured"+e.getLocalizedMessage());
//        }
    String name=new String("rahul niraula is my name");
    
    if(name.contains("name")){
        System.out.println("Not allowed");
    }else{
        System.out.println("allowed");
    }
    }
    

}
