package homework;

import java.util.Date;
import java.util.Scanner;

public class LotteryGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (true) {
            if (t == 3 || t == 5) {
                break;
            } else {
                System.out.println("录用类型错误");
                t = scanner.nextInt();
            }
        }
        int z = scanner.nextInt();
        int[][] x = lottery(t, z);
        print(x);
    }

    public static int[][] lottery(int t, int z) {
        int[][] x = new int[z][t];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = (int) (Math.random() * 10);


            }

        }
        return x;
    }
    public static void print(int[][] x){
        for (int[] ints : x) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");

            }
            System.out.println();

        }
    }
}

