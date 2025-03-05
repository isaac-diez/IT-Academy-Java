package org.Level3.Model;

import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Reader {

    public Set<Person> readFromFile(String filename) {

        Set<Person> people = new HashSet<>();
        String name = "";
        String lastName = "";
        String dni = "";

        try (
                Scanner scanner = new Scanner(Paths.get(filename))) {

            while (scanner.hasNextLine()) {

                String row = scanner.nextLine();

                String[] values = row.split(",");


                if (values.length == 3) { // Ensure correct format
                    name = values[0].trim();
                    lastName = values[1].trim();
                    dni = values[2].trim();
                }

                people.add(new Person(name, lastName, dni));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return people;

    }

}