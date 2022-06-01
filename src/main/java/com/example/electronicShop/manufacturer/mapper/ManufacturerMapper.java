package com.example.electronicShop.manufacturer.mapper;

import com.example.electronicShop.manufacturer.dao.Manufacturer;
import com.example.electronicShop.manufacturer.dto.ManufacturerDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ManufacturerMapper {

    Manufacturer manufacturerDTOtoManufacturer(ManufacturerDTO manufacturerDTO);

    ManufacturerDTO manufacturerToManufacturerDTO(Manufacturer manufacturer);

}
