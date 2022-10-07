package Day42.Practice.Anthony.Task1;

public class Car {
    public int inventoryNumber;
    public String brand;
    public String model;
    public int kmh;
    public int mph;
    public double price;
    private final double mphToKmhConverter = 1.609344;
    private static int counter = 0;



    Car() {
        counter++;
        this.inventoryNumber = counter; // need to double check this counter
    }

    public Car( String brand, String model, int mph, double price) {
        this();
        this.price = price;
        this.brand = brand;
        this.model = model;
        this.mph = mph;
        convertMphToKmp();// can type this.
    }

    private void convertMphToKmp() {

        this.kmh = (int) (this.mph * mphToKmhConverter) ;
    }

    @Override
    public String toString() {
        return "Car{" +
                "inventoryNumber= " + inventoryNumber+
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", kmh=" + kmh +
                ", mph=" + mph +
                ", price=" + price +
                '}';
    }
}




