package Day53.Practice.Ibrahim.Inheritance;

public class Strawberry extends  Fruit{
    String brand;
    String owner;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "\n " + getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", owner='" + owner + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
