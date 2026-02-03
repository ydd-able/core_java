package staticDemo;

public class TestPerson {
    public static void main(String[] args) {
        Person.firstName = "张";
        Person p1 = new Person();
        p1.lastName = "三";

        Person p2  = new Person();
        p2.lastName = "五";
    }
}
