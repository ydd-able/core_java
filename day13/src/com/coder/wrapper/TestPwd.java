package com.coder.wrapper;

import java.util.Scanner;

/**
 * @author N1357
 * @date 2026/3/1
 * @project core_java
 */
//要求用户录入密码，密码必须是6-15位长度，并且全部是数字。
public class TestPwd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请录入密码");
        String pwd = scanner.next();
        char[] chars = pwd.toCharArray();//把字符串转为字符数组。
        boolean b = true;
        if (chars.length >= 6 && chars.length <= 15) {
            for (char c : chars) {
                if (!Character.isDigit(c)) {
                    b = false;
                    break;
                }
            }
            System.out.println(b?"有效密码":"无效密码");
        } else {
            System.out.println("密码长度错误");
        }


    }
}
