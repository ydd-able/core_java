package com.coder.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author N1357
 * @date 2026/3/20
 * @project core_java
 */
public class TestSortedComparator {
    public static void main(String[] args) {
        List<Emp> list = Arrays.asList(
                new Emp("李白", 22, 10000),
                new Emp("杜甫", 22, 12000),
                new Emp("白居易", 25, 15000));
        //按照年龄进行升序排列。
        /*list.stream().sorted(Comparator.comparingInt(Emp::getAge)).forEach(System.out::println);
        //按照工资进行降序排列。
        list.stream().sorted((o1, o2) -> o2.getAge()-o1.getAge()).forEach(System.out::println);
        //按年龄升序排列，如果年龄相同，再按照工资升序排列。
        list.stream().sorted(Comparator.comparingInt(Emp::getAge).thenComparing(Emp::getSal)).forEach(System.out::println);
        //按年龄升序排列，如果年龄相同，按工资降序排列*/
        list.stream().sorted((o1,o2)->{
            int compare = Integer.compare(o1.getAge(),o2.getAge());
            if(compare==0){
                return Integer.compare(o2.getSal(),o1.getSal());
            }else{
                return compare;
            }

        }).forEach(System.out::println);


    }

}
