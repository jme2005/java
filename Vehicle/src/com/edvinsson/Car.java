package com.edvinsson;

/**
 * Created by edvinj on 3/14/16.
 */
public class Car extends Vehicle {

    private int doors;

    public Car(int axels, int horsepower, int seats, double cargospace, int doors) {
        super(axels, horsepower, seats, cargospace);
        this.doors = doors;
    }


    public void move(){
        System.out.println("The car is moving");
        super.move(30.5);
    }
}
