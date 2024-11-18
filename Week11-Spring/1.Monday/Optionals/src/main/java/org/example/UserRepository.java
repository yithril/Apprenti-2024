package org.example;

import java.util.Optional;

public class UserRepository {
    public Optional<String> getUserById(int id) {
        if (id < 0) {
            return Optional.empty();
        } else {
            return Optional.of("John Doe");
        }
    }
}
