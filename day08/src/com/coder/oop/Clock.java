package com.coder.oop;

public class Clock {
    //把属性私有。private(访问修饰符）,只能在当前类中访问
    private int hour;
    int minute;
    int second;
    String timeZone;
    public void setHour(int hour){
        //出现了两个hour,一个是成员变量，一个是局部变量。
        //使用this关键字来区分，加this的表示是成员变量。
        this.hour = hour;

    }

    public void showTime(){
        System.out.println("现在是"+timeZone + "时间:"+ hour + ":" + minute + ":" + second);

    }
}
