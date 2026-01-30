package array;

import java.util.Scanner;

public class ScoreArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生人数:");
        int len = scanner.nextInt();
        int[] scores = new int[len];
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请录入第"+(i+1)+"个分数");
            scores[i] = scanner.nextInt();
        }
        for (int score : scores) {
            System.out.println(score);
        }
        //统计总成绩和平均成绩。
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        System.out.println("总成绩"+sum);
        System.out.println("平均成绩"+sum*1.0/scores.length);
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if(scores[i]>max){
                max = scores[i];
            }

        }
        System.out.println("最高分是"+max);

    }
}
