package com.example.electronicShop.item.controller;

import com.example.electronicShop.item.dto.ItemDTO;
import com.example.electronicShop.item.service.ItemServiceImpl;
import com.example.electronicShop.item.dao.Item;
import com.example.electronicShop.manufacturer.dao.Manufacturer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;

@RestController
@RequestMapping("/item")
public class ItemController {

    private final ItemServiceImpl itemServiceImpl;

    public ItemController(ItemServiceImpl itemServiceImpl) {
        this.itemServiceImpl = itemServiceImpl;
    }

    @PostMapping(value = "/add", consumes = "application/json")
    public final String addItem(@RequestBody ItemDTO itemDTO){
        return itemServiceImpl.addItem(itemDTO);
    }

    @GetMapping("/all")
    public final Iterable<ItemDTO> findAll(){
        return itemServiceImpl.findAllItems();

    }
}
