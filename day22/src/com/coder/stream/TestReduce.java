package com.coder.stream;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author N1357
 * @date 2026/3/20
 * @project core_java
 */
public class TestReduce {
    public static void main(String[] args) {
        //使用mapToInt转成整数据的操作。
       /* int sum = Stream.of(1,2,3,4,5).mapToInt(Integer::intValue).sum();
        System.out.println(sum);*/

        Stream<Integer> stream = Stream.of(1,2,3,4,5);
        //使用规约方式1。
    /*    Optional<Integer> reduce = stream.reduce(Integer::sum);
        System.out.println(reduce.get());
*/
        //使用规约方式2
       /* Integer reduce1  = stream.reduce(0,Integer::sum);
        System.out.println(reduce1);
*/
        //求乘积
      /*  Optional<Integer> reduce  = stream.reduce((x,y)->x*y);
        System.out.println(reduce.get());
        Integer reduce1 = stream.reduce(1,(x,y)->x*y);
        System.out.println(reduce1);*/
        //求最大值。
        Optional<Integer> reduce2 = stream.reduce((x, y) -> x > y ? x : y);
        System.out.println(reduce2.get());


    }
}
