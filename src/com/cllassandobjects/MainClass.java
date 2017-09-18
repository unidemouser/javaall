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
public class MainClass {
    public static void main(String args[]){
//        Person p=new Person();
//       p.setName("Rahul Niraula");
//        p.setAddress("Biratnagar 1, Pokharia");
//        p.setGender('m');
//        p.setAge(24);
//        System.out.println(p.getName());
//        p.move();
//        p.greet("Sanjib");
//        Person p=new Person("Rahul 123","Biratnagar",23,'m');
//        p.setName("Rahul Niraula");
//        p.increaseAge();
//        
//        p.getFullInfo();
//        Person p1=new Person("Sanjib","Kathmandu",24,'m');
//        p1.getFullInfo();
//        
//        Person p2=new Person("Abc",'m');
//        p2.setAge(23);
           BankAccount a=new BankAccount("Rahul Niraula", "01800003456v", 12000);
           a.withDraw(134);
//           System.out.println(a.getBalance());
           a.deposit(4353);
//           System.out.println(a.getBalance());
            a.withDraw(574);
            a.deposit(4353);
            a.deposit(3466);
            a.withDraw(67);
            a.deposit(7473);
            a.showHistory();
            System.out.println("Current Balance:"+a.getBalance());
    }
}
