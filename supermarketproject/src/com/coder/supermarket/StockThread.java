package com.coder.supermarket;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author N1357
 * @since 2026/4/11
 */
public class StockThread extends Thread{
    private List<Product> list;
    public StockThread(List<Product> list){
        this.list = list;
        setDaemon(true);//设置为守护线程，主线程关我也关
    }
    @Override
    public void run(){
        while(true){
            try {
                Thread.sleep(60000);
                int total = 0;
                BigDecimal money = BigDecimal.ZERO;
                for (Product p : list) {
                    total += p.getCount();
                    money = money.add(p.getPrice().multiply(new BigDecimal(p.getCount())));

                }
                BigDecimal avg = total==0?BigDecimal.ZERO:money.divide(new BigDecimal(total),2,BigDecimal.ROUND_HALF_UP);
                System.out.println("\n【库存统计】数量："+total+" 总金额："+money+" 均价："+avg);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

}
