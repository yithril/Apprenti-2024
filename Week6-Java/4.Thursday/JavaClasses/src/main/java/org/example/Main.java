package org.example;

public class Main {
    public static void main(String[] args) {
        //when you create a new object
        //you are instantiating the object.
        //For example, on line 8 I am instantiating a Person (the new keyword is your hint)
        Person firstPerson = new Person("Bob Jones", 40, "Engineer", true);

        Person secondPerson = new Person("Lisa Smith", 35, "Doctor", true);

        //Person thirdPerson = new Person("George C.", 80, "Mechanic");
        System.out.println(firstPerson.getName());
    }
}