package com.coder.homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

/**
 * @author N1357
 * @date 2026/3/25
 * @project core_java
 */
public class Login {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        login();
    }
    public static Users login() throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请录入用户名：");
        String name = scanner.next();
        boolean b= Reg.exists(name,"d:/aa/users");
        if(!b){
            System.out.println("用户不存在");
        }else{
            //反序列化
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/aa/users/"+name+".user"));
            Users user = (Users) ois.readObject();
            System.out.println("请输入登陆密码");
            String password = scanner.next();
            if(password.equals(user.getPassword())){
                System.out.println("登录成功，欢迎"+ user.getName());
                return user;
            }else {
                System.out.println("密码错误，登陆失败");
            }
        }
        return null;
    }


}
