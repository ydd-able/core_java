package com.coder.homwork;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author N1357
 * @date 2026/3/15
 * @project core_java
 */
public class Station {
    private static Map<Integer,String> stationMap;
    static{
        stationMap = new TreeMap<>();
        stationMap.put(1,"沿山大道站");
        stationMap.put(2,"凤凰山站");
        stationMap.put(3,"文德路站");
        stationMap.put(4,"河滨公园站");
        stationMap.put(5,"康安路站");
        stationMap.put(6,"南京工业大学站");
        stationMap.put(7,"兴隆路站");
        stationMap.put(8,"万寿路站");
        stationMap.put(9,"国际健康中心站");
    }

    /**
     * 根据站点名称返回索引。
     */

    public static void showStation(){
        for(Map.Entry<Integer, String> entry : stationMap.entrySet()){
            System.out.println(entry.getKey()+"\t"+entry.getValue());
        }
    }
    public static Integer getIndex(String value){
        if(stationMap.containsValue(value)){
            for(Map.Entry<Integer, String> entry : stationMap.entrySet()){
                if(value.equals(entry.getValue())){
                    return entry.getKey();
                }
            }
        }
        return -1;
    }
    public static int calc(String start, String end){
        Integer startIndex = getIndex(start);
        Integer endIndex = getIndex(end);
        if(startIndex==-1||endIndex==-1){
            return -1;
        }else{
            return Math.abs(endIndex-startIndex);
        }
    }

}
