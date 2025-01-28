package com.example.booking_service.Controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.booking_service.model.Booking;

@RestController
public class BookingController {

    private static final String template = "Booking, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/booking")
    public Booking booking(@RequestParam(value = "number", defaultValue = "1") int number) {
        return new Booking(counter.incrementAndGet(), String.format(template, number));
    }
}