package method;

public class Demo2 {

    public static void main(String[] args) {
        int m = add(10, 8);
        System.out.println(m);
    }
    /**
     * 实现两个整数求和.
     * @param x 整数1
     * @param y 整数2
     * @return 和
     */
    public static int add(int x, int y) {
        int z = x + y;
        return z;
    }
}
