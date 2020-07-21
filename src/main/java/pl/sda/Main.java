package pl.sda;

public class Main {
    public static void main(String[] args) {
        createCarsBasic();
    }

    private static void createCarsBasic(){
        Car car = new Car();
        car.setModel("Eclipse");
        car.setManufacturer("Dodge");
        car.setVin("123");
        System.out.println(car.getModelAndManufacturer());

        Car car2 = new Car();
        car2.setModel("318");
        car2.setManufacturer("BMW");
        car2.setVin("234");
        System.out.println(car2.getModelAndManufacturer());

        Car car3 = car2;
        System.out.println(car3.getModelAndManufacturer());

        System.out.println(car3);

        Car car4 = new Car();
        car4.setModel("Eclipse");
        car4.setManufacturer("Dodge");
        car4.setVin("567");

//        System.out.println("Samochody takie same: " + car3.equals(car2));

//        System.out.println("Samochody te same: " + (car3 == car2);

    }
}
