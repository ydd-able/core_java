package com.coder.random;

import java.util.Random;

/**
 * @author N1357
 * @date 2026/3/9
 * @project core_java
 */
public class Test {
    public static void main(String[] args) {
        Random random = new Random(100);
        int i = random.nextInt(2);//生成随机整数,获取0到2之间的整数。
        System.out.println(i);
        float j = random.nextFloat();//获取一个随机单精度浮点数0到1之间。
        System.out.println(j);

    }
}
