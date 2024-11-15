package org.example;

import java.util.List;

public class Sandwich {
    private BreadType bread;
    private int size;
    private List<Topping> toppingList;

    public Sandwich(BreadType bread, int size, List<Topping> toppingList) {
        this.bread = bread;
        this.size = size;
        this.toppingList = toppingList;
    }

    public BreadType getBread() {
        return bread;
    }

    public void setBread(BreadType bread) {
        this.bread = bread;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<Topping> getToppingList() {
        return toppingList;
    }

    public void setToppingList(List<Topping> toppingList) {
        this.toppingList = toppingList;
    }

    public double getCost(){
        double cost = 0;
        for(Topping topping : toppingList){
            cost += topping.getCost(size);
        }

        return cost;
    }
}
