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
        Person p=new Person();
//        p.name="Rahul ";
        p.setName("Rah");
        p.address="Biratnagar 1, Pokharia";
        p.gender='m';
        p.age=24;
        p.getFullInfo();
        p.move();
    }
}
