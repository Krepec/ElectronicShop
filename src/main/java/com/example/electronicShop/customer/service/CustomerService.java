package com.example.electronicShop.customer.service;

import com.example.electronicShop.customer.dto.CustomerDTO;

import java.util.Optional;

public interface CustomerService {

    String add(CustomerDTO customerDTO);

    Iterable<CustomerDTO> findAll();
    CustomerDTO findById(Long id);
    CustomerDTO findByEmail(String email);
}
