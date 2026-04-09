package com.coder.homework2;

/**
 * @author N1357
 * @since 2026/4/9
 */
public class Test {
    public static void main(String[] args) {
         FinanceService financeService = (FinanceService) ProxyFactory.getProxy(new FinanceServiceImpl());

         UserService userService = (UserService) ProxyFactory.getProxy(new UserServiceImpl());

         financeService.addMoney(100);
         financeService.substractMoney(200);

         userService.saveUser();
         userService.deleteUser();
    }
}
