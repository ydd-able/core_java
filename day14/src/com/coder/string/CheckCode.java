package com.coder.string;

import java.util.Scanner;

/**
 * @author N1357
 * @date 2026/3/3
 * @project core_java
 */
//案例：生成从a-zA-Z0-9之间，获取4个值作为一个验证码，从键盘接收验证码，做不区分大小写比较。
public class CheckCode {
    public static void main(String[] args) {
        String code = getCode(4);
        System.out.println(code);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请录入验证码");
        String userInput = scanner.next();
        System.out.println(userInput.equalsIgnoreCase(code)?"验证码录入正确":"验证码录入错误");
    }
    public static String getCode(int length){
        String z = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String code = "";
        for(int i = 1;i<=length;i++){
            int x = (int)(Math.random()*z.length());
            code+=z.charAt(x);
        }
        return code;
    }
}
