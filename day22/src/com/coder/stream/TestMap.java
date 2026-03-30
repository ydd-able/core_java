package com.coder.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author N1357
 * @date 2026/3/19
 * @project core_java
 */
public class TestMap {
    public static void main(String[] args) {
       /* List<Double> list = Arrays.asList(3.145,4.556,5.432,6.738);
        list.stream().map(TestMap::k2).forEach(System.out::println);
        getHeroName();*/
        addBlood();



    }
    public static double k2(double x){
        return (int)((x*100)+0.5)/100D;//四舍五入，保留两位小数。

    }
    public static void getHeroName(){
        List<Hero> heroList = Arrays.asList(new Hero("亚瑟",10000),
                new Hero("项羽",14000),
                new Hero("小乔",5000));
        heroList.stream().map(Hero::getName).forEach(System.out::println);
    }
    public static void addBlood(){
        List<Hero> heroList = Arrays.asList(new Hero("亚瑟",10000),
                new Hero("项羽",14000),
                new Hero ("小乔",5000));

        heroList.stream().map(h->{h.setBlood(h.getBlood()+1000);return h;})
                .forEach(System.out::println);//会改变原有数据。
        heroList.stream().map(h->{
            Hero hero  = new Hero(h.getName(),h.getBlood());//创建一个新的对象，原有的不会改变。
            hero.setBlood(hero.getBlood()+1000);
            return hero;
        });
        System.out.println("-------------------");


    }
}
