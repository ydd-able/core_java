package com.coder.homework;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请录入一个数字");
        int x = scanner.nextInt();
        if (x % 3 == 0 && x % 5 == 0) {
            System.out.println("乒乓");
        } else if (x % 5 == 0) {
            System.out.println("乓");

        } else if (x % 3 == 0) {
            System.out.println("乒");

        } else {
            System.out.println(x);

        }
    }
}
