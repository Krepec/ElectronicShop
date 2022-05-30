package com.example.electronicShop.customer;

import java.util.Optional;

public interface CustomerService {

    String add(CustomerDAO customerDAO);

    Iterable<CustomerDAO> findAll();
    Optional<CustomerDAO> findById(Long id);
    Optional<CustomerDAO> findByEmail(String email);
}
