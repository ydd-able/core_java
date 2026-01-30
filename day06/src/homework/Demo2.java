package homework;

import java.util.Arrays;

//题目：根据双色球摇奖规则，产生6个红球，一个蓝球；红球范围1-33，蓝球范围1-16。红球不能有重复产生。
public class Demo2 {
    public static void main(String[] args) {
        int[] red = new int[6];

        for (int i = 0; i < red.length; i++) {
            while (true) {
                int x = (int) (Math.random() * 33) + 1;
                boolean b = false;
                for (int r : red) {
                    if (r == x) {
                        b = true;
                        break;
                    }
                }
                if (!b) {
                    red[i] = x;
                    break;
                }
            }
            //red[i] = (int) (Math.random() * 33) + 1;//这种情况，红球会出现重复值。改进思路：生成随机数和数组元素做比对，如果不同，就放入。
        }
        Arrays.sort(red);
        System.out.println("红球:");
        System.out.println(Arrays.toString(red));
        int blue = (int) (Math.random() * 16) + 1;
        System.out.println("蓝球:");
        System.out.println(blue);//

    }
}
