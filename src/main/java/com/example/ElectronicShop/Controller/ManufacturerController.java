package com.example.ElectronicShop.Controller;

import com.example.ElectronicShop.Service.ManufacturerServiceImpl;
import com.example.ElectronicShop.Model.Manufacturer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Manufacturer")
public class ManufacturerController {

    private final ManufacturerServiceImpl manufacturerServiceImpl;
    public ManufacturerController(ManufacturerServiceImpl manufacturerServiceImpl) {
        this.manufacturerServiceImpl = manufacturerServiceImpl;
    }

    @GetMapping("/all")
    public final Iterable<Manufacturer> findAll(){
        return manufacturerServiceImpl.findAll();
    }

    @PostMapping("/add")
    public final String add(@RequestBody Manufacturer manufacturer){
        return manufacturerServiceImpl.add(manufacturer);
    }
}
