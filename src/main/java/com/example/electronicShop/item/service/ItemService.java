package com.example.electronicShop.item.service;

import com.example.electronicShop.item.dto.ItemDTO;

public interface ItemService {

    String addItem(ItemDTO itemDTO);
    Iterable<ItemDTO> findAllItems();
}
