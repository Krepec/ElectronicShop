package com.example.electronicShop.customer.controller;

import com.example.electronicShop.customer.service.CustomerServiceImpl;
import com.example.electronicShop.customer.dao.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerServiceImpl customerServiceImpl;

    public CustomerController(CustomerServiceImpl customerServiceImpl) {
        this.customerServiceImpl = customerServiceImpl;
    }
@GetMapping("/all")
public final Iterable<Customer> findAll(){
        return customerServiceImpl.findAll();
}

    @GetMapping("/{id}")
    public final Optional<Customer> findById(Long id){
        return customerServiceImpl.findById(id);
    }
    @GetMapping("/{email}")
    public final Optional<Customer> findByEmail(String email){
        return customerServiceImpl.findByEmail(email);
    }


    @PostMapping("/add")
    public final String add(@RequestBody Customer customer) {
        return customerServiceImpl.add(customer);
    }
}
