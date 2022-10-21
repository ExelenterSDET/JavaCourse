package Day53.Java.Example;

public class Strawberry extends Fruit {
    private String brand;
    private String owner;

    public Strawberry() {
    }

    public Strawberry(String name, String color, double price, String brand, String owner) {
        super(name, color, price);
        this.brand = brand;
        this.owner = owner;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "\n" + getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", owner='" + owner + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
