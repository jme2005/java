package com.edvinsson;
import java.util.ArrayList;
/**
 * Created by edvinj on 3/16/16.
 */
public class Bank {
    private String name;
    private ArrayList<Branch> branches = new ArrayList<Branch>();

    public Bank(String name) {
        this.name = name;
    }

    public void addBranch(String name) {
        Branch newBranch = new Branch(name);
        if (this.branches.contains(newBranch)) {
            System.out.println("Branch already exists");
        } else {
            this.branches.add(newBranch);
        }

    }

    public void addCustomer(String name, String branch) {
        int index = findBranch(branch);
        if (index >= 0) {
            this.branches.get(index).addCustomer(name);
        } else {
            System.out.println("Branch not found.");
        }
    }

    private int findBranch(String branch) {
        int i = 0;
        for (Branch b : this.branches) {
            if (b.getName().equals(branch)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void makeDeposit(String branch, String name, double amount) {
        int bindex = findBranch(branch);
        if (bindex >= 0) {
            this.branches.get(bindex).makeDeposit(name, amount);

        } else {
            System.out.println("Branch not found");
        }
    }

    public void makeWithdrawal(String branch, String name, double amount) {
        int bindex = findBranch(branch);
        if (bindex >= 0) {
            this.branches.get(bindex).makeWithdrawal(name, amount);

        } else {
            System.out.println("Branch not found");
        }
    }

    public void printTransactions(String branch, String name) {
        int bindex = findBranch(branch);
        if (bindex >= 0) {
            this.branches.get(bindex).printTransactions(name);
        }else{
            System.out.println("Branch not found.");
        }
    }
}


