package com.codeclan.lab.courseBooking.repositories.BookingRepository;

import com.codeclan.lab.courseBooking.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {
    public List<Booking> getBookingsForDate(String date);

    }
