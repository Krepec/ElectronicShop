package com.example.electronicShop.customer.dao;

import com.example.electronicShop.customer.dto.CustomerDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<CustomerDTO> findByEmail(String email);
}
