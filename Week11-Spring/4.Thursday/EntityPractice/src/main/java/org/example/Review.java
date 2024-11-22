package org.example;

import java.time.LocalDateTime;

public class Review {
    private int id;
    private Product product; // Many-to-one relationship
    private User user; // Many-to-one relationship
    private int rating;
    private String comment;
    private LocalDateTime reviewDate;
}
