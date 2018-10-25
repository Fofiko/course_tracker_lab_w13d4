package com.codeclan.lab.courseBooking.controllers;

import com.codeclan.lab.courseBooking.models.Booking;
import com.codeclan.lab.courseBooking.repositories.BookingRepository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "date/{date}")
    public List<Booking> getBookingsForDate(@PathVariable String date) {
        return bookingRepository.getBookingsForDate(date);
    }
}
