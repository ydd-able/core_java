package com.coder.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author N1357
 * @date 2026/3/20
 * @project core_java
 */
public class TestReduceRef {
    public static void main(String[] args) {
        List<Hero> heroList = Arrays.asList(new Hero("亚瑟",10000),
                new Hero("项羽",14000),
                new Hero("小乔",5000));
        //求和操作。
       /* Integer reduce = heroList.stream().reduce(0, ( sum, hero) -> sum+hero.getBlood(),Integer::sum);

        System.out.println(reduce);

*/
        Optional<Integer> reduce = heroList.stream().map(Hero::getBlood).reduce(Integer::sum);
        System.out.println(reduce.get());
        //求最高值
        Integer reduce1 = heroList.stream().map(Hero::getBlood).reduce(0, (a, b) -> a > b ? a : b);
        System.out.println(reduce1);



    }
}
