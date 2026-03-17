package com.coder.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author N1357
 * @date 2026/3/17
 * @project core_java
 */
public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(123,2,5,6,74,57,3,8);
        list.sort(Integer::compare);
        System.out.println(list);
        Consumer<String> consumer = X::test;
        X x = new X();
        Supplier<Integer> supplier = x::random;
       /* List<Integer> list = Arrays.asList(12,32,15,6,78,25);
        list.forEach(System.out::println);
*/


    }

}
class X{
    public static void test(String x){
        System.out.println(x);
    }
    public int random(){
        Random r = new Random();
        return r.nextInt();
    }
}
