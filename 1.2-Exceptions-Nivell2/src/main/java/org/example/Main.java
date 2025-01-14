package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Age input: " + readByte("Enter your age"));

    }

    public static byte readByte(String message) throws InputMismatchException {

        Scanner input = new Scanner(System.in);
        byte age = 0;
        boolean correctInput = false;

        while (!correctInput) {
            try {
                System.out.println(message);
                age = input.nextByte();

                if (age > 0) {
                    correctInput = true;
                } else {
                    System.out.println("Your age must be over 0. Try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Enter a valid byte.");
                input.next();
            }
        }
        return age;

    }

    public static int readInt(String message){

        return 0;
    }

    public static float readFloat(String message){
        return 0;
    }

    public static double readDouble(String message){
        return 0.0;
    }

}