package com.codeclan.lab.courseBooking.repositories.BookingRepository;

import com.codeclan.lab.courseBooking.models.Booking;

import java.util.List;

public interface BookingRepositoryCustom {
    public List<Booking> getBookingsForDate(String date);
    }
