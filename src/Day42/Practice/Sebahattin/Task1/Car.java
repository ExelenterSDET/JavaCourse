package Day42.Practice.Sebahattin.Task1;

public class Car {
    public int inventoryNumber;
    public String brand;
    public String model;
    public int mph;
    public int kmh;
    public double price;
    private final double mphToKmhConverter = 1.609344;
    private static int counter = 0;

    private Car() {
        counter ++;
        this.inventoryNumber = counter;
    }

    public Car(String brand, String model, int mph, double price) {
        this();
        this.price = price;
        this.brand = brand;
        this.model = model;
        this.mph = mph;
        convertMphToKmh();
    }
    private void convertMphToKmh(){
        this.kmh = (int) (this.mph * mphToKmhConverter);
    }

    @Override
    public String toString() {
        return "Car{" +
                "inventoryNumber=" + inventoryNumber +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", mph=" + mph +
                ", kmh=" + kmh +
                ", price=" + price +
                '}';
    }
}

