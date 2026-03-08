package com.coder.homework2;

import java.util.*;

/**
 * @author N1357
 * @date 2026/3/8
 * @project core_java
 */
public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        List<String> list = new ArrayList<>(1000);
        for (int i = 0; i < 1000; i++) {
            list.add(PhoneUtil.getPhoneNumber(random));
        }
        System.out.println(list);
        List<String> list1 = new ArrayList<>(4);
        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(list.size());//随机找四个下标。
            list1.add(list.get(index));
        }
        System.out.println(list1);
        for(ListIterator<String> iterator = list1.listIterator(); iterator.hasNext();){
            iterator.set(new StringBuffer(iterator.next()).replace(3,7,"****").toString());
        }
        for (String s : list1) {
            System.out.println(s);

        }
    }
}
