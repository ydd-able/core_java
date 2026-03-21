package com.coder.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author N1357
 * @date 2026/3/21
 * @project core_java
 */
public class TestGroupingBy {
    public static void main(String[] args) {
        List<Employer> list = Arrays.asList(
                new Employer("李白",25,"研发部","男"),
                new Employer("杜甫",28,"研发部","女"),
                new Employer("白居易",35,"测试部","男"),
                new Employer("李商隐",28,"测试部","女")
        );
        //按照部门分组。
        Map<String, List<Employer>> map1 = list.stream()
                .collect(Collectors.groupingBy(Employer::getDept));
        map1.forEach((k,v)-> {
            System.out.println("部门名称:" + k);
            v.forEach(System.out::println);
        });

        //先按性别分组，再按部门进行分组。
        Map<String, Map<String, List<Employer>>> collect = list.stream().collect(Collectors.groupingBy(Employer::getGender, Collectors.groupingBy(Employer::getDept)));
        collect.forEach((k,v)->{
            System.out.println("性别"+k);
            v.forEach((k1,v1)->{
                System.out.println("部门名称"+k1);
                v1.forEach(System.out::println);
            });
        });


    }
}
