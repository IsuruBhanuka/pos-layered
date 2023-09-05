/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.layered.service.customer;

import java.util.ArrayList;
import pos.layered.dto.CustomerDto;
import pos.layered.service.SuperService;

/**
 *
 * @author BHANUKA
 */
public interface CustomerService extends SuperService {
    String saveCustomer(CustomerDto customerDto) throws Exception;
    String updateCustomer(CustomerDto customerDto) throws Exception;
    String deleteCustomer(String custID) throws Exception;
    ArrayList<CustomerDto> getAllCustomer(String custID) throws Exception;
    CustomerDto searchCustomer(String custID) throws Exception;
}
