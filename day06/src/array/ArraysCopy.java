package array;

import java.util.Arrays;

public class ArraysCopy {
    public static void main(String[] args) {
        int[] x = {12,23,34,5,6,7,43,5};
        int[] y = Arrays.copyOf(x,5);
        System.out.println(Arrays.toString(y));
        int[] z = Arrays.copyOfRange(x,1,5);
        System.out.println(Arrays.toString(z));

    }
}
