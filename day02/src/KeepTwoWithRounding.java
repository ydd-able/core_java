import java.util.Scanner;

public class KeepTwoWithRounding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个小数:");
        double d =sc.nextDouble();
        double result = Math.round(d*100)/100.0;
        System.out.printf("结果:%.2f",result);

    }
}
