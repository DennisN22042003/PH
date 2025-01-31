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
    private String photographerName;
    private String eventType;
    private String description;

    public Portfolio(Long id, String photographerName, String eventType, String description) {
        this.id = id;
        this.photographerName = photographerName;
        this.eventType = eventType;
        this.description = description;
    }

    public Long getId() {
        return id;
    }
    public String getPhotographer() {
        return photographerName;
    }
    public String getCategory() {
        return eventType;
    }
    public String getDescription() {
        return description;
    }
}