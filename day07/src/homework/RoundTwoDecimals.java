package homework;

public class RoundTwoDecimals {
    public static void main(String[] args) {
        double[] x = {3.14123,123.123,3.24,12.999,7.658};
        round(x);
        for (double v : x) {
            System.out.println(v);


        }
    }

    public static void round(double[] x) {
        for (int i = 0; i < x.length; i++) {
            x[i] = keep2(x[i]);

        }

    }


public static double keep2(double v) {
    return (int) (v * 100 + 0.5) / 100D;//四舍五入。

}

}
