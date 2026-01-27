package com.coder.switch_demo;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请录入一个操作数");
        int x = scanner.nextInt();
        System.out.println("请录入第二个操作数");
        int y = scanner.nextInt();
        System.out.println("请录入操作符:+ - * /");
        String op = scanner.next();
        String r="";
        switch (op) {
            case "+":
                r = x + "+" + y + "=" + (x + y);
                break;
            case "-":
                r = x + "-" +y + "=" +(x-y);
                break;
            case "*":
                r = x + "*" +y + "=" +(x*y);
            case "/":
                if (y != 0) {
                    r = x +"/" +y+"="+(x/y);
                } else {
                    System.out.println("除数不能为0");
                }
            default:
                r = "操作符错误";

        }
        System.out.println(r);


    }
}
