package com.coder.supermarket;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

/**
 * @author N1357
 * @since 2026/4/10
 */
public class ProductService {
    private List<Product> products;
    private List<ProductType> types;
    private Scanner sc = new Scanner(System.in);

    public ProductService(List<Product> products, List<ProductType> types) {
        this.products = products;
        this.types = types;
    }

    public void addType() {
        System.out.println("类别ID：");
        String id = sc.next();
        for (ProductType t : types) {
            if (t.getId().equals(id)) {
                System.out.println("已存在");
                return;
            }
        }
        System.out.println("名称:");
        String name = sc.next();
        types.add(new ProductType(id, name));
        System.out.println("添加成功");
    }

    public void showType() {
        for (ProductType type : types) {
            System.out.println(type.getId() + " " + type.getName());
        }
    }

    public void addProduct() {
        System.out.println("名称:");
        String name = sc.next();
        for (Product p : products) {
            if (p.getName().equals(name)) {
                System.out.println("增加数量");
                p.setCount(p.getCount() + sc.nextInt());
                System.out.println("成功");
            }
        }
        System.out.println("价格：");
        BigDecimal price = sc.nextBigDecimal();
        System.out.println("数量:");
        int count = sc.nextInt();
        System.out.println("类别ID:");
        String typeId = sc.next();
        Product p = new Product();
        p.setId(IDUtil.getId());
        p.setName(name);
        p.setPrice(price);
        p.setCount(count);
        p.setTypeId(typeId);
        products.add(p);
        System.out.println("添加成功");
    }

    public void showProduct() {
        for (Product p : products) {
            //通过流水线找到与ID匹配的商品名字，然后打印商品信息
            String typeName = types.stream().filter(t -> t.getId().equals(p.getTypeId())).map(ProductType::getName).findFirst().orElse("未知");
            System.out.println(p.getId() + " " + p.getName() + " " + p.getPrice() + " 库存:" + p.getCount() + " 分类:" + typeName);
        }
    }

    //商品类别新增。
    public void in(){
        System.out.println("商品ID:");
        String id = sc.next();
        for (Product p : products) {
            if(p.getId().equals(id)){
                System.out.println("入库：");
                p.setCount(p.getCount()+sc.nextInt());
                System.out.println("成功");
                return;
            }

        }
    }
    public void out(){
        System.out.println("商品ID：");
        String id = sc.next();
        for (Product p : products) {
            if(p.getId().equals(id)){
                System.out.println("出库：");
                int num = sc.nextInt();
                if(p.getCount()>=num){
                    p.setCount(p.getCount()-num);
                    System.out.println("出库成功");
                }else{
                    System.out.println("库存不足");
                }
                return;

            }
        }
    }
}



