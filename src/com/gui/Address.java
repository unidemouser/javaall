/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gui;

/**
 *
 * @author rahul
 */
public class Address {
    private String poBoxNo,street,country;

    public Address(String poBoxNo, String street, String country) {
        this.poBoxNo = poBoxNo;
        this.street = street;
        this.country = country;
    }

    public String getPoBoxNo() {
        return poBoxNo;
    }

    public void setPoBoxNo(String poBoxNo) {
        this.poBoxNo = poBoxNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    
    
}
