package com.example.electronicShop.manufacturer.service;

import com.example.electronicShop.manufacturer.dao.Manufacturer;
import com.example.electronicShop.manufacturer.dao.ManufacturerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufacturerServiceImpl implements ManufacturerService {

    private final ManufacturerRepository manufacturerRepository;
    private Manufacturer manufacturerDAOX;

    public ManufacturerServiceImpl(ManufacturerRepository manufacturerRepository) {
        this.manufacturerRepository = manufacturerRepository;
    }

    @Override
    public List<Manufacturer> findAll() {
        return manufacturerRepository.findAll();
    }
    @Override
    public String add(Manufacturer manufacturer) {
        manufacturerDAOX = manufacturerRepository.save(manufacturer);
        return "Dodano " +  manufacturerDAOX.getName();
    }
}
