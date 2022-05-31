package com.example.electronicShop.item.service;

import com.example.electronicShop.item.dao.Item;
import com.example.electronicShop.item.dao.ItemRepository;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;


    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }


    @Override
    public String addItem(Item item) {
        itemRepository.save(item);
        return "ok";
    }

    @Override
    public Iterable<Item> findAllItems() {
        return itemRepository.findAll();
    }


}
