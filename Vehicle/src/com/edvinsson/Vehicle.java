package com.edvinsson;

/**
 * Created by edvinj on 3/14/16.
 */
public class Vehicle {

    private int axels;
    private int horsepower;
    private int seats;
    private double cargospace;

    public Vehicle(int axels, int horsepower, int seats, double cargospace) {
        this.axels = axels;
        this.horsepower = horsepower;
        this.seats = seats;
        this.cargospace = cargospace;
    }

    public int getAxels() {
        return axels;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public int getSeats() {
        return seats;
    }

    public double getCargospace() {
        return cargospace;
    }

    public void move(double speed){
        System.out.println("Vehicle is moving at " + speed);
    }

}
