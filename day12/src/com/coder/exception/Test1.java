package com.coder.exception;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个数字");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int[] m = new int[10];

        try{
            int z = x/y;
            System.out.println(z);
            m[10] = 100;
            System.out.println(m[10]);
        }catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("出现错误："+e.getMessage());
        }
        /*catch(ArithmeticException e){
            System.out.println("除数不能为0");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("数组下标越界");
        }*/
        System.out.println(" ");


    }
}
