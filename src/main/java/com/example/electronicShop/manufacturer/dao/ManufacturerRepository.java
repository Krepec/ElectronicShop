package com.example.electronicShop.manufacturer.dao;

import com.example.electronicShop.manufacturer.dao.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManufacturerRepository extends JpaRepository<Manufacturer, Long> {
}
