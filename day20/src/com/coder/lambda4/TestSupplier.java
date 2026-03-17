package com.coder.lambda4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

/**
 * @author N1357
 * @date 2026/3/16
 * @project core_java
 */
public class TestSupplier {
    public static void main(String[] args) {
       /* Supplier<String> s1 = ()->{
            Random random = new Random();
            String code = "";
            for (int i = 0 ;i<4;i++) {
                int x = random.nextInt(10);
                code+=x;
            }
            return code;
        };
        List<String> codeList = getCode(10,s1);
        System.out.println(codeList);
        */
        Supplier<String> s1 = ()->{
            Random random = new Random();
            String z = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String code = "";
            for (int i = 0 ;i<4;i++) {
                int index =(int)(Math.random()*z.length());
                code+=z.charAt(index);
            }
            return code;
        };
        List<String> codeList = getCode(10,s1);
        System.out.println(codeList);
    }
    public static List<String> getCode(int x, Supplier<String> supplier){
        List<String> list = new ArrayList<>(x);
        for (int i = 0; i < x; i++) {
            list.add(supplier.get());
        }
        return list;

    }
}
