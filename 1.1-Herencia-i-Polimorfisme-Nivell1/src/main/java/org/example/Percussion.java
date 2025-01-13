package org.example;

public class Percussion extends Instrument {

    public Percussion (String name, int price) {
        super(name, price);
    }

    public void play() {
        System.out.println("A percussion instrument is playing");
    }

}
