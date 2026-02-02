package com.coder.oop;

public class TestClock {
    public static void main(String[] args) {
        Clock c1 = new Clock();
        c1.setHour(11);
        c1.minute = 30;
        c1.second = 25;
        c1.timeZone = "北京";
        c1.showTime();

        Clock c3 = new Clock();
        c3.setHour(12);
        c3.minute = 30;
        c3.second = 25;
        c3.timeZone = "东京";
        c3.showTime();



    }

}
