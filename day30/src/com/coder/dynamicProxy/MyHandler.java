package com.coder.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author N1357
 * @since 2026/4/9
 */
//表示你这个代理要做什么，怎么做
public class MyHandler implements InvocationHandler {
    private Object object;

    public MyHandler(Object object) {
        this.object = object;
    }

    /**
     * @param proxy  the proxy instance that the method was invoked on
     * @param method the {@code Method} instance corresponding to
     *               the interface method invoked on the proxy instance.  The declaring
     *               class of the {@code Method} object will be the interface that
     *               the method was declared in, which may be a superinterface of the
     *               proxy interface that the proxy class inherits the method through.
     * @param args   an array of objects containing the values of the
     *               arguments passed in the method invocation on the proxy instance,
     *               or {@code null} if interface method takes no arguments.
     *               Arguments of primitive types are wrapped in instances of the
     *               appropriate primitive wrapper class, such as
     *               {@code java.lang.Integer} or {@code java.lang.Boolean}.
     * @return 调用方法之后返回的结果。
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        boolean b = checkPermission();
        if (b) {
            Object result = method.invoke(object, args);
            log();
            return result;
        }
        return null;
    }

    private boolean checkPermission() {
        System.out.println("校验用户权限");
        return true;
    }

    private void log() {
        System.out.println("处理日志");
    }
}
