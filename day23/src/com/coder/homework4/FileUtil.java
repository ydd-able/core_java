package com.coder.homework4;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author N1357
 * @date 2026/3/24
 * @project core_java
 */
public class FileUtil {
    public static void write(List<String> names,String fileName) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        for (String name : names) {
            writer.write(name);
            writer.newLine();
        }
        writer.close();
    }
    public static List<String> read(String fileName) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String name;
        while((name=bufferedReader.readLine())!=null){
            list.add(name);
        }
        bufferedReader.close();
        return list;
    }
    public static List<String> getNameFromKey(){
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.println("请录入人员姓名，直到'完成'结束");
        while(true){
            String name = scanner.next();
            if("完成".equals(name)){
                break;
            }
            list.add(name);
        }
        return list;
    }
    public static String getFileName(String dir,String suffix){
        String x = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy年MM"));
        return dir+x+"_"+suffix+".txt";
    }
}
