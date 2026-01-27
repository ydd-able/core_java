package com.coder.switch_demo;

public class Switch_Demo1 {
    public static void main(String[] args) {
        int x = 1;
        switch (x){
            case 1:
                System.out.println("走1号路线");
                break;
            case 2:
                System.out.println("走2号路线");
                break;
            case 3:
                System.out.println("走3号路线");
                break;
            default:
                System.out.println("另辟蹊径");



        }
        System.out.println("走出来了");
    }
}


//switch(变量){//变量类型 byte short int char String enum
//      case 常量1:default
//      case 常量2:
//      case 常量3:
//      default:
//}