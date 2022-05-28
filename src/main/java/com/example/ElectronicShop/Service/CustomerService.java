package com.example.ElectronicShop.Service;

import com.example.ElectronicShop.Model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    String add(Customer customer);

    Iterable<Customer> findAll();
    Optional<Customer> findById(Long id);
    Optional<Customer> findByEmail(String email);
}
