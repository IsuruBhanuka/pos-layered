/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.controller;

import java.util.ArrayList;
import pos.layered.dto.CustomerDto;
import pos.layered.service.ServiceFactory;
import pos.layered.service.customer.CustomerService;

/**
 *
 * @author BHANUKA
 */
public class CustomerController {
    
    private CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);
    
    public String saveCustomer(CustomerDto customerDto) throws Exception { 
        return customerService.saveCustomer(customerDto);
    }
    
    public ArrayList<CustomerDto> displayAllCustomers() throws Exception {
        return customerService.getAllCustomer();
    }
    
    public CustomerDto getCustomer(String ID) throws Exception {
        return customerService.searchCustomer(ID);
    }
    
    public String updateCustomer(CustomerDto customerDto) throws Exception {
        return customerService.updateCustomer(customerDto);
    }
    
    public String deleteCustomer(String ID) throws Exception {
        return customerService.deleteCustomer(ID);
    }
}
 