package com.coder.homework2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * @author N1357
 * @date 2026/3/10
 * @project core_java
 */
//3、从键盘接收一行具有数字值的字符串，
//多个数字之间用逗号隔开，对所有数字扩大10倍，并按四舍五入保留2位小数
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("请录入数字:");
        String str = scanner.next();
        String[] strs = str.split(",");
        for (String s : strs) {
            BigDecimal decimal = new BigDecimal(s);
            BigDecimal x = decimal.multiply(new BigDecimal("10")).
                    divide(new BigDecimal("1"), 2, RoundingMode.HALF_UP);
            System.out.println(x);

        }
        



    }
}
