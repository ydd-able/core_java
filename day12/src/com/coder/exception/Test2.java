package com.coder.exception;
//如果try或catch代码块中， 执行了System.exit(0),就退出虚拟机操作，finally里面的语句不再执行。

public class Test2 {
    public static void main(String[] args) {
        int m = test(10,2);
        System.out.println(m);
    }
    public static int test(int x , int y){
        try{
            int z = x/y;
            return z;
        }catch(ArithmeticException e){
            return 0;
        }finally{//不管是否出现异常，都会被执行。
            System.out.println("关闭连接");

        }
    }
}
