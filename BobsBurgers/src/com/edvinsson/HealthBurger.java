package com.edvinsson;

/**
 * Created by edvinj on 3/15/16.
 */
public class HealthBurger extends Hamburger {

    public HealthBurger() {
        super("Whole Wheat", "veggie burger", 5.50);
    }

    @Override
    public void addLettuce() {
        super.addLettuce(0.25);
    }

    @Override
    public void addTomato() {
        super.addTomato(0.25);
    }

    @Override
    public void addCheese() {
        super.addCheese(0.25);
    }

    @Override
    public void addOnions() {
        super.addOnions(0.25);
    }

    @Override
    public void rmLettuce() {
        super.rmLettuce(0.25);
    }

    @Override
    public void rmTomato() {
        super.rmTomato(0.25);
    }

    @Override
    public void rmCheese() {
        super.rmCheese(0.25);
    }

    @Override
    public void rmOnions() {
        super.rmOnions(0.25);
    }
}
