package com.coder.homework1;

import java.util.Scanner;

/**
 * @author N1357
 * @date 2026/3/4
 * @project core_java
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入身份证号码：");
        String id = scanner.next();
        int len = id.length();
        if(len!=18){
            System.out.println("身份证号码长度错误");
        }else{
            boolean b = true;
            for (int i = 0; i < id.length()-1; i++) {
                char c = id.charAt(i);
                if(!Character.isDigit(c)){
                    b = false;
                    break;
                }
            }
            if(b){
                char c = id.charAt(id.length()-1);
                if(c=='X'||Character.isDigit(c)){
                    System.out.println("有效身份证");
                }else{
                    System.out.println("最后一位错误");
                }
            }else{
                System.out.println("前17位有非数字");
            }


        }
    }
}
