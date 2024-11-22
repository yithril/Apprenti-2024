package org.example;

import java.time.LocalDateTime;
import java.util.List;

public class User {
    private int id;
    private String username;
    private String email;
    private LocalDateTime createdAt;
    private boolean isActive;
    private List<CustomerOrder> orders;
    private List<Address> addresses;
    private List<Review> reviews;
}
