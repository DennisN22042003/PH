package com.example.booking_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDate;
import java.time.LocalTime;

/*@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private Long photographerId;
    private LocalDate date;
    private LocalTime time;
    private String location;
    private String statusCode;
} */

// SIMPLE MODEL FOR TESTING THE BOOKING CLASS LOCALLY
public class Booking {
    private Long id;
    private String user;
    private String photographer;
    private String date;
    private String time;
    private String location;
    private String status;

    public Booking(Long id, String user, String photographer, String date, String time, String location, String status) {
        this.id = id;
        this.user = user;
        this.photographer = photographer;
        this.date = date;
        this.time = time;
        this.location = location;
        this.status = status;
    }

    public Long getId() {
        return id;
    }
    public String getUser() {
        return user;
    }
    public String getPhotographer() {
        return photographer;
    }
    public String getDate() {
        return date;
    }
    public String getTime() {
        return time;
    }
    public String getLocation() {
        return location;
    }
    public String getStatus() {
        return status;
    }
}