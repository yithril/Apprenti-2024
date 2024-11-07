package org.example;

public class Drink implements MenuItem {
    private DrinkSize drinkSize;

    public Drink(DrinkSize drinkSize) {
        this.drinkSize = drinkSize;
    }

    public double getCost(){
        if(drinkSize == DrinkSize.SMALL){
            return 2;
        }
        else if(drinkSize == DrinkSize.MEDIUM){
            return 2.5;
        }
        else{
            return 3;
        }
    }
}
