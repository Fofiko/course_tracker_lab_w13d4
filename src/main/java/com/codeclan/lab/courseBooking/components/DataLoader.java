package com.codeclan.lab.courseBooking.components;

import com.codeclan.lab.courseBooking.models.Booking;
import com.codeclan.lab.courseBooking.models.Course;
import com.codeclan.lab.courseBooking.models.Customer;
import com.codeclan.lab.courseBooking.repositories.BookingRepository.BookingRepository;
import com.codeclan.lab.courseBooking.repositories.CourseRepository.CourseRepository;
import com.codeclan.lab.courseBooking.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    public DataLoader(){}

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Course course1 = new Course("Intro to Python", "Edinburgh", 5);
        Course course2 = new Course("Intro to Java", "Glasgow", 4);
        courseRepository.save(course1);
        courseRepository.save(course2);

        Customer customer1 = new Customer("Bob", "Edinburgh", 21);
        Customer customer2 = new Customer("Felicia", "Glasgow", 43);
        customerRepository.save(customer1);
        customerRepository.save(customer2);

        Booking booking1 = new Booking("25-10-18", course1, customer1);
        Booking booking2 = new Booking("28-02-19", course2, customer2);

        bookingRepository.save(booking1);
        bookingRepository.save(booking2);
    }
}
