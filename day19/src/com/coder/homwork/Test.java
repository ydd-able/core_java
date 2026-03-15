package com.coder.homwork;

import java.util.ArrayList;
import java.util.List;

/**
 * @author N1357
 * @date 2026/3/15
 * @project core_java
 */
public class Test {
    public static void main(String[] args) {
        List<Passenger> list = new ArrayList<>();
        list.add(new Passenger("李白", "凤凰山站", "万寿路站"));
        list.add(new Passenger("李白", "河滨公园站", "南京工业大学站"));
        for (Passenger passenger : list) {
            System.out.println(passenger.getName() + "乘坐地铁");
            int m = Station.calc(passenger.getStart(), passenger.getEnd());
            if (m == -1) {
                System.out.println("站点录入错误");
            } else {
                if (m <= 3) {
                    System.out.println("一共乘坐" + m + "站" + "收取2元");
                } else if (m <= 5) {
                    System.out.println("一共乘坐" + m + "站" + "收取3元");
                } else if (m <= 7) {
                    System.out.println("一共乘坐" + m + "站" + "收取4元");
                } else {
                    System.out.println("一共乘坐" + m + "站" + "收取5元");
                }
            }

        }
    }
}
