package com.example.electronicShop.manufacturer.service;


import com.example.electronicShop.manufacturer.dao.Manufacturer;

import java.util.List;public interface ManufacturerService {

    List<Manufacturer> findAll();
    String add(Manufacturer manufacturer);
}
