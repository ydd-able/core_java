package array;

import java.util.Arrays;
//二分查找数组必须经过排序处理。如果找不到，返回的是负值。
public class ArraysBinarySearch {
    public static void main(String[] args) {
        int[] x = {12,23,34,45,56,7,8};
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));
        int i = Arrays.binarySearch(x,34);//查找34,返回下标。
        System.out.println(i);

    }
}
