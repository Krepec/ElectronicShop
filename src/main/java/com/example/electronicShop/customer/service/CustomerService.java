package com.example.electronicShop.customer.service;

import com.example.electronicShop.customer.dao.Customer;

import java.util.Optional;

public interface CustomerService {

    String add(Customer customer);

    Iterable<Customer> findAll();
    Optional<Customer> findById(Long id);
    Optional<Customer> findByEmail(String email);
}
