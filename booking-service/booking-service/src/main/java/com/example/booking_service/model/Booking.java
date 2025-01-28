package com.example.booking_service.model;

public record Booking(Long id, String content, String name, String email, String phone, String location, String date, String time) {

    public Booking {
        // No explicit assignments needed for final fields
    }
}