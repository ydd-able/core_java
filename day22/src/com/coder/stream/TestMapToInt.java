package com.coder.stream;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author N1357
 * @date 2026/3/19
 * @project core_java
 */
public class TestMapToInt {
    public static void main(String[] args) {
       /* maxAndMin();
        sumAndAvg();
        summary();*/
    }
    public static void range(){
        //比区间，1和100都是包含的
        System.out.println(IntStream.rangeClosed(1, 100).sum());
        //左侧是闭区间，右侧是开区间，1包含的，100不包含的。
        int sum = IntStream.range(1,100).sum();
        System.out.println(sum);
        /// boxed将数值转成Stream
        Stream<Integer> stream = IntStream.rangeClosed(1,10).boxed();
        stream.forEach(System.out::println);



    }
    public static void summary(){
        IntSummaryStatistics x = Stream.of("1", "2", "3").mapToInt(Integer::valueOf).summaryStatistics();
        System.out.println(x.getCount());
        System.out.println(x.getMax());
        System.out.println(x.getMin());
        System.out.println(x.getSum());
        System.out.println(x.getAverage());


    }
    public static void sumAndAvg(){
        List<Integer> list = Arrays.asList(12,23,34,43,32,21,9,56,78,21);
        int sum = list.stream().mapToInt(Number::intValue).sum();
        OptionalDouble average = list.stream().mapToInt(Number::intValue).average();
        System.out.println(sum);
        System.out.println(average.getAsDouble());
    }
    public static void maxAndMin(){
        List<Integer> list = Arrays.asList(12,23,34,43,32,21,9,56,78,21);
        OptionalInt max = list.stream().mapToInt(Number::intValue).max();
        OptionalInt min = list.stream().mapToInt(Number::intValue).min();
        System.out.println(max.getAsInt());
        System.out.println(min.getAsInt());


    }

    public static void testToInt1() {
        List<Integer> list = Arrays.asList(12, 23, 34, 45, 56);
        list.stream().mapToInt(x -> x * 10).forEach(System.out::println);

    }
    public static void testToInt(){
        List<String>  list = Arrays.asList("aabc","bbb","werwe","xxx");
        list.stream().mapToInt(String::length).forEach(System.out::println);
    }

}

