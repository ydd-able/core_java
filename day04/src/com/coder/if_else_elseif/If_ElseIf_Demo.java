package com.coder.if_else_elseif;

import java.util.Scanner;

public class If_ElseIf_Demo {
    public static void main(String[] args) {
        //电脑算命 计算星座，计算属相，计算血型。
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择血型 1: A型  2: B型  3: O型  4: AB型");
        int c = scanner.nextInt();
        if (c == 1) {
            System.out.println("你选的是A型血");
        } else if (c == 2) {
            System.out.println("你选的是B型血");

        } else if (c == 3) {
            System.out.println("你选的是O型血");

        } else if (c == 4) {
            System.out.println("你选的是AB型血");

        } else {
            System.out.println("选择血型错误");
        }
    }
}
