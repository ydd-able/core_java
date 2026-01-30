package homework;

import java.util.Arrays;

//数组去重[1,2,3,4,2,1,3,5,6,9,5]，返回出来的结果[1,2,3,4,5,6,9]。
public class Demo3 {
    public static void main(String[] args) {
        int[] x = {1,2,3,4,2,1,3,5,6,9,5};
        int sum = 0;//计数器。
        for(int i = 0;i<x.length;i++){
            for(int j = i+1;j<x.length;j++){//通过两次遍历就可以。
                if(x[i]==x[j])
                {
                    sum++;//统计出来有多少个重复的元素。
                }
            }
        }
        int[] y = new int[x.length-sum];
        int m = 0;
        for (int i = 0; i < x.length; i++) {
            boolean b = true;
            for(int j = i+1;j<x.length;j++){
                if(x[i]==x[j]){
                    b = false;
                    break;
                }
            }
            if(b){
                y[m++] = x[i];
            }
        }
        Arrays.sort(y);
        System.out.println(Arrays.toString(y));


    }
}
