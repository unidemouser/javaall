/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gui;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author rahul
 */
public class Student extends Human {
    private String school,college,destinationCountry,intendedCourse,shortBio;
    private double slcPercent,plusTwoPercent;
    private Address address;

    public Student(String school, String college, String destinationCountry, String intendedCourse, String shortBio, double slcPercent, double plusTwoPercent,Address address) {
        this.school = school;
        this.college = college;
        this.destinationCountry = destinationCountry;
        this.intendedCourse = intendedCourse;
        this.shortBio = shortBio;
        this.slcPercent = slcPercent;
        this.plusTwoPercent = plusTwoPercent;
        this.address=address;
    }

    public Student(String school, String college, String destinationCountry, String intendedCourse, String shortBio, double slcPercent, double plusTwoPercent,Address address, String name, String email, int age, char gender) {
        super(name, email, age, gender);
        this.school = school;
        this.college = college;
        this.destinationCountry = destinationCountry;
        this.intendedCourse = intendedCourse;
        this.shortBio = shortBio;
        this.slcPercent = slcPercent;
        this.plusTwoPercent = plusTwoPercent;
        this.address=address;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getDestinationCountry() {
        return destinationCountry;
    }

    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    public String getIntendedCourse() {
        return intendedCourse;
    }

    public void setIntendedCourse(String intendedCourse) {
        this.intendedCourse = intendedCourse;
    }

    public String getShortBio() {
        return shortBio;
    }

    public void setShortBio(String shortBio) {
        this.shortBio = shortBio;
    }

    public double getSlcPercent() {
        return slcPercent;
    }

    public void setSlcPercent(double slcPercent) {
        this.slcPercent = slcPercent;
    }

    public double getPlusTwoPercent() {
        return plusTwoPercent;
    }

    public void setPlusTwoPercent(double plusTwoPercent) {
        this.plusTwoPercent = plusTwoPercent;
    }
    
    public void saveToFile() throws IOException{
        String fullText="Name:"+getName()+"\t";
        fullText+="Age"+getAge()+"\t";
        fullText+="Email"+getEmail()+"\t";
        fullText+="Gender"+getGender()+"\t";
        fullText+="School"+getSchool()+"\t";
        fullText+="College"+getCollege()+"\t";
        fullText+="Plus2Percentage"+getPlusTwoPercent()+"\t";
        fullText+="Destination Country"+getDestinationCountry()+"\t";
        fullText+="intended Course"+getIntendedCourse()+"\t";
        fullText+="Bio"+getShortBio()+"\t";
        
        fullText+="Address:"+address.getCountry()+","+address.getPoBoxNo()+","+address.getStreet()+"\n";
        File f=new File("C:\\Users\\rahul\\Documents\\NetBeansProjects\\JavaApplication47\\src\\com\\gui\\Record.txt");
        BufferedWriter write=new BufferedWriter(new FileWriter(f,true));
        write.write(fullText);
        write.close();
        
    }
    
    
    
}
