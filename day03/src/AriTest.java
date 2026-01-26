public class AriTest {
    public static void main(String[] args) {
       /* int i = 10;
        i++;
        System.out.println(i);
        i--;
        System.out.println(i);*/
        int i=10;//10
        int j=i++;//j=10;i=11;
        int m=i+++j;//m=21,i=12,j=10
        int n=j--+m;//n=31,m=21,j=9
        System.out.println(i);
        System.out.println(j);
        System.out.println(m);
        System.out.println(n);

    }
}
