package com.example.electronicShop.customer;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository customerRepository;
    private CustomerDAO customerDAOX;

    CustomerServiceImpl(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }


    @Override
    public String add(CustomerDAO customerDAO) {
        customerDAOX = customerRepository.save(customerDAO);
        return "Klient " + customerDAOX.getName() + " dodany";
    }

    @Override
    public Iterable<CustomerDAO> findAll() {
        return null;
    }

    @Override
    public Optional<CustomerDAO> findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public Optional<CustomerDAO> findByEmail(String email) {
        return customerRepository.findByEmail(email);
    }
}
