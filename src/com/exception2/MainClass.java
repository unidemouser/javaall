/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exception2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author rahul
 */
public class MainClass {
    public static void main(String args[]){
//        try{
//            int x=34;
//            int y=10;
//            int z=x/y;
////            System.out.println(z);
//            
//            int ages[]={12,45,23};
//            System.out.println(ages[5]);
//            
//        }catch(ArithmeticException e){
//            System.out.println("Please enter a divider greater than zero."+e.getLocalizedMessage());
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("No properlt formated array.");
//        }
          try{
                Scanner s=new Scanner(System.in);
                System.out.println("Please enter a first number");
                int first=s.nextInt();
                System.out.println("Please enter a second number");
                int second=s.nextInt();
                int sum=first+second;
                System.out.println("The sum of "+first+" and "+second+" is "+sum);
          }catch(InputMismatchException e){
              System.out.println("No a valid number.");
          }
          
        
    }
}
