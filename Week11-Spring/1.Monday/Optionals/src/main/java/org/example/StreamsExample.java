package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamsExample {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", 999.99, "TechCorp"),
                new Product("Phone", 599.99, "MobileMakers"),
                new Product("Tablet", 399.99, "GadgetWorld"),
                new Product("Monitor", 299.99, "ScreenSolutions"),
                new Product("Keyboard", 49.99, "AccessoryCo"),
                new Product("Mouse", 25.99, "AccessoryCo"),
                new Product("Printer", 149.99, "PrintWorks"),
                new Product("Camera", 699.99, "LensMasters"),
                new Product("Headphones", 199.99, "SoundGear"),
                new Product("Smartwatch", 249.99, "GadgetWorld"),
                new Product("Speaker", 89.99, "SoundGear"),
                new Product("Router", 129.99, "NetConnect"),
                new Product("External Hard Drive", 79.99, "StorageSolutions"),
                new Product("Microphone", 99.99, "SoundGear"),
                new Product("Gaming Console", 499.99, "TechCorp"),
                new Product("Smart TV", 799.99, "ScreenSolutions"),
                new Product("Bluetooth Earbuds", 149.99, "SoundGear"),
                new Product("Fitness Tracker", 199.99, "GadgetWorld"),
                new Product("Wireless Charger", 29.99, "AccessoryCo"),
                new Product("Projector", 399.99, "LensMasters"),
                new Product("Home Security Camera", 159.99, "NetConnect"),
                new Product("Portable Speaker", 119.99, "SoundGear"),
                new Product("Webcam", 59.99, "TechCorp"),
                new Product("Drawing Tablet", 349.99, "GadgetWorld"),
                new Product("3D Printer", 999.99, "PrintWorks"),
                new Product("Surround Sound System", 599.99, "SoundGear"),
                new Product("USB Hub", 19.99, "AccessoryCo"),
                new Product("Digital Photo Frame", 79.99, "StorageSolutions")
                );

        //I want all the products that Gadget World manufactures
        var gadgetWorldProducts = products.stream().filter(x -> x.getManufacturer().equalsIgnoreCase("GadgetWorld")).toList();

        //I want all the products that are more than $300
        var moreThan300 = products.stream().filter(x -> x.getPrice() > 300).toList();

        //I want SoundGear products greater than $500
        var soundGearProducts = products.stream().filter(y -> y.getPrice() > 500 && y.getManufacturer().equalsIgnoreCase("SoundGear")).toList();

        //I want products made by LensMasters or PrintWorks
        var lensOrPrintWorks = products.stream()
                .filter(y -> y.getManufacturer().equalsIgnoreCase("LensMasters")
                        || y.getManufacturer().equalsIgnoreCase("PrintWorks")).toList();

        //Java streams also has aggregate functions

        //How many products does SoundGear offer?
        var soundGearNumOfProducts = products.stream().filter(b -> b.getManufacturer().equalsIgnoreCase("SoundGear"))
                                                      .count();

        //I want the average price of TechCorp products
        var techCorpAvg = products.stream().filter(c -> c.getManufacturer().equalsIgnoreCase("TechCorp"))
                                           .mapToDouble(Product::getPrice)
                                           .average();

        //max and min
        //I want the price of the most expensive item
        var highestPrice = products.stream().max(Comparator.comparing(Product::getPrice));

        //the least expensive product
        var lowestPrice = products.stream().min(Comparator.comparing(Product::getPrice));

        //Sum up all the prices
        var priceSum = products.stream().mapToDouble(Product::getPrice).sum();
    }
}
