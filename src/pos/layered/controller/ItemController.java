/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.controller;

import java.util.ArrayList;
import pos.layered.dto.ItemDto;
import pos.layered.service.ServiceFactory;
import pos.layered.service.custom.ItemService;

/**
 *
 * @author BHANUKA
 */
public class ItemController {
    private ItemService itemService = (ItemService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ITEM);
    
    public String saveItem(ItemDto itemDto) throws Exception { 
        return itemService.saveItem(itemDto);
    }
    
    public ArrayList<ItemDto> getAllItem() throws Exception {
        return itemService.getAllItem();
    }
    
    public ItemDto searchItem(String ID) throws Exception {
        return itemService.searchItem(ID);
    }
    
    public String updateItem(ItemDto itemDto) throws Exception {
        return itemService.updateItem(itemDto);
    }
    
    public String deleteItem(String ID) throws Exception {
        return itemService.deleteItem(ID);
    }
}
