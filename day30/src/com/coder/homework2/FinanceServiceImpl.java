package com.coder.homework2;

/**
 * @author N1357
 * @since 2026/4/9
 */
public class FinanceServiceImpl implements FinanceService {


    @Override
    public void addMoney(double money) {
        System.out.println("财务增加金额："+money);
    }

    @Override
    public void substractMoney(double money) {
        System.out.println("财务减少金额："+money);

    }
}
