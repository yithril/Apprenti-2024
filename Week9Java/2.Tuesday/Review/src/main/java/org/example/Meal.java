package org.example;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Sandwich> sandwiches = new ArrayList<>();
    private List<Chips> chips = new ArrayList<>();
    private List<Drink> drinks = new ArrayList<>();

    public int numberOfSandwiches(){
        return sandwiches.size();
    }
}
