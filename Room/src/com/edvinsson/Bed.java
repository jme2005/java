package com.edvinsson;

/**
 * Created by edvinj on 3/14/16.
 */
public class Bed {


    private double width;
    private double length;
    private Position position;

    public Bed(double width, double length, Position position) {
        this.width = width;
        this.length = length;
        this.position = position;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public Position getPosition() {
        return position;
    }
}
