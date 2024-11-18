package org.example;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optionalStringValue = Optional.of("Java");

        //how do we check to see if there is a value inside the optional?
        //IsEmpty() isPresent()
        if(optionalStringValue.isPresent()){
            System.out.println("There is a value!");
        }
    }
}
