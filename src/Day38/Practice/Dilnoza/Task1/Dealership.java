package Day38.Practice.Dilnoza.Task1;

public class Dealership {

    public static void main(String[] args) {

        Car car = new Car();
        Car car1=  car.setCarAttributes("Toyota","Highlander",2020,35500.50);
        Car car2= car.setCarAttributes("mercedes","SUV",2021,32200.10);
        System.out.println("car1 = " + car1);
        System.out.println("car2 = " + car2);



    }


}
