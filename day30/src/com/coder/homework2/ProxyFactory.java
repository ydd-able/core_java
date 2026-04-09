package com.coder.homework2;

import java.lang.reflect.Proxy;

/**
 * @author N1357
 * @since 2026/4/9
 */
public class ProxyFactory {
    public static Object getProxy(Object target){
        Object object = Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new LoginHandler(target)
        );
        return object;
    }
}
