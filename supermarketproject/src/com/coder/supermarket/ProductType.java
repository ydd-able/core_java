package com.coder.supermarket;

/**
 * @author N1357
 * @since 2026/4/10
 */
public class ProductType {
    private String id;
    private String name;
    public ProductType(){};

    public ProductType(String id, String name) {
        this.id = id;
        this.name = name;
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
}
