/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rahul.niraula;
/**
 *
 * @author rahul
 */
public class Person {
    private static int count;
    private String name;
    private String address;
    private char gender;
    private String qualification;
    private boolean completedPlusTwo;
    private double percentage;
    private String number;
    private int age;
    
    {
        this.name="Rahul Niraula";
        System.out.println("This is in main BLock");
    }
    static{
        count=10;
    }
    
    public Person(){
        System.out.println("this is in main constructor");
//        System.out.println(getRecommendation());
//        this.getRecommendation();
        increaseCount();
    }
    
    public Person(String name,String address){
        System.out.println("this is in main constructor");
        this.name=name;
        this.address=address;
    }

    public Person(String name, String address, char gender, String qualification, boolean completedPlusTwo, double percentage, String number, int age) {
//        this.name = name;
        increaseCount();
        setName(name);
        this.address = address;
        this.gender = gender;
        this.qualification = qualification;
        this.completedPlusTwo = completedPlusTwo;
        this.percentage = percentage;
        this.number = number;
        setAge(age);
        System.out.println(getFullInformation());
    }
    private static void increaseCount(){
        
        count++;
    }
    public static int getTotalCount(){
        return count;
    }
    
    
    public Person(String name,String address,char gender){
        this.name=name;
        this.address=address;
        this.gender=gender;
        System.out.println("Called in contsru");
    }
    
    public void setName(String n){
        if(n.length()>=5){
            name=n;
        }
    }
    
    public String getName(){
        return name;
    }
    
    public void setAge(int a){
        if(a>10 && a<60){
            age=a;
        }
    }
    public int getAge(){
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public boolean isCompletedPlusTwo() {
        return completedPlusTwo;
    }

    public void setCompletedPlusTwo(boolean completedPlusTwo) {
        this.completedPlusTwo = completedPlusTwo;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if(number.length()==10){
            this.number = number;
        }
    }
    
    public String getFullInformation(){
        String fullInfo="Student Name:"+getName()+"\n";
        fullInfo+="Student Address:"+getAddress()+"\n";
        fullInfo+="Gneder:"+getGender()+"\n";
        fullInfo+="Qualification:"+getQualification()+"\n";
        fullInfo+="Completed Plus 2:"+isCompletedPlusTwo()+"\n";
        fullInfo+="Percentage: "+getPercentage()+"\n";
        fullInfo+="Number:"+getNumber()+"\n";
        fullInfo+="Age:"+getAge()+"\n";
        return fullInfo;        
    }
    
    public String getRecommendation(){
        String message="";
        if(getAge()<5){
            message="Hello kid, Your are just "+getAge()+" years old.\nGet Enrolled in a montessori school";
        }else if(getAge()>5 && getAge()<15){
            message="Congrats you are not more an infant now.\n You are "+getAge()+"years old. You are no more in Montessori";
        }else if(getAge()>15 && getAge()<20){
            message=getAge()+" years means you must have completed secondary education.\nGet ready for higher Education";
        }else if(getAge()>20 && getAge()<30){
            message="Wow you are "+getAge()+" years old. You can now travel the world ";
        }else{
            message="Congrats you are "+getAge()+"years old. You dont need my suggestion anymore";
        }
        return message;
    }
    
    
}
