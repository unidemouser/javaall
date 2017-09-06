/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inheritance2;

/**
 *
 * @author rahul
 */
public class Manager extends Person {
    private String boardPosition;
    private int shares;

    public Manager(String boardPosition, int shares) {
        this.boardPosition = boardPosition;
        this.shares = shares;
    }

    public Manager(String name, String address, String qualification, int age, char gender,String boardPosition, int shares){
        super(name,address,qualification,age,gender);
        this.boardPosition = boardPosition;
        this.shares = shares;
    }
    
    public String getBoardPosition() {
        return boardPosition;
    }

    public void setBoardPosition(String boardPosition) {
        this.boardPosition = boardPosition;
    }

    public int getShares() {
        return shares;
    }

    public void setShares(int shares) {
        this.shares = shares;
    }
    
    public void getFullInformation(){
        super.getFullInformation();
        System.out.println("Board Position:"+getBoardPosition());
        System.out.println("No of Shares:"+getShares());
    }
    
}
