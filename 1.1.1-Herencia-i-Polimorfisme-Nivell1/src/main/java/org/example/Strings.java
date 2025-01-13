package org.example;

public class Strings extends Instrument {

    public Strings (String name, int price) {
        super(name, price);
    }

    public void play() {
        System.out.println("A string instrument is playing");
    }
}
