package org.example;

public class Telephone {

    private String brand;
    private String model;

    public Telephone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void call(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }
}
