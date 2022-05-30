package com.example.electronicShop.item;

import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;


    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }


    @Override
    public String addItem(ItemDAO itemDAO) {
        itemRepository.save(itemDAO);
        return "ok";
    }

    @Override
    public Iterable<ItemDAO> findAllItems() {
        return itemRepository.findAll();
    }


}
