package com.example.electronicShop.item;

public class ItemMapper {

    private Item mapItemDAO(ItemDAO itemDAO){
        return new Item(itemDAO.getId(),itemDAO.getName()
                ,itemDAO.getPrice(),itemDAO.getCustomerDAO()
                ,itemDAO.getManufacturerDAO());
    }
}
