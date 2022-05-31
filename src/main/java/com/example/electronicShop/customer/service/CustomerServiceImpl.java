package com.example.electronicShop.customer.service;

import com.example.electronicShop.customer.dao.Customer;
import com.example.electronicShop.customer.dao.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository customerRepository;
    private Customer customerDAOX;

    CustomerServiceImpl(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }


    @Override
    public String add(Customer customer) {
        customerDAOX = customerRepository.save(customer);
        return "Klient " + customerDAOX.getName() + " dodany";
    }

    @Override
    public Iterable<Customer> findAll() {
        return null;
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public Optional<Customer> findByEmail(String email) {
        return customerRepository.findByEmail(email);
    }
}
