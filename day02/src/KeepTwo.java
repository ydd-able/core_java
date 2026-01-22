import java.util.Scanner;

public class KeepTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("保留两位小数");
        System.out.print("请输入一个小数");
        double d = sc.nextDouble();
        double result = (int) (d * 100) / 100.0;
        System.out.printf("结果是：%.2f\n", result);
    }
}
