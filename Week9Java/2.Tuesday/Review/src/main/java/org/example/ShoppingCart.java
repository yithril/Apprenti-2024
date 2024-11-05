package org.example;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    //don't forget to initialize the list
    //otherwise if later on you try to add or remove something from it
    //it'll error
    private List<Product> cartItems = new ArrayList<>();

    public void addCartItem(Product product){
        cartItems.add(product);
    }

    public void removeCartItem(Product product){
        Product productToRemove = null;

        for(Product p : cartItems){
            if(p.getName().equalsIgnoreCase(product.getName())){
                productToRemove = p;
            }
        }

        this.cartItems.remove(productToRemove);
    }
}
