package com.codeclan.lab.courseBooking.repositories.BookingRepository;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

public class BookingRepositoryImpl implements BookingRepositoryCustom{

    @Autowired
    EntityManager entityManager;
}
