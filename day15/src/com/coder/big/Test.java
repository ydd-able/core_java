package com.coder.big;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/**
 * @author N1357
 * @date 2026/3/9
 * @project core_java
 */
public class Test {
    public static void main(String[] args) {
        /*BigInteger b = new BigInteger("123");
        BigInteger b1 = new BigInteger("2");
       *//* BigInteger r = b.add(b1);//加法
        System.out.println(r);*//*
        BigInteger subtract = b.subtract(b1);//减法。
        BigInteger multiply = b.multiply(b1);
        BigInteger divide = b.divide(b1);
        System.out.println(divide);//只保留整数。
        */

        BigDecimal d = new BigDecimal(5);
        BigDecimal d1 = new BigDecimal(2);
        BigDecimal divide = d.divide(d1, RoundingMode.UP);
        System.out.println();


    }

}
