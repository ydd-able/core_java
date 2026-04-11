package com.coder.supermarket;

import java.math.BigDecimal;

/**
 * @author N1357
 * @since 2026/4/10
 */
public class Product {
    private String id;
    private String name;
    private BigDecimal price;
    private int count;
    private String typeId;

    public Product() {
    }

    public Product(String id, String name, BigDecimal price, int count, String typeId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
        this.typeId = typeId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }
}
