package method;

public class Demo3 {
    public static void main(String[] args) {
        System.out.println("欢迎来到王者荣耀");
        System.out.println("开始攻击防御塔");
        attack_tower();
        System.out.println("Victory");
        //方法之间不可以互相调用。
    }
    public static void attack_tower(){
        product();
        move();
        attack();
    }

    public static void  product(){
        System.out.println("叮叮叮");
        System.out.println("生产小兵");

    }
    public static void move(){
        System.out.println("当当当");
        System.out.println("小兵向前走");


    }
    public static void attack(){
        System.out.println("嗖嗖嗖");
        System.out.println("小兵打防御塔");
    }
}


