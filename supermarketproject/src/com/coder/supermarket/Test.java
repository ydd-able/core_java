package com.coder.supermarket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author N1357
 * @since 2026/4/10
 */
public class Test {
    public static List<Cashier> cashiers=new ArrayList<>();
    public static List<Product> products=new ArrayList<>();
    public static List<ProductType> types=new ArrayList<>();
    public static List<Order> orders=new ArrayList<>();
    public static List<Log> logs=new ArrayList<>();
    public static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {

        Object[] data = DataUtil.load();
        if(data[0]!=null) cashiers=(List<Cashier>)data[0];
        if(data[1]!=null) products=(List<Product>)data[1];
        if(data[2]!=null) types=(List<ProductType>)data[2];
        if(data[3]!=null) orders=(List<Order>)data[3];
        if(data[4]!=null) logs=(List<Log>)data[4];

        new StockThread(products).start();
        new SaleThread(orders).start();

        UserService us = new UserService();
        System.out.println("=======超市管理系统=======");
        while(!us.login()){
            System.out.println("失败，请重试");
        }
        while(true){
            System.out.println("\n1.收银员管理 2.日志管理 3.商品 4.退出");
            System.out.println("请输入您的选择");
            int choose =sc.nextInt();
            if(choose == 4){
                DataUtil.save(cashiers,products,types,orders,logs);
                System.out.println("保存退出。");
                break;
            }
            if(choose==1){
                System.out.println("---------------收银员管理模块-----------------");
                SystemManageCashier smc = new SystemManageCashier(cashiers,logs);
                while(true){
                    System.out.println("1.收银员列表 2.新增收银员 3.删除收银员 4.返回上一级");
                    System.out.println("请输入您的选择：");
                    int c = sc.nextInt();
                    if(c==4){
                        break;
                    }
                    if(c==1)smc.showCashier();
                    if(c==2)smc.addCashier();
                    if(c==3)smc.delCashier();
                }
            }
            if(choose==2){
                System.out.println("--------------日志记录----------------");
                SystemManageCashier smc = new SystemManageCashier(cashiers,logs);
                smc.showLog();
            }
            if(choose==3){
                ProductService ps = new ProductService(products,types);
                System.out.println("---------------商品管理模块----------------");
                while(true){
                    System.out.println("1.商品列表 2.新增商品 3.移除商品 4.入库 5.出库 6.返回");
                    System.out.println("清楚如您的选择");
                    int c = sc.nextInt();
                    if(c==0)break;
                    if(c==1)ps.showProduct();
                    if(c==2)ps.addProduct();
                    if(c==3)ps.in();
                    if(c==4)ps.out();
                    if(c==5){
                        while(true){
                            System.out.println("1.列表 2.新增 0.返回");
                            int cc=sc.nextInt();
                            if(cc==0)break;
                            if(cc==1)ps.showType();
                            if(cc==2)ps.addType();
                        }
                    }

                }

            }

        }
    }
}
