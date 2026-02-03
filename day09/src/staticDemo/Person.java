package staticDemo;
//类的成员变量使用static修饰。作用在所有对象上。
//实例成员变量：没有static修饰，作用在某个实例对象上。

public class Person {
    static String firstName;//
    String lastName;
    public void showName(){
        System.out.println(firstName + lastName);
    }
public static void viewName(){
    System.out.println(firstName);//不能使用实例变量，只能使用静态变量。只能直接调用静态方法。不允许出现this。
//静态方法加载时，可能还没有任何对象被创建，this 根本找不到可指向的对象内存，所以 Java 编译器直接禁止静态方法中使用 this。
}

}
