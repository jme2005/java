package com.edvinsson;

/**
 * Created by edvinj on 3/15/16.
 */
public class Printer {

    private boolean isDuplex;
    private String name;
    private int tonerLevel = 100;
    private int pagesPrinted = 0;
    private java.util.Random rand = new java.util.Random();


    public Printer(boolean isDuplex, String name) {
        this.isDuplex = isDuplex;
        this.name = name;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public String getName() {
        return name;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public void refillTonerLevel(int amount){


        if(amount < 1){
            System.out.println("Cannot fill negative amount.");
        }else if(this.tonerLevel + amount > 100){
            this.tonerLevel = 100;

        }else{
            this.tonerLevel += amount;
        }

        this.pagesPrinted = 0;
    }

    public void print(int pages){

        for(int i = 1; i <= pages; i++) {


            if(this.tonerLevel - 5 <= 0){
                System.out.println("Toner level is low, please refill ");
                break;
            }
            this.tonerLevel -= this.rand.nextInt(5)+1;
            this.pagesPrinted++;
            System.out.println("You have printed " + i + " pages.");
        }

        System.out.println("Totally you have printed " + this.pagesPrinted + " since last refill");
        System.out.println("New toner level is " + this.tonerLevel);
    }

}
