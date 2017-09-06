/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inheritance2;

import java.time.LocalDate;

/**
 *
 * @author rahul
 */
public class Person {
    protected String name,address,qualification;
    protected int age;
    protected char gender;
    protected LocalDate dateOfBirth;

    public Person() {
    }

    
    
    public Person(String name, String address, String qualification, int age, char gender) {
        this.name = name;
        this.address = address;
        this.qualification = qualification;
        this.age = age;
        this.gender = gender;
        this.dateOfBirth=LocalDate.now().minusYears(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public void getFullInformation(){
        String message="";
        message+="Name:"+getName()+"\n";
        message+="Address:"+getAddress()+"\n";
        message+="Qualification:"+getQualification()+"\n";
        message+="Age:"+getAge()+"\n";
        message+="Gender:"+getGender()+"\n";
        message+="Date Of Birth:"+getDateOfBirth()+"\n";
        
        System.out.println(message);
    }
}

