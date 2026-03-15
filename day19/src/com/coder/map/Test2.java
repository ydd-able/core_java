package com.coder.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author N1357
 * @date 2026/3/13
 * @project core_java
 */
//从键盘接收一行字符串，统计每个字符串出现的次数。
//
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一行字符串");
        String str = scanner.next();
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        Set<Map.Entry<Character,Integer>> entries= map.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            System.out.println(entry.getKey()+"出现"+entry.getValue()+"次");

        }

    }
}
