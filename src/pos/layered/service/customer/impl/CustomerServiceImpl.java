/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.service.customer.impl;

import pos.layered.dao.DaoFactory;
import pos.layered.dao.customer.CustomerDao;
import pos.layered.dto.CustomerDto;
import pos.layered.entity.CustomerEntity;
import pos.layered.service.customer.CustomerService;

/**
 *
 * @author BHANUKA
 */
public class CustomerServiceImpl implements CustomerService {
    
    CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CUSTOMER);

 
    public String saveCustomer(CustomerDto customerDto) throws Exception {
        CustomerEntity customerEntity = new CustomerEntity(
                customerDto.getId(), 
                customerDto.getTitle(), 
                customerDto.getName(), 
                customerDto.getAdress(), 
                customerDto.getDob(), 
                customerDto.getSalary(), 
                customerDto.getCity(), 
                customerDto.getProvince(), 
                customerDto.getZip());
        
        if (customerDao.saveCustomer(customerEntity)) {
            return "Successfully Added";
        } else {
            return "Fail";
        }
    }
    
}
