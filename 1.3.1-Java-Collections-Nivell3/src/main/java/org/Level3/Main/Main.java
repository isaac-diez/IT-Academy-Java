package org.Level3.Main;


import org.Level3.Model.Person;
import org.Level3.Model.Reader;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        Reader myReader = new Reader();
        Set<Person> people = myReader.readFromFile("src/myFilesFolderTest/documents/names.csv");

        System.out.println("___Name______LastName______DNI Number___");

        for (Person person : people) {
            System.out.println(person.getName() + "       " + person.getLastName() + "       " + person.getDni());
        }





    }
}