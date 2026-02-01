package method;

public class Demo5 {
    public static void main(String[] args) {
        //完成求整数a的b次方；
        System.out.println(pow(5,3));
        System.out.println(ceil(-3.5));
        int[] x = {1,2,3,4,5,6,7};
        System.out.println(sum(x));
    }
    public static int pow(int a ,int b){
        int sum = 1;
        for(int i = 1;i<=b;i++){
            sum*= a;
        }
        return sum;
    }
    public static int ceil(double d){

        if(d>0){
            int x = (int)d;
            if(x==d){
                return x;
            }else {
                return x + 1;
            }

        }else {
            return (int)d;
        }
    }
    //求一组数字的和
    public static int sum(int[] x){
        int s = 0;//累加
        for (int i : x) {
            s+=i;
        }
        return s;
    }

}
