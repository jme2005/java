package com.edvinsson;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Printer myPrinter = new Printer(true, "Canon 330");
        myPrinter.print(10);
        myPrinter.print(30);
        myPrinter.print(20);
        myPrinter.refillTonerLevel(200);
        myPrinter.print(1);
    }
}
