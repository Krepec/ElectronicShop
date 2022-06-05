package com.example.electronicShop.customer.controller;

import com.example.electronicShop.customer.dto.CustomerDTO;
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
    public final Iterable<CustomerDTO> findAll() {
        return customerServiceImpl.findAll();
    }

    @GetMapping("/id/{id}")
    public final CustomerDTO findById(@PathVariable Long id) {
        return customerServiceImpl.findById(id);
    }

    @GetMapping("/email/{email}")
    public final CustomerDTO findByEmail(@PathVariable String email) {
        return customerServiceImpl.findByEmail(email);
    }


    @PostMapping("/add")
    public final String add(@RequestBody CustomerDTO customerDTO) {
        return customerServiceImpl.add(customerDTO);
    }
}
