package com.example.booking_service.Controllers;

import java.util.concurrent.atomic.AtomicLong;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.booking_service.model.Booking;
import com.example.booking_service.Services.BookingService;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    /*@PostMapping
    public ResponseEntity<Booking> createBooking(@RequestBody BookingRequestDTO bookingRequest) {
        Booking booking = bookingService.createBooking(bookingRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(booking);
    }*/

    @GetMapping("/all")
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @GetMapping("/{id}")
    public Optional<Booking> getBookingById(@PathVariable Long id) {
        return bookingService.getBookingById(id);
    }
} 

/* 
 * // TESTING THE BOOKING CONTROLLER LOCALLY
@RestController
@RequestMapping("/bookings")
public class BookingControllerLocalTesting {

    private final BookingServiceLocalTesting bookingServiceLocalTesting;

    public BookingControllerLocalTesting(BookingServiceLocalTesting bookingServiceLocalTesting) {
        this.bookingServiceLocalTesting = bookingServiceLocalTesting;
    }

    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingServiceLocalTesting.getAllBookings();
    }

    @GetMapping("/{id}")
    public Optional<Booking> getBookingById(@PathVariable Long id) {
        return bookingServiceLocalTesting.getBookingById(id);
    }
}
*/
