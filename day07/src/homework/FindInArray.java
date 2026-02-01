package homework;

public class FindInArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        int target1 = 5;
        int target2 = 2;
        System.out.println("数组是否包含"+target1+":"+containValue(arr,target1));
        System.out.println("数组是否包含"+target2+":"+containValue(arr,target2));
    }
    public static  boolean containValue(int[] arr ,int target){
        for (int i : arr) {
            if(i == target){
                return true;
            }

        }
        return false;
    }
}
