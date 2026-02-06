package com.coder.extendsTest1;

import com.coder.extendsTest.Car;
//导包只是让编译器找到这个类，不代表可以随意使用他的属性。
//不同包不可以访问默认情况。
//可以在同包和不同包下都可以访问protected
public class BMW extends Car {
        String type;
        public void gps(){
                System.out.println();
        };

}
