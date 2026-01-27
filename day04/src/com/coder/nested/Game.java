package com.coder.nested;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
       //跟系统玩石头剪刀布游戏。
       //用0，1，2 代表石头、剪刀、布
       double d = Math.random();
       int s =(int)(d*3);
        Scanner scanner=new Scanner(System.in);
        System.out.println("英雄好汉请出拳：0 石头  1 剪刀 2 布");
        int u=scanner.nextInt();
        if(u==0){
            System.out.println("我出的是石头");
            if(s==0){
                System.out.println("系统是石头,平");
            } else if (s==1) {
                System.out.println("系统是剪刀，胜");
            }else {
                System.out.println("系统是布，负");
            }
        } else if (u ==1) {
            System.out.println("我出的是剪刀");
            if(s==0){
                System.out.println("系统是石头,负");
            } else if (s==1) {
                System.out.println("系统是剪刀，平");
            }else {
                System.out.println("系统是布，胜");
            }
        } else if (u==2) {
            System.out.println("我出的是布");
            if(s==0){
                System.out.println("系统是石头,胜");
            } else if (s==1) {
                System.out.println("系统是剪刀，负");
            }else {
                System.out.println("系统是布，平");
            }
        }else {
            System.out.println("出拳错误");
        }
    }
}
