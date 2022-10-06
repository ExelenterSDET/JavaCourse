package Day42.Practice.Andrea.Practice.Task1;

public class Car {

    public double price;
    public String brand;
    public String model;
    public int kmh;
    public int mph;
    private final double mphToKmhConverter = 1.609344;
    private static int counter = 0;
    public int inventoryNumber;


    private Car() {
        counter++;
        this.inventoryNumber = counter;
    }

    public Car(String brand, String model, int mph, double price) {
        this();
        this.brand = brand;
        this.model = model;
        this.mph = mph;
        this.price = price;
        mphToKmh();
    }

    private void mphToKmh (){
        this.kmh = (int)(this.mph * mphToKmhConverter);
    }

    @Override
    public String toString() {
        return "inventoryNumber= " + inventoryNumber +
                ", brand= '" + brand + '\'' +
                ", model= '" + model + '\'' +
                ", mph= " + mph +
                ", kmh= " + kmh +
                ", price= " + price;

    }

}
