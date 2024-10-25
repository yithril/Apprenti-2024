package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Product> shoppingList = new ArrayList<>();

        Product product1 = new Product("Iphone", 2000);

        shoppingList.add(product1);

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("1) List All Shopping Cart Items");
            System.out.println("2) Add a Shopping Cart Item");
            System.out.println("3) Remove an item");
            System.out.println("4) Exit");

            int userInput = scanner.nextInt();

            switch(userInput){
                case 1:
                    if(shoppingList.isEmpty()){
                        System.out.println("Your shopping list is empty.");
                    }
                    else{
                        System.out.println("This is your shopping list:");
                        for(Product product : shoppingList){
                            System.out.printf("Name: %s Price: $%.2f %n", product.getName(), product.getPrice());
                        }
                    }
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("What is the name of the product?");
                    String name = scanner.nextLine();
                    System.out.println("What is the price of the product?");
                    double price = scanner.nextDouble();
                    Product product = new Product(name, price);
                    shoppingList.add(product);
                    System.out.println(name + " was added to the list.");
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("What product would you like to remove?");
                    String nameToRemove = scanner.nextLine();
                    Product productToRemove = null;
                    for(Product p : shoppingList){
                        if(p.getName().equalsIgnoreCase(nameToRemove)){
                            productToRemove = p;
                        }
                    }
                    shoppingList.remove(productToRemove);
                    System.out.println("Product removed.");
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("That is not an option try again");
                    break;
            }
        }
    }
}