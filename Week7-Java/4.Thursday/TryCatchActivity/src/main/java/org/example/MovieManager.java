package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> favoriteMovies = new ArrayList<>();

        favoriteMovies.add("Inception");
        favoriteMovies.add("The Matrix");

        System.out.println("Welcome to the Movie Manager!");

        boolean running = true;
        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a movie");
            System.out.println("2. Remove a movie by index");
            System.out.println("3. Print a movie by index");
            System.out.println("4. Print all movies");
            System.out.println("5. Quit");
            System.out.print("Choose an option (1-5): ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter the movie name: ");
                    String movie = scanner.nextLine();
                    favoriteMovies.add(movie);
                    System.out.println("Movie added!");
                    break;

                case "2":
                    System.out.print("Enter the index to remove: ");
                    int removeIndex;
                    try {
                        removeIndex = Integer.parseInt(scanner.nextLine());
                        if (removeIndex >= 0 && removeIndex < favoriteMovies.size()) {
                            favoriteMovies.remove(removeIndex);
                            System.out.println("Movie removed.");
                        } else {
                            System.out.println("Invalid index.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number.");
                    }
                    break;

                case "3":
                    System.out.print("Enter the index to print: ");
                    int printIndex;
                    try {
                        printIndex = Integer.parseInt(scanner.nextLine());
                        if (printIndex >= 0 && printIndex < favoriteMovies.size()) {
                            System.out.println("Movie: " + favoriteMovies.get(printIndex));
                        } else {
                            System.out.println("Invalid index.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number.");
                    }
                    break;

                case "4":
                    System.out.println("Favorite Movies:");
                    if (favoriteMovies.isEmpty()) {
                        System.out.println("No movies in the list.");
                    } else {
                        for (int i = 0; i < favoriteMovies.size(); i++) {
                            System.out.println(i + ": " + favoriteMovies.get(i));
                        }
                    }
                    break;

                case "5":
                    System.out.println("Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please choose between 1-5.");
            }
        }
    }
}
