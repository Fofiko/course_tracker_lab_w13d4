package com.codeclan.lab.courseBooking.repositories.BookingRepository;

import com.codeclan.lab.courseBooking.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {
}
