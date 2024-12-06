package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", "Doe", 28),
                new Person("Jane", "Smith", 34),
                new Person("Michael", "Johnson", 45),
                new Person("Emily", "Williams", 23),
                new Person("Chris", "Brown", 30),
                new Person("Sarah", "Miller", 19),
                new Person("David", "Davis", 56),
                new Person("Sophia", "Garcia", 27),
                new Person("Daniel", "Martinez", 41),
                new Person("Olivia", "Hernandez", 22),
                new Person("James", "Lopez", 50),
                new Person("Ava", "Gonzalez", 33),
                new Person("Ethan", "Wilson", 37),
                new Person("Mia", "Anderson", 26),
                new Person("Matthew", "Thomas", 29),
                new Person("Isabella", "Taylor", 25),
                new Person("Lucas", "Moore", 38),
                new Person("Charlotte", "Jackson", 32),
                new Person("Jack", "Lee", 48),
                new Person("Amelia", "White", 31)
        );

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the first or last name of the person you're looking for");

        String userSearch = scanner.nextLine();

        var personList = people.stream()
                .filter(x -> x.getFirstName().equalsIgnoreCase(userSearch) ||
                        x.getLastName().equalsIgnoreCase(userSearch));
    }
}