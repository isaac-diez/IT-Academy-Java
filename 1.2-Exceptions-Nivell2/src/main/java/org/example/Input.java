package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private static Scanner input = new Scanner(System.in);

    public static byte readByte(String message) {

        byte age = 0;
        boolean correctInput = false;

        while (!correctInput) {
            try {
                System.out.println(message);
                age = input.nextByte();
                    correctInput = true;

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Enter a valid byte.");
                input.next();
            }
        }
        return age;

    }

    public static int readInt(String message){

        int phoneNumber = 0;
        boolean correctInput = false;

        while (!correctInput) {
            try {
                System.out.println(message);
                phoneNumber = input.nextInt();
                correctInput = true;

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Enter a valid integer.");
                input.next();
            }
        }
        return phoneNumber;
    }

    public static float readFloat(String message){

        float ibanNumber = 0;
        boolean correctInput = false;

        while (!correctInput) {
            try {
                System.out.println(message);
                ibanNumber = input.nextFloat();
                correctInput = true;

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Enter a valid float.");
                input.next();
            }
        }
        return ibanNumber;
    }

    public static double readDouble(String message){

        double coffeePrice = 0;
        boolean correctInput = false;

        while (!correctInput) {
            try {
                System.out.println(message);
                coffeePrice = input.nextDouble();
                correctInput = true;

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Enter a valid double.");
                input.next();
            }
        }
        return coffeePrice;
    }

    public static char readChar(String message) throws InputWrongException {

        char idLetter = 0;
        boolean correctInput = false;

        while (!correctInput) {
            try {
                System.out.println(message);
                String charInput = input.nextLine();

                if (charInput.length() == 1) {
                    idLetter = charInput.charAt(0);
                    correctInput = true;
                } else {
                    throw new InputWrongException("Invalid input. Enter a valid Char.");

                }
            } catch (InputWrongException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        return idLetter;
    }

    public static String readString(String message) throws InputWrongException {

        boolean correctInput = false;
        String name="";

        while (!correctInput) {
            try {
                System.out.println(message);
                name = input.nextLine();

                if (!name.isEmpty()) {
                    correctInput = true;

                } else {
                    throw new InputWrongException("The name can't be empty. Try again.");

                }
            } catch (InputWrongException e) {
                System.out.println(e.getMessage());
            }
        }
        return name;
    }

    public static boolean readYesNo(String message) throws InputWrongException {

        Boolean yesNo = false;
        boolean correctInput = false;

        while (!correctInput) {
            try {
                System.out.println(message);
                String reply = input.nextLine().trim().toLowerCase();

                if (reply.equals("y")) {
                    yesNo = true;
                    correctInput = true;
                } else if (reply.equals("n")) {
                    yesNo = false;
                    correctInput = true;

                } else {
                    throw new InputWrongException("Invalid input. Try again.");
                }
            } catch (InputWrongException e) {
                System.out.println("Error: " + e.getMessage());

            }
        }
        return yesNo;
    }

}
