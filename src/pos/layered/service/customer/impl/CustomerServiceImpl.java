/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.service.customer.impl;

import java.util.ArrayList;
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

    @Override
    public String saveCustomer(CustomerDto customerDto) throws Exception {
        CustomerEntity customerEntity = new CustomerEntity(
                customerDto.getId(), customerDto.getTitle(), customerDto.getName(), 
                customerDto.getAdress(), customerDto.getDob(), customerDto.getSalary(), 
                customerDto.getCity(), customerDto.getProvince(), customerDto.getZip());
        
        if (customerDao.add(customerEntity)) {  
            return "Successfully Added";
        } else {
            return "Fail";
        }
    }  

    @Override
    public String updateCustomer(CustomerDto customerDto) throws Exception {
        CustomerEntity customerEntity = new CustomerEntity(
                customerDto.getId(), customerDto.getTitle(), customerDto.getName(), 
                customerDto.getAdress(), customerDto.getDob(), customerDto.getSalary(), 
                customerDto.getCity(), customerDto.getProvince(), customerDto.getZip());
        
        if (customerDao.update(customerEntity)) {  
            return "Successfully Updated";
        } else {
            return "Fail";
        }
    }

    @Override
    public String deleteCustomer(String custID) throws Exception {
        if (customerDao.delete(custID)) {  
            return "Successfully Deleted";
        } else {
            return "Fail";
        }
    }

    @Override
    public ArrayList<CustomerDto> getAllCustomer(String custID) throws Exception {
        ArrayList<CustomerEntity> customerEntityList = customerDao.getAll();
        ArrayList<CustomerDto> customerDtoList = new ArrayList<>();
        for(CustomerEntity customerEntity: customerEntityList) {
            CustomerDto customerDto = new CustomerDto(customerEntity.getCustID(), customerEntity.getCustTitle(), customerEntity.getCustName(), 
                customerEntity.getCustAddress(), customerEntity.getDob(), customerEntity.getSalary(), 
                customerEntity.getCity(), customerEntity.getProvince(), customerEntity.getPostalCode());
            customerDtoList.add(customerDto);
        }
        return customerDtoList;
    }

    @Override
    public CustomerDto searchCustomer(String custID) throws Exception {
        CustomerEntity customerEntity = customerDao.get(custID);
        return new CustomerDto(customerEntity.getCustID(), customerEntity.getCustTitle(), customerEntity.getCustName(), 
                customerEntity.getCustAddress(), customerEntity.getDob(), customerEntity.getSalary(), 
                customerEntity.getCity(), customerEntity.getProvince(), customerEntity.getPostalCode());
    }
}
