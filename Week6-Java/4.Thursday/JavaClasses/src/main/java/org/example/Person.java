package org.example;

public class Person {
    //properties
    //constructors
    //behaviors
    //overrides
    private String name;
    private int age;
    private String occupation;
    private boolean onBoardingComplete;

    public Person(String name, int age, String occupation, boolean onBoardingComplete){
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.onBoardingComplete = onBoardingComplete;
    }

    //getters and setters
    //A getter is a function that returns the value of a property
    //A setter is a function that sets the value of a property
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
