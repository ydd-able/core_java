package com.coder.stream;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author N1357
 * @date 2026/3/21
 * @project core_java
 */
public class TestCollectCal {
    public static void main(String[] args) {
        List<Emp> list = Arrays.asList(
                new Emp("李白", 22, 12000),
                new Emp("杜甫", 28, 12000),
                new Emp("白居易", 25, 11000),
                new Emp("李贺", 24, 8000));
        Optional<Emp> max = list.stream().filter(e -> e.getSal() >= 10000).max(Comparator.comparingInt(Emp::getSal));
        System.out.println(max);
        //数值流求和
        int sum = list.stream().mapToInt(Emp::getSal).sum();
        //两种求均值。
        Double collect = list.stream().collect(Collectors.averagingDouble(Emp::getSal));
        OptionalDouble average = list.stream().mapToInt(Emp::getSal).average();
        //一次性获取所有信息。
        IntSummaryStatistics collect1 = list.stream().collect(Collectors.summarizingInt(Emp::getAge));
        System.out.println(collect1.getMax());



       /* //统计人数
        Long l = list.stream().filter(e -> e.getName().startsWith("李"))
                .count();
        System.out.println(l);
    }*/
    }
}