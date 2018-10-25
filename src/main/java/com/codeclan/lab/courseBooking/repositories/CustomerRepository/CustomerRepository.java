package com.codeclan.lab.courseBooking.repositories.CustomerRepository;

import com.codeclan.lab.courseBooking.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {
//    public List<Customer> getCustomersForCourse(Long courseId);
//    public List<Customer> getCustomersInTownForCourse(String town, Long courseId);
    public List<Customer> getCustomersOverAgeInTownForCourse(int age, String town, Long courseId);
}
