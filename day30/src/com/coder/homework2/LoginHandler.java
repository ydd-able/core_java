package com.coder.homework2;

import java.io.FileWriter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author N1357
 * @since 2026/4/9
 */
public class LoginHandler implements InvocationHandler {
    private Object target;

    public LoginHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        //读取注解里的正确账号密码
        Account annotation = LoginUser.class.getAnnotation(Account.class);
        String name = annotation.username();
        String pwd = annotation.password();


        //键盘输入登录
        System.out.println("请输入用户名");
        String username = sc.next();
        System.out.println("请输入密码");
        String password = sc.next();

        //登录校验
        if (!username.equals(name)||!password.equals(pwd)){
            System.out.println("登录失败");
            return null;
        }

        System.out.println("登录成功");

        //登录成功后，执行方法
        Object result = method.invoke(target, args);
        if(target instanceof FinanceServiceImpl){
            writeLog(target.getClass().getName(),method.getName(),username);
        }


        return result;

    }
   private void writeLog(String className,String methodName,String user){
        try( FileWriter fw = new FileWriter("log.txt",true)){
            String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            String log = "日志用户："+user+",时间:"+time+",类名："+className+",方法："+ methodName +"\n";
            fw.write(log);
            System.out.println("日志已经写入log.txt");
        }catch (Exception e){
            e.printStackTrace();
        }


    }


}
