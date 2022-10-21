package Day53.Java.Example;

public class Banana extends Fruit{
    private String storeAddress;

    public Banana() {
    }

    public Banana(String name, String color, double price, String storeAddress) {
        super(name, color, price);
        this.storeAddress = storeAddress;
    }

    public Banana(String name, String color) {
        super(name, color);
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    @Override
    public String toString() {
        return "\n" + getClass().getSimpleName() +"{" +
                "storeAddress='" + storeAddress + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
