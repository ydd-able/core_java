package com.coder.exception;
//使用throws：完成异常抛出，如果一个方法中可能产生异常，当前方法不做处理，在方法异常列表处抛出。
//throws可以接多个异常，中间使用逗号分割。
public class Test3 {
    public static void main(String[] args) {
        try {
            test1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void test1() throws InterruptedException{
        test();
    }
    public static void test() throws InterruptedException{
        String[] str = {"请","看","下","集"};
        for (String s : str) {
            System.out.println(s);
            Thread.sleep(1000);//线程休眠一秒钟；检查型异常。


        }

    }
}
