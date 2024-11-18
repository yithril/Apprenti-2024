package org.example;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();

        Optional<String> user = userRepository.getUserById(-1);

        if(user.isPresent()){
            System.out.println("The user name length is " + user.get().length());
        }
        else{
            System.out.println("User not found.");
        }
    }
}