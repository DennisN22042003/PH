package com.example.portfolio_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDate;
import java.time.LocalTime;

// SIMPLE MODEL FOR TESTING THE PORTFOLIO CLASS LOCALLY
public class Portfolio {
    private Long id;
    private String photographer;
    private String category;
    private String description;

    public Portfolio(Long id, String photographer, String category, String description) {
        this.id = id;
        this.photographer = photographer;
        this.category = category;
        this.description = description;
    }

    public Long getId() {
        return id;
    }
    public String getPhotographer() {
        return photographer;
    }
    public String getCategory() {
        return category;
    }
    public String getDescription() {
        return description;
    }
}