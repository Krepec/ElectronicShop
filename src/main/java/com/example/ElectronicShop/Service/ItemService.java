package com.example.ElectronicShop.Service;

import com.example.ElectronicShop.Model.Item;

public interface ItemService {

    String addItem(Item item);
    Iterable<Item> findAllItems();
}
