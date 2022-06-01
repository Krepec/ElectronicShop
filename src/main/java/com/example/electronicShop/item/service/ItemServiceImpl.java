package com.example.electronicShop.item.service;

import com.example.electronicShop.item.dao.Item;
import com.example.electronicShop.item.dao.ItemRepository;
import com.example.electronicShop.item.dto.ItemDTO;
import com.example.electronicShop.item.mapper.ItemMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;
    private final ItemMapper itemMapper;


    public ItemServiceImpl(ItemRepository itemRepository, ItemMapper itemMapper) {
        this.itemRepository = itemRepository;
        this.itemMapper = itemMapper;
    }

    @Override
    public String addItem(@RequestBody ItemDTO itemDTO) {
        Item item = itemMapper.itemDTOToItem(itemDTO);
        itemRepository.save(item);
        return "ok";
    }

    @Override
    public Iterable<ItemDTO> findAllItems() {
        return itemRepository.findAll().stream().map(itemMapper::itemToItemDTO).collect(Collectors.toList());
    }


}
