package com.example.ElectronicShop.Service;

import com.example.ElectronicShop.Model.Item;
import com.example.ElectronicShop.Repository.ItemRepository;
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
