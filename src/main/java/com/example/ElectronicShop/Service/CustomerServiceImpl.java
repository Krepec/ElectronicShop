package com.example.ElectronicShop.Service;

import com.example.ElectronicShop.Model.Customer;
import com.example.ElectronicShop.Repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository customerRepository;
    private Customer customerX;

    CustomerServiceImpl(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }


    @Override
    public String add(Customer customer) {
        customerX = customerRepository.save(customer);
        return "Klient " + customerX.getName() + " dodany";
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
