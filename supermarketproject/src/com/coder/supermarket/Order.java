package com.coder.supermarket;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

/**
 * @author N1357
 * @since 2026/4/10
 */
public class Order {
    private String id;
    private String cashierId;
    private Map<String,Integer> product;
    private BigDecimal totalPrice;
    private Date date;

    public Order() {
    }

    public Order(String id, String cashierId, Map<String, Integer> product, BigDecimal totalPrice, Date date) {
        this.id = id;
        this.cashierId = cashierId;
        this.product = product;
        this.totalPrice = totalPrice;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCashierId() {
        return cashierId;
    }

    public void setCashierId(String cashierId) {
        this.cashierId = cashierId;
    }

    public Map<String, Integer> getProduct() {
        return product;
    }

    public void setProduct(Map<String, Integer> product) {
        this.product = product;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
