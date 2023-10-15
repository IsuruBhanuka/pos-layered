/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.dto;

/**
 *
 * @author BHANUKA
 */
public class OrderDetailDto {
    
    private String orderID;
    private String itemCode;
    private Integer orderQty;
    private Double discount;

    public OrderDetailDto() {
    }

    public OrderDetailDto(String orderID, String itemCode, Integer orderQty, Double discount) {
        this.orderID = orderID;
        this.itemCode = itemCode;
        this.orderQty = orderQty;
        this.discount = discount;
    }

    /**
     * @return the orderID
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * @param orderID the orderID to set
     */
    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    /**
     * @return the itemCode
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param itemCode the itemCode to set
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    /**
     * @return the orderQty
     */
    public Integer getOrderQty() {
        return orderQty;
    }

    /**
     * @param orderQty the orderQty to set
     */
    public void setOrderQty(Integer orderQty) {
        this.orderQty = orderQty;
    }

    /**
     * @return the discount
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(Double discount) {
        this.discount = discount;
    }
    
    
    
}
