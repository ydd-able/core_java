package method;

public class OverLoad_Demo {
    public static void main(String[] args) {
        calc_area(5);
    }
    public static void calc_area(int r){
        System.out.println("长方形面积: "+3.14*r*r);

    }public static void calc_area(int l ,int w){
        System.out.println(l*w);
    }
    public static void calc_area(int a ,int b ,int c){
        double p = (a+b+c)/2;
        double s = Math.sqrt(p*(p-a)+p*(p-b)+p*(p-c));
    }
}
