/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.layered.service.custom;

import java.util.ArrayList;
import pos.layered.dto.ItemDto;
import pos.layered.service.SuperService;

/**
 *
 * @author BHANUKA
 */
public interface ItemService extends SuperService{
    String saveItem(ItemDto itemDto) throws Exception;
    String updateItem(ItemDto itemDto) throws Exception;
    String deleteItem(String itemID) throws Exception;
    ArrayList<ItemDto> getAllItem() throws Exception;
    ItemDto searchItem(String itemID) throws Exception;
}
