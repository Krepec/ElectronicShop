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

    private ItemServiceImpl itemServiceImpl;

    @Autowired
    public ItemController(ItemServiceImpl itemServiceImpl) {
        this.itemServiceImpl = itemServiceImpl;
    }

    @RequestMapping("/test")
    public String sayTest(){

        itemServiceImpl.addItem(new Item(2L,"Słoń porcelanowy",23.2, new ArrayList<>(), new Manufacturer(4L,"lol",new HashSet<>())));
//        itemServiceImpl.addItem(new Item(1L,"Kubek",232.2));
//        itemServiceImpl.addItem(new Item(3L,"Kibel",340.12));
       /* itemServiceImpl.addItem(new Item(4L,"Kubek",351.23));
        itemServiceImpl.addItem(new Item(34L,"Kibel",800.45));
        itemServiceImpl.addItem(new Item(123L,"TV",500.02));
        itemServiceImpl.addItem(new Item(23L,"Telefon",5654.0));
        itemServiceImpl.addItem(new Item(44L,"TV",8000.0));
        itemServiceImpl.addItem(new Item(5L,"TV",1500.0));*/
        return "dtscvbt";
    }

    @PostMapping(value = "/add", consumes = "application/json")
    public String addItem(@RequestBody Item item){
        return itemServiceImpl.addItem(item);
    }

    @GetMapping("/all")
    public Iterable<Item> findAll(){
        return itemServiceImpl.findAllItems();

    }
}
