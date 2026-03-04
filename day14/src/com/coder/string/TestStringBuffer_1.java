package com.coder.string;

import java.util.Scanner;

/**
 * @author N1357
 * @date 2026/3/3
 * @project core_java
 */
public class TestStringBuffer_1 {
    //判断从键盘接收一行文字，是否是回文。
    public static void main(String[] args) {
        /*StringBuffer buffer = new StringBuffer("abcdef");
        System.out.println(buffer.capacity());//默认16.
        System.out.println(buffer.length());//长度
        buffer.setCharAt(0,'c');//将给定索引位置的字符设置为第二个参数给定的值。
        buffer.reverse();//反转。
        System.out.println(buffer);*/
       /* Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        StringBuffer buffer = new StringBuffer(str);
        buffer.reverse();
        boolean b = str.equals(buffer.toString());
        System.out.println(b);
*//*
        StringBuffer buffer = new StringBuffer("abcdef");
        buffer.delete(0,3);//包含起始位置，不包含结束位置。
        buffer.insert(0,"XXX");//在索引处插入字符串。
        System.out.println(buffer);*/
        StringBuffer buffer = new StringBuffer("1356667777");
        buffer.replace(3,7,"xxxx");
        System.out.println(buffer);

        buffer.deleteCharAt(0);
        System.out.println(buffer);
        



    }
}
