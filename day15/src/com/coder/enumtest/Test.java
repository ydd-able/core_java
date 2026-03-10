package com.coder.enumtest;

import java.util.Random;

/**
 * @author N1357
 * @date 2026/3/10
 * @project core_java
 */
//enum:列举，从给定的值中列举，通常是有固定值，只能从固定值中做选择。
public class Test {
    public static void main(String[] args) {
        Goods goods = new Goods(1, "手机", StatusEnum.IN);
       /* StatusEnum[] values = StatusEnum.values();
        for (StatusEnum value : values) {
            System.out.println(value);
        }
        int x = new Random().nextInt(2);
        switch (values[x]){
            case IN:
                System.out.println("入库状态");
                break;
            case OUT:
                System.out.println("出库状态");
                break;
        }*/
        System.out.println(goods);//打印tostring方法。

    }
}
