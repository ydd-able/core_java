package array;

import java.util.Arrays;

public class ArraysFill {
    public static void main(String[] args) {
        int[] x = new int[5];
        Arrays.fill(x, 1,3, 100);
        System.out.println(Arrays.toString(x));

    }

}
