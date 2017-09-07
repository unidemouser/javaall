/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abstraction2;

import java.util.List;

/**
 *
 * @author rahul
 */
public class Rectangle implements IShape {

    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    
    
    @Override
    public double getArea() {
        return getLength()*getBreadth();
    }

    @Override
    public double getPerimeter() {
        return 2*(getLength()+getBreadth());
    }
    
}
