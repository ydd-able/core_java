package homework;

public class Demo3 {
    public static void main(String[] args) {
        for(int i = 1;i<=50;i++)
        {
            for(int j = 1;j<=50-i;j++){
                if(i+j==50&&2*i+4*j==120){
                    System.out.println("鸡:"+i);
                    System.out.println("兔"+j);

                }
            }
        }
    }
}
//鸡兔同笼问题。
