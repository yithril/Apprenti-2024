package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter pickup date (format YYYY-MM-DD): ");
        String pickupDate = scanner.nextLine();

        System.out.println("Enter number of days for the rental: ");
        int rentalDays = scanner.nextInt();
        scanner.nextLine();  // This is to handle the newline character left by nextInt()

        System.out.println("Do you want an electronic toll tag? (yes or no): ");
        String tollTagResponse = scanner.nextLine();

        System.out.println("Do you want a GPS? (yes or no): ");
        String gpsResponse = scanner.nextLine();

        System.out.println("Do you want roadside assistance? (yes or no): ");
        String roadsideResponse = scanner.nextLine();

        System.out.println("Enter your current age: ");
        int age = scanner.nextInt();

        double basicRentalCost = 29.99 * rentalDays;

        double optionsCost = 0;
        if (tollTagResponse.equalsIgnoreCase("yes")) {
            optionsCost += 3.95 * rentalDays;
        }
        if (gpsResponse.equalsIgnoreCase("yes")) {
            optionsCost += 2.95 * rentalDays;
        }
        if (roadsideResponse.equalsIgnoreCase("yes")) {
            optionsCost += 3.95 * rentalDays;
        }

        double underageSurcharge = 0;
        if (age < 25) {
            underageSurcharge = basicRentalCost * 0.30;
        }

        double totalCost = basicRentalCost + optionsCost + underageSurcharge;

        System.out.println("Basic car rental cost: $" + basicRentalCost);
        System.out.println("Options cost: $" + optionsCost);
        System.out.println("Underage driver surcharge: $" + underageSurcharge);
        System.out.println("Total cost: $" + totalCost);
    }
}