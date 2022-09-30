package Day38.Practice.AnthonyTasks2;

public class Car {

    String carModel;
    int carYear;
    double carPrice;

    public Car getCarDetails(String carModel, int carYear, double carPrice) {
        Car car = new Car();
        car.carModel = carModel;
        car.carYear = carYear;
        car.carPrice = carPrice < 0 ? 0 : carPrice;
        return car;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", carYear=" + carYear +
                ", carPrice=" + carPrice +
                '}';
    }
}
