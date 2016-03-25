package com.edvinsson;

import javafx.geometry.Pos;

/**
 * Created by edvinj on 3/14/16.
 */
public class Desk {

    private double width;
    private double depth;
    private Position position;

    public Desk(double width, double depth, Position position) {
        this.width = width;
        this.depth = depth;
        this.position = position;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }

    public Position getPosition() {
        return position;
    }
}
