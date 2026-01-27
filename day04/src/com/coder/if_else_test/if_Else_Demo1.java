package com.coder.if_else_test;

import java.util.Scanner;

public class if_Else_Demo1 {
    public static void main(String[] args) {
        //猜硬币正反面
        //获取随机数
        double d = Math.random();//0-1之间的小数。开区间
//        System.out.println(d);
        d *= 2;
        int x = (int) d;//生成0或1
        System.out.println("欢迎来到猜硬币游戏");
        System.out.println("请猜正反面0正面  1 反面");
        Scanner scanner = new Scanner(System.in);
        int u = scanner.nextInt();
        if(x==u){
            System.out.println("猜对了");
        }else {
            System.out.println("猜错了");

        }

    }
}
