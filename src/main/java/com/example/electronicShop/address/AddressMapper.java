package com.example.electronicShop.address;

import org.springframework.stereotype.Component;

@Component
public class AddressMapper {

    public final Address mapAddressDAO(AddressDAO addressDAO) {
        return new Address(addressDAO.getId(),
                addressDAO.getcountry(), addressDAO.getCity(),
                addressDAO.getStreet(), addressDAO.getBuilding(),
                addressDAO.getFlat(), addressDAO.getZipCode());
    }

    public final AddressDAO mapAddress(Address address) {
        return new AddressDAO(address.getId(),
                address.getcountry(), address.getCity(),
                address.getStreet(), address.getBuilding(),
                address.getFlat(), address.getZipCode());
    }
}
