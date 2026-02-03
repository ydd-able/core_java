package staticDemo;
//静态代码块>构造代码块>构造方法。
//构造代码块:在创建对象的时候被调用，每创建一次对象，都执行一次构造代码块。执行顺序，优先于构造方法执行。

public class Student {
    public Student(){
        System.out.println("构造方法");
    }
    {
        System.out.println("构造代码块");
    }
    static{
        System.out.println("静态代码块");//最优先，在类加载执行，并且只执行一次，优先于各种代码块和构造方法，最开始执行。
    }
}
