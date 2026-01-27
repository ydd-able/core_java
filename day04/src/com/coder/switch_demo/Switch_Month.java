package com.coder.switch_demo;

import java.util.Scanner;

public class Switch_Month {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("请出入出生月份:");
        int month=scanner.nextInt();
        switch(month){
            case 1:
            case 2:
            case 12:
                System.out.println("冬天");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春天");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏天");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋天");
                break;
            default:
                System.out.println("月份录入错误");
//相同情况可以合并

        }
    }
}
