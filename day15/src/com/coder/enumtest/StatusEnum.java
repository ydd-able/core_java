package com.coder.enumtest;

/**
 * @author N1357
 * @date 2026/3/10
 * @project core_java
 */
public enum StatusEnum {
    IN(1,"入库"),OUT(2,"出库");
    private String name;
    private int index;
    StatusEnum(int index,String name ){
        this.index = index;
        this.name = name;
    }
    @Override
    public String toString() {
        return index+"_"+name;
    }

}
