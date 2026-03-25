package com.coder.homework;

import java.io.*;
import java.util.Scanner;

/**
 * @author N1357
 * @date 2026/3/25
 * @project core_java
 */
public class Reg {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请录入用户名：");
        String name = scanner.next();
        boolean b = exists(name, "d:/aa/users");
        if(b){
            System.out.println("用户名已存在，注册失败");
        }else{
            System.out.println("请录入密码");
            String password =  scanner.next();
            Users user = new Users();
            user.setName(name);
            user.setPassword(password);
            File dir = new File("d:/aa/users");
            File file = new File(dir,name+".user");
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(user);
            oos.close();


        }


    }

    public static boolean exists(String name, String dir) {
        File dirFile = new File(dir);
        dirFile.mkdirs();
        File[] files = dirFile.listFiles();
        for (File file : files) {
            String fileName = file.getName();
            fileName = fileName.substring(0, fileName.lastIndexOf("."));
            if (name.equals(fileName)){
                return true;
            }
        }
        return false;
    }
}
