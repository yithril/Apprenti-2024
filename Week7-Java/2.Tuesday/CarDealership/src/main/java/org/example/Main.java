package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[20];

        // Fill the first 6 slots with the given vehicle information
        vehicles[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        vehicles[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        vehicles[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        vehicles[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        vehicles[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        vehicles[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Please select from the following options");
            System.out.println("1) List All Vehicles");
            System.out.println("2) Search Make And Model");
            System.out.println("6) Quit");

            int userInput = scanner.nextInt();

            switch(userInput){
                case 1:
                    listAllVehicles(vehicles);
                    break;
                case 2:
                    System.out.println("What is the make and model you're looking for?");
                    scanner.nextLine();
                    String makeModel = scanner.nextLine();
                    searchByMakeAndModel(vehicles, makeModel);
                    break;
                case 4:
                    System.out.println("What color of car are you looking for?");
                    scanner.nextLine();
                    String color = scanner.nextLine();
                    searchByColor(vehicles, color);
                case 6:
                    System.out.println("Ending program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Sorry that's not an option.");
                    break;
            }
        }
    }

    //List all vehicles
    public static void listAllVehicles(Vehicle[] vehicles){
        for(Vehicle vehicle : vehicles){
            if(vehicle != null){
                System.out.printf("Id: %d Make And Model: %s Color: %s Price: $%.2f Odometer: %d %n",
                        vehicle.getVehicleId(), vehicle.getMakeModel(), vehicle.getColor(), vehicle.getPrice(), vehicle.getOdometerReading());
            }
        }
    }

    public static void searchByMakeAndModel(Vehicle[] vehicles, String makeAndModel){
        for(Vehicle vehicle : vehicles){
            if(vehicle != null){
                if(vehicle.getMakeModel().equalsIgnoreCase(makeAndModel)){
                    System.out.printf("Id: %d Make And Model: %s Color: %s Price: $%.2f Odometer: %d %n",
                            vehicle.getVehicleId(), vehicle.getMakeModel(), vehicle.getColor(), vehicle.getPrice(), vehicle.getOdometerReading());
                }
            }
        }
    }

    //search by color
    public static void searchByColor(Vehicle[] vehicles, String color){
        for(Vehicle vehicle : vehicles){
            if(vehicle != null){
                if(vehicle.getColor().equalsIgnoreCase(color)){
                    System.out.printf("Id: %d Make And Model: %s Color: %s Price: $%.2f Odometer: %d",
                            vehicle.getVehicleId(), vehicle.getMakeModel(), vehicle.getColor(), vehicle.getPrice(), vehicle.getOdometerReading());
                }
            }
        }
    }
}