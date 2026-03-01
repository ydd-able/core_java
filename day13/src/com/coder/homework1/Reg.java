package com.coder.homework1;

import java.util.Scanner;

/**
 * @author N1357
 * @date 2026/3/2
 * @project core_java
 */
public class Reg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入账号和密码");
        String name = scanner.next();
        boolean b = validateName(name);
        if(!b){
            System.out.println("账号不符合要求");
            return;
        }
        System.out.println("请录入密码");
        String pwd = scanner.next();
        boolean b1 = validatePwd(pwd);
        if(!b1){
            System.out.println("密码不符合要求");
            return;

        }
        System.out.println("注册成功");



    }
    public static boolean validateName(String name){
        char[] chars = name.toCharArray();
        boolean b = true;
        for (char c : chars) {
            if(!Character.isLetter(c)){
                    b = false;
                break;
            }
            
        }
        return b;
    }
    public static boolean validatePwd(String pwd) {
        char[] chars= pwd.toCharArray();
        boolean hasDigit = false;
        boolean hasUpper = false;
        boolean hasLower = false;
        for (char c : chars) {
            if(Character.isDigit(c)){
                hasDigit = true;
            }else if(Character.isUpperCase(c)){
                hasUpper = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            }
        }
        return hasDigit&&hasUpper&&hasLower;

    }


}
