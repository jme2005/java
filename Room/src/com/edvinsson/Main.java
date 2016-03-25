package com.edvinsson;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Desk desk = new Desk(60,150,new Position(1,1));
        BookShelf bookshelf = new BookShelf(120,40, new Position(5,5));
        Bed bed = new Bed(120,210, new Position(3,3));

        Room myRoom = new Room(bed, bookshelf, desk);

        System.out.println("Width of bed is " + myRoom.getWidthBed());

    }
}
