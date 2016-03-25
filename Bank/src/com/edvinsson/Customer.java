package com.edvinsson;
import java.util.ArrayList;
/**
 * Created by edvinj on 3/16/16.
 */
public class Customer {
    private String name;
    private ArrayList<Double> transactions = new ArrayList<Double>();
    private double balance = 0.0;

    public Customer(String name) {
        this.name = name;
        this.balance = 0.00;
    }
    private void transact(double amount){
        this.transactions.add(amount);
        this.balance += amount;
    }
    public void deposit(double amount){
        this.transact(amount);
    }
    public void withdraw(double amount){
        this.transact(-1.0 * amount);
    }
    public void printTransactions(){
        for(Double d : this.transactions){
            System.out.println(d);
        }
        System.out.println("Current Balance is: " + this.balance);
    }

    public String getName(){
        return this.name;
    }
}

