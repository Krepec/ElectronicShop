package com.example.ElectronicShop.Service;


import com.example.ElectronicShop.Model.Manufacturer;

import java.util.List;

public interface ManufacturerService {

    List<Manufacturer> findAll();
    String add(Manufacturer manufacturer);
}
