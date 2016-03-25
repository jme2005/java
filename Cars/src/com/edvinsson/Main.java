package com.edvinsson;


class Car{

    private boolean engine;
    private int cylinders;
    private int doors;
    private int horsepower;
    private int wheels;
    private String stateOfEngine;
    protected int speed;

    public Car(int horsepower, int cylinders, int doors) {
        this.horsepower = horsepower;
        this.cylinders = cylinders;
        this.doors = doors;
        this.wheels = 4;
        this.engine = true;
        this.stateOfEngine = "Off";
        this.speed = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getDoors() {
        return doors;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public int getWheels() {
        return wheels;
    }

    public String getStateOfEngine() {
        return stateOfEngine;
    }

    public void startEngine(){
        if(this.stateOfEngine == "On"){
            System.out.println("Engine is already on");
        }else{
            this.stateOfEngine = "On";
        }

    }
    public void accelerate(int amount){
        this.speed += amount;
        System.out.println("Accelerate called in Car.\n" +
                            "New speed is " + this.getSpeed() + '\n');
    }
}

class Honda extends Car{

    public Honda(int horsepower, int cylinders, int doors) {
        super(horsepower, cylinders, doors);
    }

    @Override
    public void accelerate(int amount) {
        this.speed += amount * 2;
        System.out.println("Accelerate called in Honda.\n" +
                "New speed is " + this.speed + "\n");
    }
}

class VW extends Car{

    public VW(int horsepower, int cylinders, int doors) {
        super(horsepower, cylinders, doors);
    }
}






public class Main {

    public static void main(String[] args) {
	// write your code here

        Honda myHonda = new Honda(145,4,5);
        VW myVW = new VW(120,4,5);

        myHonda.accelerate(10);
        myVW.accelerate(10);
    }
}
