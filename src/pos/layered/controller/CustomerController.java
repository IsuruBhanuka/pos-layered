/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.controller;

import pos.layered.dto.CustomerDto;
import pos.layered.service.customer.CustomerService;

/**
 *
 * @author BHANUKA
 */
public class CustomerController {
    
    CustomerService customerService = null;
    
    public String saveCustomer(CustomerDto customerDto) { 
        return customerService.saveCustomer(customerDto);
    }
}
