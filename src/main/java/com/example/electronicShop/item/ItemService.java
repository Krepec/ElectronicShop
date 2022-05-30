package com.example.electronicShop.item;

public interface ItemService {

    String addItem(ItemDAO itemDAO);
    Iterable<ItemDAO> findAllItems();
}
