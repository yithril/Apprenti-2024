package org.example;

import java.time.LocalDateTime;

public class CustomerOrder {
    private int id;
    private User user; // Many-to-one relationship
    private double total;
    private LocalDateTime orderDate;
}
