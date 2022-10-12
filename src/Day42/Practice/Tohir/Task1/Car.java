package Day42.Practice.Tohir.Task1;

public class Car {
    public int Inventory;

    public  String Brand;
    public String Model;
    public int MpH;
    public double KpH;
    public int Price;



    private final double MpHtoKpH = 1.61;
    private static int Counter = 0;
    private Car()
    {
        Counter++;
        Inventory = Counter;

    }

    public Car(int price, String brand, String model, int mpH) {
        this();
        Price = price;
        Brand = brand;
        Model = model;
        MpH = mpH;
        this.ConvertMpHtoKpH();
    }

    public void ConvertMpHtoKpH() {
       KpH = MpH*MpHtoKpH;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Inventory=" + Inventory +
                ", Brand='" + Brand + '\'' +
                ", Model='" + Model + '\'' +
                ", MpH=" + MpH +
                ", KpH=" + KpH +
                ", Price=" + Price +
                ", MpHtoKpH=" + MpHtoKpH +
                '}';
    }
}
