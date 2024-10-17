package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your sign?");


        String userSign = scanner.nextLine();

        //normalization
        //What if they type in PiscES
        switch(userSign.toLowerCase()){
            case "pisces":
                System.out.println("You will have good luck today!");
                break;
            case "sagittarius":
                System.out.println("Be wary of Virgo and Aries");
                break;
            case "capricorn":
                System.out.println("Money is in your future!");
                break;
            default:
                System.out.println("We do not have your horoscope!");
                break;
        }
    }
}