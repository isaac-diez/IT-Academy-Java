package org.example;

public class Main {
    public static void main(String[] args) {

        CalculateDNI DNICalculator = new CalculateDNI();

        for (int i = 0; i < 11; i++) {
            System.out.println(DNICalculator.calculateLetter((int) (Math.random() * 99999999)));
        }
    }
}