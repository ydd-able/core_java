package com.coder.nested;

import java.util.Scanner;

public class if_Nested_Demo {
    public static void main(String[] args) {
        //三个数比较大小
        Scanner scanner = new Scanner(System.in);
        System.out.println("请录入三个数字比较大小");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println(a + "最大");
            } else {
                System.out.println(c + "最大");
            }
        } else {
            if (b > c) {
                System.out.println(b + "最大");
            } else {
                System.out.println(c + "最大");
            }
        }
    }
}
