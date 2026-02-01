package method;

public class Demo7 {
    public static void main(String[] args) {
        add(123,23,4);
    }
    //可变参数。0...n都可以
    //可变参数可接收可传入数组。
    //数组不可接收可变参数。
    //可变参数和数组方法不可同时出现。


    public static void add(int...x){
        for (int i : x) {
            System.out.println(i);

        }
    }

}
