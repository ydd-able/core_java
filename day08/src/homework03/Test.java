package homework03;

public class Test {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        Car car = monitor.getCar();
        ChargeSystem system = new ChargeSystem();
        system.charge(car);
    }

}
