import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个整数");
        int num=sc.nextInt();
        int bai=num/100;
        int shi=num/10%10;
        int ge=num%10;
        int reversenum=ge*100 + shi*10 + bai;
        System.out.println("反转之后的结果是："+reversenum);

    }
}
