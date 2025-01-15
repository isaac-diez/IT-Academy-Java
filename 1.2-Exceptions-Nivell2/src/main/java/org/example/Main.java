package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;



public class Main {


    public static void main(String[] args) {

        System.out.println("Age input: " + Input.readByte("Enter your age"));
        System.out.println("Phone number input: " + Input.readInt("Enter your phone number"));
        System.out.println("IBAN number input: " + Input.readFloat("Enter your IBAN number"));
        System.out.println("Price of coffee input: " + Input.readDouble("Enter the price of coffee at the IT Academy"));

        try {
            System.out.println("Your name input: " + Input.readString("Enter your name"));
            System.out.println("Letter of your ID input: " + Input.readChar("Enter the letter of your ID"));
            System.out.println("Letter of your ID input: " + Input.readYesNo("Do you want to continue (Y/N)"));

        } catch (InputWrongException e) {
            System.out.println("Error: " + e.getMessage());;
        }

    }



}