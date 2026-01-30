package array;

public class Test03 {
    public static void main(String[] args) {
        int[] x = {12, 23, 34};
        int[] y = {23, 34, 45, 56};
        int[] z = new int[x.length + y.length];
        for (int i = 0; i < z.length; i++) {
            if (i < x.length) {
                {
                    z[i] = x[i];
                }
            }else {
                z[i] = y[i- x.length];
            }
        }
        for (int i : z) {
            System.out.println(i);
        }
    }
}
