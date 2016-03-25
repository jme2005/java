package com.edvinsson;

/**
 * Created by edvinj on 3/14/16.
 */
public class Room {

    private Bed bed;
    private BookShelf shelf;
    private Desk desk;

    public Room(Bed bed, BookShelf shelf, Desk desk) {
        this.bed = bed;
        this.shelf = shelf;
        this.desk = desk;
    }

    public double getWidthBed(){

        return this.bed.getWidth();
    }

    public Bed getBed() {
        return bed;
    }

    public BookShelf getShelf() {
        return shelf;
    }

    public Desk getDesk() {
        return desk;
    }
}
