package array;

import java.sql.SQLOutput;
import java.util.Arrays;

public class  Array_Two_Dimensionial {
    public static void main(String[] args) {
       /* int[][] a;//声明。
        int b[][];//声明。
        int []c[];//声明。三个都是静态创建。*/

        //动态创建。
        int[][] d= new int[3][];
        int[] arr0 = {12,23};
        int[] arr1 = {21,23,45};
        int[] arr2 = {32,34,5,6};
        d[0] = arr0;
        d[1] = arr1;
        d[2] = arr2;
        for(int i = 0;i<d.length;i++){
            for(int j = 0;j<d[i].length;j++){
                System.out.print(d[i][j]+"\t");

            }
            System.out.println();
        }
        //forEach增强循环处理
        for(int[] a:d){
            for(int x :a){
                System.out.print(x+"\t");
            }
            System.out.println();
        }


    }
}
