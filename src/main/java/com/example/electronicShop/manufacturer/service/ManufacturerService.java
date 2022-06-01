package com.example.electronicShop.manufacturer.service;


import com.example.electronicShop.manufacturer.dao.Manufacturer;
import com.example.electronicShop.manufacturer.dto.ManufacturerDTO;

import java.util.List;
public interface ManufacturerService {

    List<ManufacturerDTO> findAll();
    String add(ManufacturerDTO manufacturerDTO);
}
