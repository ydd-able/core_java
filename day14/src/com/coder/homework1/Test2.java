package com.coder.homework1;

import java.util.Scanner;

/**
 * @author N1357
 * @date 2026/3/4
 * @project core_java
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入身份证号码:");
        String id = scanner.next();
        if(validate(id)){
            String s = showNumber(id);
            System.out.println("身份证号码:"+s);
            System.out.println(getGender(id));
        }else{
            System.out.println("无效身份证");
        }
    }
    public static boolean validate(String id){
        String regex = "\\d{17}[\\d{1}X]";
        return id.matches(regex);
    }
    public static String showNumber(String id){
        StringBuffer buffer = new StringBuffer(id);
        buffer.replace(6,14,"********");
        return buffer.toString();
    }
    public static String getGender(String id){
        char c = id.charAt(id.length()-2);
        int x = Integer.parseInt(String.valueOf(c));
        return x%2==0?"女":"先生";
    }

}
