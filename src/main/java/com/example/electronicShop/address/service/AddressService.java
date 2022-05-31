package com.example.electronicShop.address.service;

import com.example.electronicShop.address.dto.AddressDTO;

import java.util.List;

public interface AddressService {

    List<AddressDTO> findAll();

}
