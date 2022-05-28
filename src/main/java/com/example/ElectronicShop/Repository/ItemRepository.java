package com.example.ElectronicShop.Repository;

import com.example.ElectronicShop.Model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
