package com.coder.homework3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * @author N1357
 * @date 2026/3/24
 * @project core_java
 */
public class Test {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择彩票类型 3D或5D");
        int t = scanner.nextInt();
        System.out.println("请输入购买数量");
        int z = scanner.nextInt();
        List<List<String>> list = getNumber(t,z);
        String time = getTime();
        String code = getNo();
        BufferedWriter writer = new BufferedWriter(new FileWriter("d:/aa/彩票.txt"));
        writer.write("购买时间"+time);
        writer.newLine();
        writer.write("流水号码:NO."+code);
        writer.newLine();
        writer.write("彩票号码:");
        writer.newLine();
        list.forEach(list1->{
            list1.stream().sorted().forEach(x->{
                try {
                    writer.write(x+"\t");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            try {
                writer.newLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        writer.close();

    }
    public static List<List<String>> getNumber(int t,int z){
        Random random = new Random();
        List<List<String>> list = new ArrayList<>(z);//多少注彩票。
        for (int i = 0; i < z; i++) {
            List<String> subList = new ArrayList<>(t);
            for (int i1 = 0; i1 < t; i1++) {
                subList.add("0"+(random.nextInt(9)+1));
            }
            list.add(subList);
        }
        return list;
    }
    public static String getTime(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));

    }
    public static String getNo(){//获取十位数字。
     long l = System.currentTimeMillis();
     return String.valueOf(l).substring(3);
    }
}
