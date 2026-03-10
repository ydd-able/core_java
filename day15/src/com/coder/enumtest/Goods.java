package com.coder.enumtest;

/**
 * @author N1357
 * @date 2026/3/9
 * @project core_java
 */
public class Goods {
    private Integer id;
    private String name;
    private StatusEnum status;

    public Goods() {
    }

    public Goods(Integer id, String name, StatusEnum status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}
