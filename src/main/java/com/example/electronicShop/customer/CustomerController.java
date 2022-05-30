package com.example.electronicShop.customer;

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
public final Iterable<CustomerDAO> findAll(){
        return customerServiceImpl.findAll();
}

    @GetMapping("/{id}")
    public final Optional<CustomerDAO> findById(Long id){
        return customerServiceImpl.findById(id);
    }
    @GetMapping("/{email}")
    public final Optional<CustomerDAO> findByEmail(String email){
        return customerServiceImpl.findByEmail(email);
    }


    @PostMapping("/add")
    public final String add(@RequestBody CustomerDAO customerDAO) {
        return customerServiceImpl.add(customerDAO);
    }
}
