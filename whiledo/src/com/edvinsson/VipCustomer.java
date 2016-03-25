package com.edvinsson;

/**
 * Created by edvinj on 3/14/16.
 */
public class VipCustomer {


    private String name;
    private double credit;
    private String email;

    public VipCustomer(){
        this("Default name", 200000.00,"default@gmail.com");
    }

    public VipCustomer(String name, double credit, String email){
        this.name = name;
        this.credit = credit;
        this.email = email;

    }
    public VipCustomer(String name, double credit){
        this(name, credit,"default@email.com");
    }
    public VipCustomer(double credit, String email){
        this("default name", credit, email);
    }
    public VipCustomer(String name, String email){
        this(name, 200000.00, email);
    }

    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public double getCredit(){
        return this.credit;
    }
}
