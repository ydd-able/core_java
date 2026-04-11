package com.coder.supermarket;

import java.util.Properties;
import java.util.Scanner;

/**
 * @author N1357
 * @since 2026/4/10
 */
//验证用户名和密码
public class UserService {
    public boolean login(){
        Scanner sc = new Scanner(System.in);
        System.out.println("账号:");
        String userId= sc.next();
        System.out.println("密码");
        String pwd = sc.next();
        String[] admin = PropertiesUtil.getAdmin();
        return admin[0].equals(userId)&&admin[1].equals(pwd);

    }
}
