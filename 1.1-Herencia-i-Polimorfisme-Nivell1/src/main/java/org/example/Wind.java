package org.example;

public class Wind extends Instrument {

    public Wind (String name, int price) {
        super(name, price);
    }

    public void play() {
        System.out.println("A wind instrument is playing");
    }
}
