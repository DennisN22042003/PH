package com.example.booking_service.Services;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.booking_service.model.Booking;
// import com.example.booking_service.Repositories.BookingRepository;
import com.example.booking_service.exceptions.BookingNotFoundException;

@Service
public class BookingService {
    // private final BookingRepository bookingRepository;
    // private final PhotographerClient photographerClient; // Calls the photographer micro-service

    private final List<Booking> bookings = Arrays.asList(
        // Sample data for testing
        new Booking(1L, "user1", "Photographer A", "2025-02-27", "10:00", "Nairobi", "Confirmed"),
        new Booking(2L, "user2", "Photographer B", "2025-02-27", "12:00", "Nairobi", "Pending")
    );

    public List<Booking> getAllBookings() {
        return bookings;
    }

    public Optional<Booking> getBookingById(Long id) {
        return bookings.stream().filter(b -> b.getId().equals(id)).findFirst();
    }

    /*public BookingService(BookingRepository bookingRepository, PhotographerClient photographerClient) {
        this.bookingRepository = bookingRepository;
        this.photographerClient = photographerClient;
    } */

    /* public Booking createBooking(BookingRequestDTO request) {
        // Validate photographer exists in the photographer-service
        Photographer photographer = photographerClient.getPhotographerById(request.getPhotographerId());
        if (photographer == null) {
            throw new IllegalArgumentException();
        }

        Booking booking = new Booking();
        booking.setUserId(request.getUserId());
        booking.setPhotographerId(request.getPhotographerId());
        booking.setDate(request.getDate());
        booking.setTime(request.getTime());
        booking.setLocation(request.getLocation());
        booking.setStatusCode(BookingStatusCode.PENDING);
        
        return bookingRepository.save(booking);
    } */

    /*public Booking getBooking(Long id) {
        return bookingRepository.findById(id).orElseThrow(() -> new BookingNotFoundException("Booking not found"));
    } */
}

// Resolve errors with PhotographerClient and BookingRequestDTO by;
// 1. Creating a new class called PhotographerClient in the Services package of the Photographer micro-service
// 2. Creating a new class called BookingRequestDTO in the model package of the Booking micro-service 

/* 
 * // TESTING THE BOOKING SERVICE LOCALLY
@Service
@Component
public class BookingServiceLocalTesting {
    
    private final List<Booking> bookings = Arrays.asList(
        // Sample data for testing
        new Booking(1L, "user1", "Photographer A", "2025-02-27", "10:00", "Nairobi", "Confirmed"),
        new Booking(2L, "user2", "Photographer B", "2025-02-27", "12:00", "Nairobi", "Pending")
    );

    public List<Booking> getAllBookings() {
        return bookings;
    }

    public Optional<Booking> getBookingById(Long id) {
        return bookings.stream().filter(b -> b.getId().equals(id)).findFirst();
    }
}
*/
