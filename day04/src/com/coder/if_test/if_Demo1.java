package com.coder.if_test;

import java.util.Scanner;

public class if_Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int i = scanner.nextInt();
        boolean b = i % 2 == 0;
        if (b) {
            System.out.println("是偶数");//Ctrl+Alt+L对代码进行格式化。
        } else {
            System.out.println("奇数");
        }
    }
}
