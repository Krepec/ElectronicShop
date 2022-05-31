package com.example.electronicShop.item;

import com.example.electronicShop.item.dao.Item;
import com.example.electronicShop.item.dto.ItemDTO;

public class ItemMapper {

    private ItemDTO mapItemDAO(Item item){
        return new ItemDTO(item.getId(), item.getName()
                , item.getPrice(), item.getCustomerDAO()
                , item.getManufacturerDAO());
    }
}
