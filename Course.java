package com.kurszeit.course.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String category;
    private double price;
    private Date startDate;

    // Getters and Setters
}
