package com.example.electronicShop.address.service;

import com.example.electronicShop.address.dao.Address;
import com.example.electronicShop.address.dao.AddressRepository;
import com.example.electronicShop.address.dto.AddressDTO;
import com.example.electronicShop.address.mapper.AddressMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;
    private final AddressMapper addressMapper;

    public AddressServiceImpl(AddressRepository addressRepository, AddressMapper addressMapper) {
        this.addressRepository = addressRepository;
        this.addressMapper = addressMapper;
    }

    @Override
    public List<AddressDTO> findAll() {
        return addressRepository.findAll()
                .stream()
                .map(addressMapper::addressToAddressDTO)
                .collect(Collectors.toList());
    }

    public AddressDTO findById(Long id) {
        return addressMapper.addressToAddressDTO(addressRepository.findById(id).orElseThrow());

}

    public Address add(AddressDTO addressDTO) {
        return addressRepository.save(addressMapper.addressDTOtoAddress(addressDTO));

    }


}

