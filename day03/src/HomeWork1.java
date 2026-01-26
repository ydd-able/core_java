import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入三个整数");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int min = x<y?x:y;
        min=min<z?min:z;
        System.out.println(min);

    }
}
