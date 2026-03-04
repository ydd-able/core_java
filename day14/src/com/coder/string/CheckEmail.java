package com.coder.string;

import java.util.Scanner;

/**
 * @author N1357
 * @date 2026/3/3
 * @project core_java
 */
//要求：1.必须有@。
//2.只能有一个@。
//3.必须有.
//4.点不能挨着@。
//5.点不能是最后一位。

public class CheckEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("请输入email的地址");
            String email = scanner.next();
            boolean b = validateEmail(email);
            if(b){
                System.out.println("这是有效的地址");
                break;
            }
            System.out.println("无效的email地址");
        }

    }
    public static boolean validateEmail(String email){
        int at = email.indexOf("@");
        int at1 = email.lastIndexOf("@");
        int dot = email.lastIndexOf(".");
        return at!=-1&&at==at1&&dot!=-1&&dot>at1+1&&dot<email.length()-1;

    }

}

