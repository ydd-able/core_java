package com.coder.string;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @author N1357
 * @date 2026/3/3
 * @project core_java
 */
public class TestRegexMethod {
    public static void main(String[] args) {
        String regex = "1[3578]\\d{9}";
        Scanner scanner = new Scanner(System.in);
        String phone = scanner.next();
        boolean b = phone.matches(regex);//判断给定字符串是否可以匹配给定的正则表达式。
        System.out.println("b= "+b);


     /*   String str = "abc23rta67qqq3453";
        String s1 = str.replaceAll("\\d{2}", "xxx");//按照正则表达式的要求，将给定的值替换满足正则的字符串。
        System.out.println(s1);
        String[] strs = str.split("a");
        for (String s: strs) {
            System.out.println(s);*/


        }






    }

