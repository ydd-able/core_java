package com.coder.supermarket;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * @author N1357
 * @since 2026/4/11
 */
public class SaleThread extends Thread{
    private List<Order> orders;
    //从外面把orders传进来。
    public SaleThread(List<Order> orders) {
        this.orders = orders;
        setDaemon(true);
    }
    @Override
    public void run(){
        try{
            Thread.sleep(60000);
            int num = 0;
            BigDecimal money = BigDecimal.ZERO;
            for (Order o : orders) {
                for (Map.Entry<String, Integer> entry : o.getProduct().entrySet()) {
                    num += entry.getValue();
                }
                money = money.add(o.getTotalPrice());
            }
            BigDecimal avg = num==0?BigDecimal.ZERO:money.divide(new BigDecimal(num),2,BigDecimal.ROUND_HALF_UP);
            System.out.println("\n【销售统计】数量："+num+" 总金额："+money+" 均价："+avg);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
