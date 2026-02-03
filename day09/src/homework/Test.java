package homework;

public class Test {
    public static void main(String[] args) {
        Volkswagen volkswagen = new Volkswagen();
        Car[] cars = volkswagen.organise();
        TaxDept taxDept = new TaxDept();
        taxDept.tax(cars);
    }
}
