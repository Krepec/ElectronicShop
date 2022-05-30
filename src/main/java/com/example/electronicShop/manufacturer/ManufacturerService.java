package com.example.electronicShop.manufacturer;


import java.util.List;public interface ManufacturerService {

    List<ManufacturerDAO> findAll();
    String add(ManufacturerDAO manufacturerDAO);
}
