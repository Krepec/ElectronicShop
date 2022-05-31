package com.example.electronicShop.address.mapper;

import com.example.electronicShop.address.dao.Address;
import com.example.electronicShop.address.dto.AddressDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressMapper {
    Address addressDTOtoAddress(AddressDTO addressDTO);
    AddressDTO addressToAddressDTO(Address address);

}
