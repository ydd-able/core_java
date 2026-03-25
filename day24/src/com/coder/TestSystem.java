package com.coder;

import java.io.*;
import java.util.Scanner;

/**
 * @author N1357
 * @date 2026/3/25
 * @project core_java
 */
public class TestSystem {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("d:/aa/hello.txt");
        System.setIn(fis);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str=br.readLine())!=null){
            System.out.println(str);
        }
        br.close();

    }
}
