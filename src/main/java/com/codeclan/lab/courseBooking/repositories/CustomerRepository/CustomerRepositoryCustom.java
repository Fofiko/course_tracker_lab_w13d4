package com.codeclan.lab.courseBooking.repositories.CustomerRepository;

import com.codeclan.lab.courseBooking.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
//    public List<Customer> getCustomersForCourse(Long courseId);
//    public List<Customer> getCustomersInTownForCourse(String town, Long courseId);
    public List<Customer> getCustomersOverAgeInTownForCourse(int age, String town, Long courseId);

    }
