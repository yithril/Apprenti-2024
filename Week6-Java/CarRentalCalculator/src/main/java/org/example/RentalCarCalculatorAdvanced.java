package org.example;

import java.util.Scanner;

public class RentalCarCalculatorAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants
        //final is like const in Javascript, once its set, that's it
        //final variables are sometimes written all caps in snake case
        //to indicate they are constants
        final double BASIC_RENTAL_COST = 29.99;
        final double UNDERAGE_SURCHARGE_RATE = 0.30;
        final double TOLL_TAG_COST = 3.95;
        final double GPS_COST = 2.95;
        final double ROADSIDE_ASSISTANCE_COST = 3.95;
        final int UNDERAGE_THRESHOLD = 25;

        // Step 1: Collect input from user
        System.out.print("Enter pickup date (format YYYY-MM-DD): ");
        String pickupDate = scanner.nextLine();

        System.out.print("Enter number of days for the rental: ");
        int rentalDays = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Do you want an electronic toll tag? (yes/no): ");
        boolean wantsTollTag = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.print("Do you want a GPS? (yes/no): ");
        boolean wantsGPS = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.print("Do you want roadside assistance? (yes/no): ");
        boolean wantsRoadsideAssistance = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.print("Enter your current age: ");
        int age = scanner.nextInt();

        // Step 2: Calculate costs
        double basicRentalCost = BASIC_RENTAL_COST * rentalDays;
        double optionsCost = 0.0;

        if (wantsTollTag) {
            optionsCost += TOLL_TAG_COST * rentalDays;
        }

        if (wantsGPS) {
            optionsCost += GPS_COST * rentalDays;
        }

        if (wantsRoadsideAssistance) {
            optionsCost += ROADSIDE_ASSISTANCE_COST * rentalDays;
        }

        double underageSurcharge = 0.0;
        if (age < UNDERAGE_THRESHOLD) {
            underageSurcharge = basicRentalCost * UNDERAGE_SURCHARGE_RATE;
        }

        // Step 3: Calculate total cost
        double totalCost = basicRentalCost + optionsCost + underageSurcharge;

        // Step 4: Display results
        System.out.println("\n--- Rental Car Cost Breakdown ---");
        System.out.printf("Basic car rental: $%.2f\n", basicRentalCost);
        System.out.printf("Options cost: $%.2f\n", optionsCost);
        System.out.printf("Underage driver surcharge: $%.2f\n", underageSurcharge);
        System.out.printf("Total cost: $%.2f\n", totalCost);
    }
}
