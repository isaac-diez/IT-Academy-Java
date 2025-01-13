package org.example;

public class Main {
    public static void main(String[] args) {

        Instrument guitar = new Strings("guitar", 500);
        Instrument cymbal = new Percussion("cymbal", 300);
        Instrument trumpet = new Wind("trumpet", 400);

        guitar.play();
        cymbal.play();
        trumpet.play();

    }


}