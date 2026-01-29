package dowhile;

public class DoWhileTest2 {
    public static void main(String[] args) {
        int i = 1;
        int s = 0;
        do{
             s = s + i;
             i++;
        }while(i<=100);
        System.out.println(s);

    }
}
