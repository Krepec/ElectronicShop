package com.example.electronicShop.manufacturer.service;

import com.example.electronicShop.manufacturer.dao.Manufacturer;
import com.example.electronicShop.manufacturer.dao.ManufacturerRepository;
import com.example.electronicShop.manufacturer.dto.ManufacturerDTO;
import com.example.electronicShop.manufacturer.mapper.ManufacturerMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ManufacturerServiceImpl implements ManufacturerService {

    private final ManufacturerRepository manufacturerRepository;
    private final ManufacturerMapper manufacturerMapper;

    public ManufacturerServiceImpl(ManufacturerRepository manufacturerRepository, ManufacturerMapper manufacturerMapper) {
        this.manufacturerRepository = manufacturerRepository;
        this.manufacturerMapper = manufacturerMapper;
    }

    @Override
    public List<ManufacturerDTO> findAll() {
        return manufacturerRepository.findAll()
                .stream()
                .map(manufacturerMapper::manufacturerToManufacturerDTO)
                .collect(Collectors.toList());
    }
    @Override
    public String add(ManufacturerDTO manufacturerDTO) {
        Manufacturer manufacturer = manufacturerMapper.manufacturerDTOtoManufacturer(manufacturerDTO);
        manufacturerRepository.save(manufacturer);
        return "Dodano " +  manufacturer.getName();
    }
}
