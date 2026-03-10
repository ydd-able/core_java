package com.coder.math;

/**
 * @author N1357
 * @date 2026/3/8
 * @project core_java
 */
public class CountTri {
    public static void main(String[] args) {
        int count = 0;
        for (int j = 0; j < 20000; j++) {

            double p1 = Math.random();
            double p2 = Math.random();
            double b1 = Math.min(p1, p2);//第一条边
            double b2 = Math.max(p1, p2) - b1;//第二条边
            double b3 = 1 - b1 - b2;
            if (b1 + b2 > b3 && b1 + b3 > b2 && b2 + b3 > b1) {
                count++;
            }
        }
        System.out.println(count);
        System.out.println(Math.round(count * 1.0 / 20000*100)+"%");


    }
}
