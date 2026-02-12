package com.coder.homework;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        String[] ids = {"22233423", "2344252", "1231243255"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请放身份证");
        String id = scanner.next();
        boolean b = false;
        for (String s : ids) {
            if (s.equals(id)) {
                try {
                    b = true;
                    throw new IdException(s + "身份证号码产生异常，可能是逃犯");
                }catch(IdException e){
                    e.printStackTrace();
                }
            }
        }
        if(!b){
            System.out.println("办理入住成功");
        }

    }
}
