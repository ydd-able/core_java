package com.coder.oop;
//在一个java文件中可以有多个类，但是只能有一个public类，

public class Car {
    //根据对象抽象成类
    String brand;
    String door_num;
    //把对象共同的行为，定义为类的方法。
    public void start(){
        System.out.println("车辆的颜色"+brand);
    }
    void speed(){
        System.out.println("车辆的品牌:"+brand);
    }
    void stop(){
        System.out.println("车辆的车门"+door_num);
    }


}
