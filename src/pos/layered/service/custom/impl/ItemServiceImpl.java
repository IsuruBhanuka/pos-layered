/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.service.custom.impl;

import java.util.ArrayList;
import pos.layered.dao.DaoFactory;
import pos.layered.dao.custom.ItemDao;
import pos.layered.dto.ItemDto;
import pos.layered.entity.ItemEntity;
import pos.layered.service.custom.ItemService;

/**
 *
 * @author BHANUKA
 */
public class ItemServiceImpl implements ItemService{
    ItemDao itemDao = (ItemDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ITEM);

    @Override
    public String saveItem(ItemDto itemDto) throws Exception {
        ItemEntity itemEntity = new ItemEntity(itemDto.getItemCode(), itemDto.getDesc(), itemDto.getPackSize(), 
                itemDto.getUnitPrice(), itemDto.getQtyOnHand());
        
        if (itemDao.add(itemEntity)) {  
            return "Successfully Added";
        } else {
            return "Fail";
        }
    }

    @Override
    public String updateItem(ItemDto itemDto) throws Exception {
        ItemEntity itemEntity = new ItemEntity(itemDto.getItemCode(), itemDto.getDesc(), itemDto.getPackSize(), 
                itemDto.getUnitPrice(), itemDto.getQtyOnHand());
        
        if (itemDao.update(itemEntity)) {  
            return "Successfully Updated";
        } else {
            return "Fail";
        }
    }

    @Override
    public String deleteItem(String itemID) throws Exception {
        if (itemDao.delete(itemID)) {  
            return "Successfully Deleted";
        } else {
            return "Fail";
        }
    }

    @Override
    public ArrayList<ItemDto> getAllItem() throws Exception {
        ArrayList<ItemEntity> itemEntityList = itemDao.getAll();
        ArrayList<ItemDto> itemDtoList = new ArrayList<>();
        
        for(ItemEntity i: itemEntityList) {
            ItemDto item = new ItemDto(i.getItemCode(), i.getDesc(), i.getPackSize(), 
                    i.getUnitPrice(), i.getQtyOnHand());
            itemDtoList.add(item);
        }
        return itemDtoList;
    }

    @Override
    public ItemDto searchItem(String itemID) throws Exception {
        ItemEntity item = itemDao.get(itemID);
        return new ItemDto(item.getItemCode(), item.getDesc(), item.getPackSize(), 
                item.getUnitPrice(), item.getQtyOnHand());
    }

}
