package method;
//java方法的按值传递。
//引用数据类型传递：传递的是存储的引用地址值，有一种特殊情况，字符串String，传递的是字面量值。

public class Demo6 {
    public static void main(String[] args){
        int[] x={1,2,3};
        System.out.println(x[0]);
        change1(x);
        System.out.println(x[0]);
    }
    public static void change(int x){
        x*=10;
        System.out.println("change方法"+x);
    }
    public static void change1(int[] y){
        y[0] = 100;
    }

}
//方法的重载
//参数的类型不同。
//参数的个数不同。
//参数的顺序不同。
//好处：只需要记住一个方法名。传递什么车参数就传上去就行了。

