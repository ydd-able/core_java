package homework;

public class TaxDept {
    public void tax(Car[] car){
        int total = 0;
        for (Car car1 : car) {
            double dis = car1.getDisplacement();
            String brand = car1.getBrand();
            if(dis<=1.0) {
                System.out.println(brand + "收160");
                total += 360;
            } else if (dis<=1.6) {
                System.out.println(brand + "收420");
                total += 420;
            }  else if (dis<=2.0) {
                System.out.println(brand + "收540");
                total += 540;
            }  else if (dis<=2.5) {
                System.out.println(brand + "收800");
                total += 800;
            }  else if (dis<=3.0) {
                System.out.println(brand + "收1800");
                total += 1800;
            }  else if (dis<=4.0) {
                System.out.println(brand + "收2800");
                total += 2800;
            } else{
                System.out.println(brand+"收取3600");
                total += 3600;
            }

        }
        System.out.println("税务局一共收取"+total);
    }
}
