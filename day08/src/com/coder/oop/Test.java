package com.coder.oop;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car);
        car.start();//调用方法。
        //操作对象都是通过引用完成
        //在栈内存中保存对象的引用。
        //对象的属性保存在堆内存中
    }
}
