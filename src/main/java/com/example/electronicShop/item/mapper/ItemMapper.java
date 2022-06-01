package com.example.electronicShop.item.mapper;

import com.example.electronicShop.item.dao.Item;
import com.example.electronicShop.item.dto.ItemDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ItemMapper {

    ItemDTO itemToItemDTO(Item item);
    Item itemDTOToItem(ItemDTO itemDTO);
}
