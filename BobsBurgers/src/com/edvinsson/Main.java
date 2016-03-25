package com.edvinsson;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Hamburger myHamburger = new Hamburger("plain","turkey",5.50);
        HealthBurger myHealthburger = new HealthBurger();

        myHamburger.addCheese();
        myHamburger.addTomato();
        myHealthburger.addCheese();
        myHealthburger.addTomato();

        System.out.println("Hamburger costs: " + myHamburger.getPrice());
        System.out.println("HealthBurger costs: " + myHealthburger.getPrice());
    }
}
