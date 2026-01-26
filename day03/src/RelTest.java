import java.util.Scanner;

public class RelTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个数字比较");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        boolean b = x > y;
        System.out.println("x是不是大于y" + b);

    }
}
//短路与运算；a&&b，如果左侧表达式为false,则右侧不运算，直接返回false。
//如果左侧表达式为true,则右侧再运算。

//短路或运算 A&&B: 如果左侧表达式为true，则右侧不运算，直接返回结果为true，
//如果左侧表达式为false，则右侧再运算。
//异或：相同就是假，不同就是真。

