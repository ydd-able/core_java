package com.coder.lambda4;

import java.util.function.Consumer;

/**
 * @author N1357
 * @date 2026/3/16
 * @project core_java
 */
public class TestConsumer {
    public static void main(String[] args) {
        testConsumer();
    }
    public static void testConsumer(){
        Consumer<Integer> c1 = money-> System.out.println("客户花"+money+"元，买了游戏装备");
        buy(1000,c1);

    }
    public static void buy(int money, Consumer<Integer> consumer){
        consumer.accept(money);
    }
}
