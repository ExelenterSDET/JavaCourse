package Day53.Practice.Andrea.Example;

public class Strawberry extends Fruit{

    String brand;
    String owner;

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "\n {" + getClass().getSimpleName() +
                "brand='" + brand + '\'' +
                ", owner='" + owner + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
