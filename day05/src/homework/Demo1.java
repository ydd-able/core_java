package homework;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请录入一个数字");
        int x = scanner.nextInt();
        while(x<=1){
            System.out.println("请录入一个大于一的数字:");
            x = scanner.nextInt();
        }
        boolean b = true;
        for(int i = 2;i<x;i++){
            if(x%i==0){
                b = false;
                break;
            }
        }
        System.out.println(b?"是素数":"不是素数");
    }
}
