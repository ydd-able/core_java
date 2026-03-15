package com.coder.homework3;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author N1357
 * @date 2026/3/15
 * @project core_java
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setNo("SF100234789");//订单号
        order.setDefaultProcess(getDefaultProcess());

        Customer customer = new Customer();
        customer.search(order);

        Com com = new Com();
        com.doProcess(order);

        customer.search(order);
        com.doProcess(order);
        customer.search(order);
        com.doProcess(order);
        customer.search(order);
        com.doProcess(order);
        customer.search(order);
        com.doProcess(order);
        customer.search(order);
        com.doProcess(order);
        customer.search(order);





    }
    public static Queue<String> getDefaultProcess(){
        Queue<String> queue = new ArrayDeque<>();
        queue.offer("货品已出库");
        queue.offer("上门收取快递");
        queue.offer("送到快递分包中心");
        queue.offer("货物运输途中");
        queue.offer("货物已由快递员送货到小区分配中心");
        queue.offer("货物已被取走");
        queue.offer("已全部完成");
        return queue;
    }
}
