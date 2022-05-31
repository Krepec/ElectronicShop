package com.example.electronicShop.item.service;

import com.example.electronicShop.item.dao.Item;

public interface ItemService {

    String addItem(Item item);
    Iterable<Item> findAllItems();
}
