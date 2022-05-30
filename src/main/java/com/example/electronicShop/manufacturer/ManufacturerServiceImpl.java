package com.example.electronicShop.manufacturer;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufacturerServiceImpl implements ManufacturerService {

    private final ManufacturerRepository manufacturerRepository;
    private ManufacturerDAO manufacturerDAOX;

    public ManufacturerServiceImpl(ManufacturerRepository manufacturerRepository) {
        this.manufacturerRepository = manufacturerRepository;
    }

    @Override
    public List<ManufacturerDAO> findAll() {
        return manufacturerRepository.findAll();
    }
    @Override
    public String add(ManufacturerDAO manufacturerDAO) {
        manufacturerDAOX = manufacturerRepository.save(manufacturerDAO);
        return "Dodano " +  manufacturerDAOX.getName();
    }
}
