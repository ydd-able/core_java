package homework;

public class AbsoluteValue {
    public static void main(String[] args) {
        System.out.println(abs(Integer.MIN_VALUE));
    }
    public static long abs(int x){
        long temp = x;
        if(temp<0){
            temp = -temp;
        }
        return temp;
    }
}
