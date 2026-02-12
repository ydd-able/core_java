package com.coder.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请录入摄氏温度：");
        double c = 0;
        try{
            c = scanner.nextDouble();
        }catch(InputMismatchException e){
            System.out.println("录入错误");
            return;
        }
        double h = c*9/5 +32;
        System.out.println("华氏温度为："+h);
    }
}
