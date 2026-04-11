package com.coder.supermarket;

import java.math.BigDecimal;
import java.util.*;

/**
 * @author N1357
 * @since 2026/4/11
 */
public class CashierService {
    private List<Cashier> cashiers;
    private List<Order> orders;
    private List<Product> products;
    private Cashier current;
    private Scanner sc = new Scanner(System.in);

    public CashierService(List<Cashier> cashiers, List<Order> orders, List<Product> products) {
        this.cashiers = cashiers;
        this.orders = orders;
        this.products = products;
    }
    public boolean login(){
        System.out.println("收银员账号：");
        String account =sc.next();
        System.out.println("密码：");
        String pwd = sc.next();
        for (Cashier c : cashiers) {
            if(c.getAccount().equals(account)&&c.getPassword().equals(pwd)){
                current  = c;
                System.out.println("欢迎 "+c.getName());
                return true;
            }
        }
        System.out.println("登录失败。");
        return false;
    }

    public void addOrder(){
        Map<String,Integer> map = new HashMap<>();
        BigDecimal total = BigDecimal.ZERO;//初始值为0
        while(true){
            System.out.println("商品ID(输入0结束）:");
            String pid = sc.next();
            if("0".equals(pid)) break;
            Product p = products.stream().filter(p1 -> p1.getId().equals(pid)).findFirst().orElse(null);
            if(p==null){
                System.out.println("商品不存在");
                continue;
            }
            System.out.println("数量：");
            int num = sc.nextInt();
            if(p.getCount()<num){
                System.out.println("库存不足：");
                continue;
            }
            p.setCount(p.getCount()-num);
            map.put(pid,num);
            //算订单总价钱
            total = total.add(p.getPrice().multiply(new BigDecimal(num)));

        }

        Order o = new Order();
        o.setId(IDUtil.getId());
        o.setCashierId(current.getId());
        o.setProduct(map);
        o.setTotalPrice(total);
        o.setDate(new Date());
        orders.add(o);
        System.out.println("下单成功 总价是："+total);


    }
    public void showOrders(){
        for(Order o:orders) System.out.println(o.getId()+" "+o.getTotalPrice()+" "+o.getDate());
    }
    // 根据订单ID查询订单
    public void findOrderById() {
        System.out.print("请输入要查询的订单ID：");
        String oid = sc.next();

        // 流式查找：根据ID找订单
        Order order = orders.stream()
                .filter(o -> o.getId().equals(oid))
                .findFirst()
                .orElse(null);

        if (order == null) {
            System.out.println("订单不存在！");
            return;
        }

        // 找到了，打印订单详情
        System.out.println("===== 订单详情 =====");
        System.out.println("订单ID：" + order.getId());
        System.out.println("收银员ID：" + order.getCashierId());
        System.out.println("订单时间：" + order.getDate());
        System.out.println("订单总价：" + order.getTotalPrice());
        System.out.println("购买商品：" + order.getProduct());
    }
    // 根据订单ID删除订单
    public void removeOrderById() {
        System.out.print("请输入要移除的订单ID：");
        String oid = sc.next();

        boolean success = orders.removeIf(o -> o.getId().equals(oid));

        if (success) {
            System.out.println("订单移除成功！");
        } else {
            System.out.println("订单不存在，移除失败！");
        }
    }
}
