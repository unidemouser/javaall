/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication47;
import com.rahul.niraula.*;
import java.time.LocalDateTime;
/**
 *
 * @author rahul
 */
public class MainClass {
    
    public static void main(String args[]){
//        System.out.println("Rahul");
//        System.out.println("Niraula");
//        Person p=new Person();
//        Car c= new Car();
//        
//        System.out.println("Organization Name");
//        System.out.println("Date:");
//        System.out.println(" SNo        Product      Price        Amount");
//        for (int i = 0; i < 10; i++) {
//            
//        }
//        
//        LocalDateTime d=LocalDateTime.now();
//        d.getHour();
//        if(d.getHour()<12){
//            System.out.println("Good Morning");
//        }
        Teacher t=new Teacher("Rahul",23,"Biratnagar",'m',40000, "assistant");
//        int age=12;
//        boolean hasVoterCard=false;
//        if (age>18 && hasVoterCard ) {
//            System.out.println("You can vote");
//        }else{
//            System.out.println("Soorry");
//        }
//        
//        String name="Rahul";
//        char gender='M';
//        System.out.println(gender=='M'?"Hello Mr "+name:"Hello Miss "+name);
        for (int j = 1; j < 10; j++) {
            for (int i = 1; i < 10; i++) {
                System.out.print(j+"  X "+i+" = "+i*j+"\t");
            }
            System.out.println("");
        }
        
        String name[]={"Rahul","sanjib","Site","pradip"};
        String nos[]={"235235","23235","235235","23525"};
        char gender[]={'m','m','f','m'};
        for (int i = 0; i <name.length ; i++) {
            System.out.println(" name is "+name[i]+"--"+(gender[i]=='m'?"His":"Her")+" phone number is"+nos[i]);
        }
        
        for(String n :name){
            System.out.println(n);
        }
        
        
    }
    
    
}
