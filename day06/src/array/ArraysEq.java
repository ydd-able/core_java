package array;

import java.util.Arrays;

public class ArraysEq {
    public static void main(String[] args) {
        int[] x = {12,23,34,45,56,67};
        int[] y = Arrays.copyOf(x,x.length);
        //比较两个数组的值是否相同。
        boolean b = Arrays.equals(x,y);
        System.out.println(b);
        int i = Arrays.compare(x,y);//将数组元素按照字典序进行比较。若相同：返回0；不同：返回负数。如果前面的比后面的大，则返回正数。
        System.out.println("i="+i);





    }
}
