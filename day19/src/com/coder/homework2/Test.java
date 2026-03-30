package com.coder.homework2;

import java.util.List;

/**
 * @author N1357
 * @date 2026/3/15
 * @project core_java
 */
public class Test {
    public static void main(String[] args) {
        List<Student> list = DataBase.getList();
        //获取每名学生的总成绩。
        /*Map<String, Double> m = CountUtil.sum(list);
        for (Map.Entry<String, Double> entry : m.entrySet()) {
            System.out.println(entry.getKey()+"\t"+entry.getValue());
        }*/

        //统计每名学生的平均成绩。
        /*Map<String, Double> m = CountUtil.avg(list);
        for (Map.Entry<String, Double> entry : m.entrySet()) {
            System.out.println(entry.getKey()+"\t"+entry.getValue());
        }*/

        //求指定科目的平均成绩。
       /* double c = CountUtil.sum(list,"语文");
        System.out.println("c = " + c);*/

        //统计挂科人数。
        /*int i = CountUtil.countNoPass(list);
        System.out.println("i = " + i);*/

        //所有不及格分数提升10%，再次统计挂科人数
        /*CountUtil.add10(list);
        int i = CountUtil.countNoPass(list);
        System.out.println("i = " + i);
*/
        //5）显示所有学生的成绩表
        CountUtil.print(list);

    }
}
