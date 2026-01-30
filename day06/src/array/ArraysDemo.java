package array;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] x = {12,3,4,5,23,5,6,6342,21,23};
        Arrays.sort(x);
        String s = Arrays.toString(x);
        System.out.println(s);

    }
}
