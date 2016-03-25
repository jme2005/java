package com.edvinsson;

/**
 * Created by edvinj on 3/15/16.
 */
public class Hamburger {

    private String bread;
    private String meat;
    private double price;
    private boolean lettuce = false;
    private boolean tomato = false;
    private boolean cheese = false;
    private boolean onions = false;


    public Hamburger(String bread, String meat, double price) {
        this.bread = bread;
        this.meat = meat;
        this.price = price;
    }

    public String getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public void addLettuce(){
        if(!this.lettuce) {
            this.lettuce = true;
            this.price += 1.0;
        }else{
            System.out.println("Lettuce already added");
        }
    }

    public void addTomato(){
        if(!this.tomato) {
            this.tomato = true;
            this.price += 0.5;
        }else{
            System.out.println("Tomato already added");
        }
    }
    public void addCheese(){
        if(!this.cheese) {
            this.cheese = true;
            this.price += 1.5;
        }else{
            System.out.println("Cheese already added");
        }
    }
    public void addOnions(){
        if(!this.onions) {
            this.onions = true;
            this.price += 0.75;
        }else{
            System.out.println("Cheese already added");
        }
    }
    public void rmLettuce(){
        if(this.lettuce) {
            this.lettuce = false;
            this.price -= 1.0;
        }else{
            System.out.println("No lettuce added");
        }
    }

    public void rmTomato(){
        if(this.tomato) {
            this.tomato = false;
            this.price -= 0.5;
        }else{
            System.out.println("No Tomato added");
        }
    }
    public void rmCheese(){
        if(this.cheese) {
            this.cheese = false;
            this.price -= 1.5;
        }else{
            System.out.println("No cheese added");
        }
    }
    public void rmOnions(){
        if(this.onions) {
            this.onions = false;
            this.price -= 0.75;
        }else{
            System.out.println("No onions added");
        }
    }
    public void addLettuce(double price){
        if(!this.lettuce) {
            this.lettuce = true;
            this.price += price;
        }else{
            System.out.println("Lettuce already added");
        }
    }

    public void addTomato(double price){
        if(!this.tomato) {
            this.tomato = true;
            this.price += price;
        }else{
            System.out.println("Tomato already added");
        }
    }
    public void addCheese(double price){
        if(!this.cheese) {
            this.cheese = true;
            this.price += price;
        }else{
            System.out.println("Cheese already added");
        }
    }
    public void addOnions(double price){
        if(!this.onions) {
            this.onions = true;
            this.price += price;
        }else{
            System.out.println("Cheese already added");
        }
    }
    public void rmLettuce(double price){
        if(this.lettuce) {
            this.lettuce = false;
            this.price -= price;
        }else{
            System.out.println("No lettuce added");
        }
    }

    public void rmTomato(double price){
        if(this.tomato) {
            this.tomato = false;
            this.price -= price;
        }else{
            System.out.println("No Tomato added");
        }
    }
    public void rmCheese(double price){
        if(this.cheese) {
            this.cheese = false;
            this.price -= price;
        }else{
            System.out.println("No cheese added");
        }
    }
    public void rmOnions(double price){
        if(this.onions) {
            this.onions = false;
            this.price -= price;
        }else{
            System.out.println("No onions added");
        }
    }
}
