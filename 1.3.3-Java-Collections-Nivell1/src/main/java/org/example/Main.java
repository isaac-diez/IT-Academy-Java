package org.example;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        HashMap<String,String> countries = new HashMap<>();

        try (Scanner scanner = new Scanner(Paths.get("countries.txt"))){

            while(scanner.hasNextLine()){

                String row = scanner.nextLine();
                String[] parts = row.split(";");
                countries.put(parts[0],parts[1]);

                //System.out.println(row);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        //ArrayList<String> keysAsArray = new ArrayList<String>(countries.keySet());

        ArrayList<String> keysAsArray = new ArrayList<>();
        for (String countryName : countries.keySet()) {
            keysAsArray.add(countryName);
        }

        //System.out.println(keysAsArray.size());

        System.out.print("Input your name: ");
        String name = input.nextLine();

        int points = 0;
        ArrayList<String> countriesPicked = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            boolean checker = false;
            String countryName="";

            while (!checker) {
                Random randomPick = new Random();
                countryName = keysAsArray.get(randomPick.nextInt(keysAsArray.size()));

                if (!countriesPicked.contains(countryName)){
                    checker = true;
                }

                countriesPicked.add(countryName);

            }

            System.out.print("Capital of " + countryName + "? ");
            String capital = input.nextLine();

            if (countries.get(countryName).equals(capital)) {
                points++;
            }
        }

        System.out.println("You guessed right " + points + " times");

        Writer resultsWriter = new Writer("stats.txt");
        resultsWriter.writeToFile(name,points);




    }
}