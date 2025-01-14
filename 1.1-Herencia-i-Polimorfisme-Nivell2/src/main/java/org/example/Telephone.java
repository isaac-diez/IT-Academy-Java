package org.example;

public class Telephone {

    private String brand;
    private String model;

    public Telephone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void call(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }
}
