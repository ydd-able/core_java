package staticDemo;

public class Teacher {
    private static int count;
    {
        count++;
    }
    public Teacher(){

    }
    public Teacher(int x){

    }
    public static void showCount(){
        System.out.println(count);
    }
}
