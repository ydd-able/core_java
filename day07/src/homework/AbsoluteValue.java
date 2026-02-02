package homework;

public class AbsoluteValue {
    public static void main(String[] args) {
        System.out.println(abs(-3));
    }
    public static int abs(int x){
        long temp = x;
        if(x>0){
            return x;
        }else {
            return (int)temp;
        }
    }
}
