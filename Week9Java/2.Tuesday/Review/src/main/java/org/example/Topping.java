package org.example;

public class Topping {
    private String name;
    private boolean isPremium;
    private ToppingType toppingType;

    public Topping(String name, boolean isPremium, ToppingType toppingType) {
        this.name = name;
        this.isPremium = isPremium;
        this.toppingType = toppingType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    public ToppingType getToppingType() {
        return toppingType;
    }

    public void setToppingType(ToppingType toppingType) {
        this.toppingType = toppingType;
    }

    public double getCost(int sandwichSize){
        if(!isPremium){
            return 0;
        }

        if(toppingType == ToppingType.MEAT && sandwichSize == 4){
            return 1;
        }
    }
}
