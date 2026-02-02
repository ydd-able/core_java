package homework03;

import java.util.Scanner;

public class Monitor {
    public Car getCar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请扫描车牌号码");
        String num = scanner.next();
        System.out.println("车辆类型");
        String type = scanner.next();
        System.out.println("驶入时间");
        int inHour = scanner.nextInt();
        int inMinute = scanner.nextInt();
        System.out.println("驶出时间");
        int outHour = scanner.nextInt();
        int outMinute = scanner.nextInt();
        return new Car(type, inHour,inMinute,outHour, outMinute, num);

    }
}
