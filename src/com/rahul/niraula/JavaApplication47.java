/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rahul.niraula;

//import com.rahul.niraula.Person;

import com.rahul.niraula.Person;
//import java.lang.
/**
 *
 * @author rahul
 * DateCreated:sdgsdgsdg
 * purpose:
 * Important Topics:
 * 
 */
public class JavaApplication47 {

    /**
     * @param args the command line arguments
     * 
     * maile yooy 
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println("Rahul");
//        Person p=new Person();
////        System.out.println("Niraula");
//        int per=83;
//        if(per > 90){
//            System.out.println("Dis");
//        }else if(per > 80 && per<90){
//            System.out.println("Firt");
//        }else{
//            System.out.println("doit");
//        }
//            
//        for (int i = 1000; i < 1100; i++) {
//            System.out.println((char)i);
//        }
        
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                if(i<=j){
//                    System.out.print("*");
//                }else{
//                    System.out.print("&");
//                }
//            }
//            System.out.println("");
//        }
        String names[]={"Rahul","Prajwal","Geeta","Bikram","Millan"};
        String numbers[]={"235235","523525","5262236","4575447","4574745"};
        char gender[]={'M','M','F','M','M'};
        for (int i = 0; i <names.length; i++) {
            System.out.println((gender[i]=='M'?"His":"Her")+" name is "+names[i]+"--"+numbers[i]);
        }
//        for (int i = 0; i < names.length; i++) {
//            System.out.println("Sending SMS to "+names[i]+" in "+(gender[i]=='M'?" his ":" her ")+" Number ("+numbers[i]+")");
//        }int 
//            int annualSalary=34_00_000;
//            double tax=0;
//            if(annualSalary<=300_000){
//                tax=annualSalary*0.01;
//                
//            }
//            else if(annualSalary>300_000 && annualSalary<500_000){
//                tax=300_000*0.01+(500_000-annualSalary)*0.10;
//            }
//            else if(annualSalary>500_000 && annualSalary<10_00_000){
//                tax=300_000*0.01+200_000*0.10+(annualSalary-500_000*0.15);
//            }
//            else{
//                tax=300_000*0.01+200_000*0.10+500_000*0.15+(annualSalary-10_00_000)*0.25;
//            }
//            System.out.println("A perons having salary of RS."+annualSalary+ " has to pay Rs."+tax+" as tax");

                
                Person p1=new Person();
                
//                p1.name="r";
//                p1.completedPlusTwo=true;
//                p1.gender='M';
//                p1.percentage=89;
//                p1.qualification="Bachelaors";
//                p1.number="984325235";
//                System.out.println(p1.name+p1.qualification+p1.address);
                  p1.setName("Rahul Niraula");
                  p1.setAddress("Biratnagr");
                  p1.setAge(23);
                  p1.setCompletedPlusTwo(true);
                  p1.setNumber("1235236");
                  p1.setQualification("Bachelors");
//                  System.out.println(p1.getName());
                  String val=  p1.getFullInformation();
//                  System.out.println(val);
                  Person p2=new Person("Ram","Biratnagar",'m');
//                  System.out.println(p2.getFullInformation());
//                  for (int i = 0; i < 0; i++) {
//                      Person p3=new Person("r", "Kathmandu", 'm', "Bachelors", true,Math.random()*100 , "797979", (int)(Math.random()*100));
//                  }
//                  String num="523525";
//                  for (int i = 0; i < numbers.length; i++) {
//                      if(num==numbers[i]){
//                          continue;
//                      }
//                      System.out.println(numbers[i]);
//                  }
//                  System.out.println(p3.getFullInformation());

//                  Person p4=new Person();
            
//                    for (int i = 0; i < 10; i++) {
//                            
//                    }
                    Car c=new Car();
//                    c.color="gkhgk";
//                    c.manufacturer="Mustang";
//                    c.model="MM-4363";
//                    c.noOfWheels=4;
                    c.setColor("Red");
                    System.out.println(c.getColor());
                    
//                    System.out.println(c.manufacturer);
//                    c.getFullInfo();
//                            Car c=new Car();
//                            c.drive(89);
//                            c.turnLeft();
//                            c.turnRight();
//                            c.stop();
//                    
//                    System.out.println(Product.tax);
//                    
//                    
//                    System.out.println(Util.getAreaOfCircle(67));
//                    System.out.println(Util.getUserName("Rahul"));

//String name="Rahul";
//        System.out.println("I am "+name);
//        int age=0x236235cd;
//        System.out.println(age);
//        for (int i = 0; i < 65500; i++) {
//            System.out.println((char)i);
//        }
        Person p=new Person();
//        p.name="3463646";
//        System.out.println(p.name);
        p.setName("Rahul");
        p.setGender('m');
        p.setAge(17);
        System.out.println(p.getRecommendation());
        System.out.println(p.getName());
        System.out.println(p.getGender());
//          System.out.println("977886868gjgjgbj".);;
        
        System.out.println(Util.sum(12,12,12,1231,1212,12,2424));
        int[] ages={45,23,52,23,65,12};
        System.out.println(Util.max(ages));
        Person p3=new Person();
        Person p6=new Person();
        Person p9=new Person();
        Person p8=new Person();
        System.out.println(Person.getTotalCount());
        
    }
    
}
