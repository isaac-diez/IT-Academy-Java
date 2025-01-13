package org.example;

import static org.example.Car.getModel;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Firebird", 500);

        System.out.println("Car1 - Maker: " + car1.getMaker() +  " Model: " +getModel()+ " Power: " + car1.getPower());

        Car car2 = new Car("TransAm", 550);

        System.out.println("Car2 - Maker: " + car2.getMaker() +  " Model: " +getModel()+ " Power: " + car2.getPower());

        System.out.println("Car1 - Maker: " + car1.getMaker() +  " Model: " +getModel()+ " Power: " + car1.getPower());

        car1.accelerate();
        car2.accelerate();

        Car.brake();
        car2.brake();


    }
}