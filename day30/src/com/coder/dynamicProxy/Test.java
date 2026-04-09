package com.coder.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * @author N1357
 * @since 2026/4/9
 */
public class Test {
    public static void main(String[] args) {
     /*   UserService service = new UserServiceImpl();
        service.saveUser();
        service.deleteUser();*/
        UserServiceImpl userService = new UserServiceImpl();

        Object object = Proxy.newProxyInstance(userService.getClass().getClassLoader(), userService.getClass().getInterfaces(),
                new MyHandler(userService));
        UserService service = (UserService)object;
        service.saveUser();
        service.deleteUser();



    }
}
