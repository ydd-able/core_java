package staticDemo;

public class TestCount {
    public static void main(String[] args) {
        new Teacher();
        new Teacher();
        new Teacher();
        new Teacher();
        new Teacher(10);
        Teacher.showCount();
    }
}
