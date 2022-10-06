package Day42.Practice.Ibrahim;

public class Car {


    public int inventoryNumber;
    public String brand;
    public String model;
    public int mph;
    public int kmh;
    public double price;

    private final double mphToKmh = 1.60934;
    private static int counter = 0;

    private Car() {
        counter++;
    }

    public Car(String brand, String model, int mph, double price) {
        this();
        this.price = price;
        this.brand = brand;
        this.model = model;
        this.mph = mph;
        inventoryNumber = counter;
        getMphToKmh();
    }

    private void getMphToKmh(){
        kmh = (int) (mph * mphToKmh);
    }

    @Override
    public String toString() {
        return "Car{" +
                "inventoryNumber=" + inventoryNumber +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", mph=" + mph +
                ", kmh=" + kmh +
                ", price= $" + price +
                "}\n";
    }

}
