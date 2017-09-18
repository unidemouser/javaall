/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cllassandobjects;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author rahul
 */
public class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private double balance;
    private ArrayList<String> history;
    

    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.history=new ArrayList();
        
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void withDraw(double amt){
        this.balance=this.balance-amt;
        LocalDateTime d=LocalDateTime.now();
        addHistory("Withdrawn Ammmount:"+amt+" on "+d);
    }
    public void deposit(double amt){
        this.balance+=amt;
        LocalDateTime d=LocalDateTime.now();
        addHistory("Deposited Ammmount:"+amt+" on "+d);
    }
    
    public void addHistory(String his){
        history.add(his);
    }
    
    public void showHistory(){
        for(String s:history){
            System.out.println(s);
        }
    }
    
    
}
