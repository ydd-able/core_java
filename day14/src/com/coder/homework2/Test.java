package com.coder.homework2;

import java.util.Scanner;

/**
 * @author N1357
 * @date 2026/3/4
 * @project core_java
 */
public class Test {
    public static void main(String[] args) {
        String[] contents = {"台湾","日本","美国"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入聊天内容");
        String content = scanner.nextLine();
        for (String s : contents) {
            if(content.contains(s)){
               content =  content.replace(s,getStar(s));
            }
        }
        System.out.println("你的聊天内容是：");
        System.out.println(content);

    }
    public static String getStar(String str){
        int length = str.length();
        StringBuffer star = new StringBuffer();
        for (int i = 0; i < length; i++) {
            star.append("*");
        }
        return star.toString();
    }
}
