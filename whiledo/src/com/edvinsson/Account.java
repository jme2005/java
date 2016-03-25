package com.edvinsson;

/**
 * Created by edvinj on 3/14/16.
 */
public class Account {



    private double balance;
    private String name;
    private String email;


    public void deposit(double amount){
        if(amount < 0){
            System.out.println("Cannot deposit negative amount");
        }else{
            this.balance += amount;
        }
    }
    public void withdraw(double amount){
        if(this.balance - amount < 0){
            System.out.println("Not sufficient founds");
        }else{
            this.balance -= amount;
        }
    }
    public double getBalance(){

        return this.balance;

    }

    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
}


