package com.coder.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author N1357
 * @date 2026/3/17
 * @project core_java
 */
//每个流只能进行一次终端操作。
//不存储数据。不会改变数据源。
//具有延迟执行特性，只有调用终端操作，
public class MergeStream {
    public static void main(String[] args) {
       /* Stream<String> stream1 = Arrays.stream(new String[]{"AA","BB","CC"});
        Stream<String> stream2= Arrays.stream(new String[]{"DD","EE","FF"});
        Stream<String> stream3 = Stream.concat(stream1,stream2);
        stream3.forEach(System.out::println);//终端操作。

*/
        List<String> list =Arrays.asList("123","324","21");
        list.stream().filter(x->x.length()==3).forEach(System.out::println);



    }
}
