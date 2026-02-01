package method;

public class Demo1 {
    public static void main(String[] args) {
        //方法实现对相同代码的复用。
        //[访问修饰符]<返回值类型><方法名>([参数列表])[异常列表]
        //使用中括号[]包括的部分是可选项，使用尖角号<>包括的的部分是必填项目。
        attack("炮车");//调用时传参即可,参数类型要匹配上。
    }

    public static void attack(String type) {
        System.out.println(type + "攻击防御塔");


    }
}
