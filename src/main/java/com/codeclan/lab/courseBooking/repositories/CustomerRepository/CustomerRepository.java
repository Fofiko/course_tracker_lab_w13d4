package com.codeclan.lab.courseBooking.repositories.CustomerRepository;

import com.codeclan.lab.courseBooking.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {
}
