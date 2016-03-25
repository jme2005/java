package com.edvinsson;

public class Main {

    public static void main(String[] args) {
        // write your code here
        VipCustomer myVIP = new VipCustomer();

        System.out.println(myVIP.getName());

        VipCustomer myVIP2 = new VipCustomer("Steve", "steve@email.com");

        System.out.println(myVIP2.getName());
    }


    }


