package com.example.electronicShop.item;

import com.example.electronicShop.manufacturer.ManufacturerDAO;
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

    @RequestMapping("/test")
    public final String sayTest(){

        itemServiceImpl.addItem(new ItemDAO(23L,"TV OLED55G23",6000.0, new ArrayList<>(), new ManufacturerDAO(23L,"LG",new HashSet<>())));
        return "test dodany";
    }

    @PostMapping(value = "/add", consumes = "application/json")
    public final String addItem(@RequestBody ItemDAO itemDAO){
        return itemServiceImpl.addItem(itemDAO);
    }

    @GetMapping("/all")
    public final Iterable<ItemDAO> findAll(){
        return itemServiceImpl.findAllItems();

    }
}
