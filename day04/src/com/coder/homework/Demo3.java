package com.coder.homework;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请录入第一个数");
        double x = scanner.nextDouble();
        System.out.println("请出入第二个数");
        double y = scanner.nextDouble();
        System.out.println("请出入操作符");
        String op = scanner.next();
        double r = 0.0;
        switch (op) {
            case "+":
                r = x + y;
                break;
            case "-":
                r = x - y;
                break;
            case "*":
                r = x * y;
                break;
            case "/":
                if (y != 0) {
                    r = x / y;
                } else {
                    System.out.println("除数不能为0");
                }
                break;
        }
        System.out.println(x + op + y + "="+r );


    }
}
