package com.coder.homework3;

import java.util.Scanner;

/**
 * @author N1357
 * @date 2026/3/4
 * @project core_java
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请录入邮箱地址，多个地址以分号分割");
        String emailAddr = scanner.next();
        String[] emails = emailAddr.split(";");
        int count = 0;
        int qqcount = 0;
        for (String email : emails) {
            if(validateEmail(email)){
                System.out.println(email+"发送成功");
                count++;
                if(email.endsWith("@qq.com")){
                    qqcount++;
                }
            }else{
                System.out.println(email+"发送失败");
            }
            
        }
        System.out.println("一共成功发送了"+count+"封邮件");
        System.out.println("发给qq邮箱一共"+qqcount+"封邮件");
    }
    public static boolean validateEmail(String email){
        int at = email.indexOf("@");
        int at1 = email.lastIndexOf("@");
        int dot = email.lastIndexOf(".");
        return at!=-1&&at==at1&&dot!=-1&&dot>at1+1&&dot<email.length()-1;
    }
}
