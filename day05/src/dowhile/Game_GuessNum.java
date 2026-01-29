package dowhile;

import java.util.Scanner;

public class Game_GuessNum {
    public static void main(String[] args) {
        int p = (int)(Math.random()*100)+1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请录入价格");
        int u = scanner.nextInt();
        int s = 1;

        do{
            if(p>u){
                System.out.println("猜小了");

            } else if (p<u) {
                System.out.println("猜大了");


            } else  {

                System.out.println("猜对了");
                break;

            }
            System.out.println("请重新猜一个价格");
            u = scanner.nextInt();
            s++;
        }while(true);
        if(s<=3){
            System.out.println("天才");
        } else if (s<=7) {
            System.out.println("正常");

        }else{
            System.out.println("笨蛋");

        }
    }
}
