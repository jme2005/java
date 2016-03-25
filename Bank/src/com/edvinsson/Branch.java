package com.edvinsson;

import java.util.ArrayList;

/**
 * Created by edvinj on 3/16/16.
 */
public class Branch {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<Customer>();

    public Branch(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCustomer(String name) {
        int index = findCustomer(name);
        if (index >= 0) {
            System.out.println("Customer already exists");
        } else {
            Customer newCustomer = new Customer(name);
            this.customers.add(newCustomer);
        }
    }

    public int findCustomer(String name) {
        int i = 0;
        for (Customer c : this.customers) {
            if (c.getName().equals(name)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void makeDeposit(String name, double amount) {
        int index = findCustomer(name);
        if (index >= 0) {
            this.customers.get(index).deposit(amount);
        } else {
            System.out.println("Customer not found");
        }
    }

    public void makeWithdrawal(String name, double amount) {
        int index = findCustomer(name);
        if (index >= 0) {
            this.customers.get(index).withdraw(amount);
        } else {
            System.out.println("Customer not found");
        }
    }

    public void printTransactions(String name) {
        int index = findCustomer(name);
        if (index >= 0) {
            this.customers.get(index).printTransactions();
        } else {
            System.out.println("Customer not found");
        }
    }
}

