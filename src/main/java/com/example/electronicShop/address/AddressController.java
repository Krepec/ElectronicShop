package com.example.electronicShop.address;

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
    public final Iterable<Address> findAll() {
        return addressServiceImpl.findAll();
    }

    @GetMapping("/{id}")
    public final Optional<Address> findById(@PathVariable Long id) {
        return addressServiceImpl.findById(id);
    }

    @PostMapping("/add")
    public final AddressDAO add(@RequestBody Address address) {
        return addressServiceImpl.add(address);

    }
}