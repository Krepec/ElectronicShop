package com.example.ElectronicShop.Repository;

import com.example.ElectronicShop.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
