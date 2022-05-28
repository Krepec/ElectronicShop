package com.example.ElectronicShop.Controller;

import com.example.ElectronicShop.Model.Address;
import com.example.ElectronicShop.Service.AddressServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/address")
public class AddressController {

    private final AddressServiceImpl addressServiceImpl;

    public AddressController(AddressServiceImpl addressServiceImpl) {
        this.addressServiceImpl = addressServiceImpl;
    }

    @GetMapping("/all")
    public Iterable<Address> findAll(){

        return addressServiceImpl.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Address> findById(@PathVariable Long id){

        return addressServiceImpl.findById(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody Address address){
        addressServiceImpl.add(address);


    }}
