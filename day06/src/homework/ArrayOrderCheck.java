package homework;

public class ArrayOrderCheck {
    public static void main(String[] args) {
        int[] x = {12,23,34,5,63};
        boolean b = true;
        boolean c = true;
        for (int i = 0; i <x.length-1 ; i++) {
            if (x[i] > x[i + 1]) {
                b = false;

            }
            if (x[i] < x[i + 1]) {
                c = false;

            }
        }
        if(b){
            System.out.println("升序");
        } else if (c) {
            System.out.println("降序");

        }else{
            System.out.println("无序");
        }
    }
}
