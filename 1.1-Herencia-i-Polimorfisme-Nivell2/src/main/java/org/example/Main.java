package org.example;

public class Main {
    public static void main(String[] args) {

        Smartphone isaacPhone = new Smartphone("Redmi", "Note 11 Pro Plus 5G");

        Telephone josePhone = new Smartphone("Samsung", "Galaxy 23S");

        isaacPhone.call(623453321);
        josePhone.call(637678874);

        isaacPhone.takePicture();
        isaacPhone.alarm();



    }
}