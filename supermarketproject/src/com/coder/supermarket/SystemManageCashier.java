package com.coder.supermarket;

import org.w3c.dom.ls.LSOutput;

import java.util.Date;
import java.util.List;
import java.util.Scanner;



/**
 * @author N1357
 * @since 2026/4/10
 */
public class SystemManageCashier {
    //只在本类中被访问
    private List<Cashier> cashiers;
    private List<Log> logs;
    private Scanner sc = new Scanner(System.in);

    public void log(String title ,String desc, boolean success){
        Log log = new Log();
        log.setId(IDUtil.getId());
        log.setTitle(title);
        log.setDescription(desc);
        log.setSuccess(success);
        log.setDate(new Date());
        logs.add(log);
    }

    public SystemManageCashier(List<Cashier> cashiers, List<Log> logs) {
        this.cashiers = cashiers;
        this.logs = logs;
    }
    public void addCashier(){
        System.out.println("账号：");
        String account = sc.next();
        for (Cashier c : cashiers) {
            if(c.getAccount().equals(account)){
                log("添加收银员","账号重复",false);
                System.out.println("已存在");
                return;
            }
        }
        //验证年龄
        System.out.println("密码：");
        String pwd = sc.next();
        System.out.println("姓名：");
        String name = sc.next();
        System.out.println("性别:");
        char sex = sc.next().charAt(0);
        System.out.println("年龄");
        String ageStr = sc.next();
        if(!ValidateUtil.checkAge(ageStr)){
            log("添加收银员","年龄非法",false);
            return;
        }

        //验证手机号
        System.out.println("请输入手机号");
        String phoneNumber = sc.next();
        if(!ValidateUtil.checkPhone(phoneNumber)){
            log("添加收银员","手机号非法",false);
            return;
        }

        int age = Integer.parseInt(ageStr);
        System.out.println("地址：");
        String address = sc.next();
        Cashier c = new Cashier();
        c.setId(IDUtil.getId());
        c.setAccount(account);
        c.setPassword(pwd);
        c.setName(name);
        c.setSex(sex);
        c.setAccount(ageStr);
        c.setPhoneNumber(phoneNumber);
        c.setAddress(address);
        cashiers.add(c);
        log("添加收银员","成功",true);
        System.out.println("添加成功");

    }
    public void showCashier(){
        System.out.println("----收银员-----");
        for (Cashier c : cashiers) {
            System.out.println(c.getId()+" "+c.getAccount()+" "+c.getName());
        }
        log("查看收银员","成功",true);
    }

    public void delCashier(){
        System.out.println("ID: ");
        String id = sc.next();
        boolean b = cashiers.removeIf(c -> c.getId().equals(id));
        log("删除收银员",b?"成功":"失败",b);
        System.out.println(b?"成功":"不存在");
    }

    public void showLog(){
        System.out.println("------日志------");
        for (Log log : logs) {
            System.out.println(log.getId()+" "+DateUtil.format(log.getDate())+" "+log.getTitle()+" "+log.getDescription()+" "+(log.isSuccess()?"成功":"失败"));
        }
    }

}
