package method;

public class Demo8 {
    public static void main(String[] args) {
        checkAge(5);
    }
    public static void checkAge(int age) {
        if(age<6){
            System.out.println("不允许上学");
             return;
        }
        else {
            System.out.println("可以正常上学");

        }
    }


}
