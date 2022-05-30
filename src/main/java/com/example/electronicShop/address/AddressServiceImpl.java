package com.example.electronicShop.address;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;
    private final AddressMapper addressMapper;

    AddressServiceImpl(AddressRepository addressRepository, AddressMapper addressMapper) {
        this.addressRepository = addressRepository;
        this.addressMapper = addressMapper;
    }

    @Override
    public List<Address> findAll() {
        return addressRepository.findAll()
                .stream()
                .map(addressMapper::mapAddressDAO).collect(Collectors.toList());
    }

    public Optional<Address> findById(Long id) {
      return addressRepository.findById(id)
              .map(addressMapper::mapAddressDAO);
}

    public AddressDAO add(Address address) {
        return addressRepository.save(addressMapper.mapAddress(address));

    }


}

