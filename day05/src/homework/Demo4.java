package homework;

public class Demo4 {
    public static void main(String[] args) {
        for (int x = 2; x < 100; x++) {
            boolean b = true;
            for(int i = 2; i<x;i++){
                if(x%i == 0){
                    b =false;
                    break;
                }
            }
            if(b){
                System.out.println(x);
            }

        }
    }
}
//统计一百以内的素数。
