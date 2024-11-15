package org.example;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(10, "Lego Set", Category.TOYS);
        Product product2 = new Product(200, "Knife Set", Category.KITCHENWARE);
        Product product3 = new Product(50, "Boombox", Category.ELECTRONICS);

        ShoppingCart cart = new ShoppingCart();

        cart.addCartItem(product);

        Sandwich sandwich = new Sandwich();


    }
}