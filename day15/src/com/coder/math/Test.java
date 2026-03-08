package com.coder.math;

/**
 * @author N1357
 * @date 2026/3/4
 * @project core_java
 */
//Math中的方法都是静态方法，可以通过类名.方法名调用。

public class Test {
    public static void main(String[] args) {

        System.out.println(Math.PI*10*10);
        System.out.println(Math.abs(-5));//求绝对值
        double ceil = Math.ceil(3.5);//求大于等于给定值的整数，以double类型返回。
        System.out.println(ceil);
        double floor = Math.floor(3.1);//求小于等于给定值的整数，以double类型返回。
        System.out.println(floor);
        double d = 3.5131;
        long round = Math.round(d);
        System.out.println(round);
        double sqrt = Math.sqrt(2);
        System.out.println(sqrt);//获取平方根，不可以传负数。
        double pow = Math.pow(5,3);//求5的三次方。
        double b = Math.atan(1);
        System.out.println(b);










    }
}
