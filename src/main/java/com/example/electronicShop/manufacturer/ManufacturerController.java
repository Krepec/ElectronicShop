package com.example.electronicShop.manufacturer;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Manufacturer")
public class ManufacturerController {

    private final ManufacturerServiceImpl manufacturerServiceImpl;
    public ManufacturerController(ManufacturerServiceImpl manufacturerServiceImpl) {
        this.manufacturerServiceImpl = manufacturerServiceImpl;
    }

    @GetMapping("/all")
    public final Iterable<ManufacturerDAO> findAll(){
        return manufacturerServiceImpl.findAll();
    }

    @PostMapping("/add")
    public final String add(@RequestBody ManufacturerDAO manufacturerDAO){
        return manufacturerServiceImpl.add(manufacturerDAO);
    }
}
