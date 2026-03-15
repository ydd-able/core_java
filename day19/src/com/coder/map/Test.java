package com.coder.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author N1357
 * @date 2026/3/13
 * @project core_java
 */
//如果发生重复的key，则后放入的会覆盖先放入的数据。
public class Test {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("语文",80);
        map.put("数学",70);
        map.put("英语",95);
        map.put("地理",80);
        System.out.println(map);
        System.out.println(map.get("语文"));
      /*  Set<String> keys = map.keySet();//把所有的键生成一个集合。
        for (String key : keys) {
            System.out.println(map.get(key));
        }*/
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("政治",80);
        map1.put("物理",90);
        map.putAll(map1);
        Set<Map.Entry<String,Integer>> entries = map.entrySet();//效率更高。
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey()+"\t"+entry.getValue());
        }






    }
}
