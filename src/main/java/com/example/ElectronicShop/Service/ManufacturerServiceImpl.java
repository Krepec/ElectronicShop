package com.example.ElectronicShop.Service;

import com.example.ElectronicShop.Model.Manufacturer;
import com.example.ElectronicShop.Repository.ManufacturerRepository;
import com.example.ElectronicShop.Service.ManufacturerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufacturerServiceImpl implements ManufacturerService {

    private final ManufacturerRepository manufacturerRepository;
    private Manufacturer manufacturerX;

    public ManufacturerServiceImpl(ManufacturerRepository manufacturerRepository) {
        this.manufacturerRepository = manufacturerRepository;
    }

    @Override
    public List<Manufacturer> findAll() {
        return manufacturerRepository.findAll();
    }
    @Override
    public String add(Manufacturer manufacturer) {
        manufacturerX = manufacturerRepository.save(manufacturer);
        return "Dodano " +  manufacturerX.getName();
    }
}
