package com.example.ElectronicShop.Controller;

import com.example.ElectronicShop.Model.Address;
import com.example.ElectronicShop.Model.Item;
import com.example.ElectronicShop.Model.Manufacturer;
import com.example.ElectronicShop.Service.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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

        itemServiceImpl.addItem(new Item(23L,"TV OLED55G23",6000.0, new ArrayList<>(), new Manufacturer(23L,"LG",new HashSet<>())));
        return "test dodany";
    }

    @PostMapping(value = "/add", consumes = "application/json")
    public final String addItem(@RequestBody Item item){
        return itemServiceImpl.addItem(item);
    }

    @GetMapping("/all")
    public final Iterable<Item> findAll(){
        return itemServiceImpl.findAllItems();

    }
}
