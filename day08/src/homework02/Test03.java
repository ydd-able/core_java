package homework02;

public class Test03 {
    public static void main(String[] args) {
        Student student = new Student("李白",17);
        NetAdmin admin = new NetAdmin();
        admin.setName("白居易");
        admin.check(student);

    }
}
