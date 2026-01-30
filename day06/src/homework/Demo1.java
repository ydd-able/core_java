package homework;

public class Demo1 {
    public static void main(String[] args) {
        int[] x = {12,23,34,5,63};
        boolean b = true;
        for (int i = 0; i <x.length ; i++) {
            if (x[i] > x[i+1]) {
                b = false;
                break;
            }

        }
        System.out.println(b?"有序":"无序");
    }
}
