package org.example;

public class Car {

    private static final String maker = "Ford";
    private static String model;
    private final int power;

    public Car(String model, int power){
        Car.model = model;
        this.power = power;

    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        Car.model = model;
    }

    public int getPower() {
        return power;
    }

    public static void brake(){
        System.out.println("The vehicle is slowing down.");
    }

    public void accelerate(){
        System.out.println("The vehicle is accelerating.");
    }
}
