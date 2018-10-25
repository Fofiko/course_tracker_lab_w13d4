package com.codeclan.lab.courseBooking.controllers;

import com.codeclan.lab.courseBooking.models.Customer;
import com.codeclan.lab.courseBooking.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/course/{courseId}")
    public List<Customer> getCustomersForCourse(@PathVariable Long courseId) {
        return customerRepository.getCustomersForCourse(courseId);
    }

    @GetMapping(value = "/town/{town}/course/{courseId}")
    public List<Customer> getCustomersInTownForCourse(@PathVariable String town, @PathVariable Long courseId){
        return customerRepository.getCustomersInTownForCourse(town, courseId);
    }

}
