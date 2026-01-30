package homework;

import java.util.Arrays;

//数组去重[1,2,3,4,2,1,3,5,6,9,5]，返回出来的结果[1,2,3,4,5,6,9]。
public class ArrayDeduplication {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 2, 1, 3, 5, 6, 9, 5, 1, 1, 1,5};
        int sum = 0;//计数器。
        boolean[] isrepeat = new boolean[x.length];
        for (int i = 0; i < x.length - 1; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (isrepeat[i]) {
                    continue;
                }
                if (x[i] == x[j]) {
                    isrepeat[i] = true;
                }
            }
        }
        for (boolean repeat : isrepeat) {
            if (repeat) {
                sum++;
            }

        }//对重复元素求和。
        int[] y = new int[x.length - sum];
        int m = 0;
        for (int i = 0; i < x.length; i++) {
            if (!isrepeat[i]) {
              y[m++] = x[i];
            }

        }
        Arrays.sort(y);
        System.out.println(Arrays.toString(y));


    }
}
