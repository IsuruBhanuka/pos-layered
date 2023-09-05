/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.dao.customer.impl;

import java.util.ArrayList;
import pos.layered.dao.CrudUtil;
import pos.layered.dao.customer.CustomerDao;
import pos.layered.entity.CustomerEntity;
import java.sql.ResultSet;

/**
 *
 * @author BHANUKA
 */
public class CustomerDaoImpl implements CustomerDao {

    @Override
    public boolean add(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Customer VALUES(?,?,?,?,?,?,?,?,?)", 
                t.getCustID(), t.getCustTitle(), t.getCustName(), 
                t.getDob(), t.getSalary(), t.getCustAddress(), 
                t.getCity(), t.getProvince(), t.getPostalCode());
    }

    @Override
    public boolean update(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE Customer SET CustTitle = ?, CustName = ?, DOB = ?, salary = ?, CustAddress = ?, City = ?, Province = ?, PostalCode = ? WHERE CustID = ?", 
                t.getCustTitle(), t.getCustName(), t.getDob(), 
                t.getSalary(), t.getCustAddress(), t.getCity(), 
                t.getProvince(), t.getPostalCode(),t.getCustID());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM Customer WHERE CustID = ?", id);
    }

    @Override
    public CustomerEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM customer WHERE CustID = ?", id);
        return new CustomerEntity( rst.getString(1), rst.getString(2), rst.getString(3), 
                    rst.getString(4), rst.getString(5), rst.getDouble(6), 
                    rst.getString(7), rst.getString(8), rst.getString(9));
    }

    @Override
    public ArrayList<CustomerEntity> getAll() throws Exception {
        ArrayList<CustomerEntity> customers = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM customer", "");
        
        while (rst.next()) {
            CustomerEntity customerEntity = new CustomerEntity(
                    rst.getString(1), rst.getString(2), rst.getString(3), 
                    rst.getString(4), rst.getString(5), rst.getDouble(6), 
                    rst.getString(7), rst.getString(8), rst.getString(9));
            customers.add(customerEntity);
        }
        return customers;
    }   
}
