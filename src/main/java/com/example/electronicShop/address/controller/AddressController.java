package com.example.electronicShop.address.controller;

import com.example.electronicShop.address.dao.Address;
import com.example.electronicShop.address.dto.AddressDTO;
import com.example.electronicShop.address.service.AddressServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class AddressController{

    private final AddressServiceImpl addressServiceImpl;

    public AddressController(AddressServiceImpl addressServiceImpl) {
        this.addressServiceImpl = addressServiceImpl;
    }

    @GetMapping("/all")
    public final Iterable<AddressDTO> findAll() {
        return addressServiceImpl.findAll();
    }

    @GetMapping("/{id}")
    public final AddressDTO findById(@PathVariable Long id) {
        return addressServiceImpl.findById(id);
    }

    @PostMapping("/add")
    public final Address add(@RequestBody AddressDTO addressDTO) {
        return addressServiceImpl.add(addressDTO);

    }


}
