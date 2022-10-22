package Day53.Practice.Sebahattin.Example;

public class Strawbery extends Fruit{
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
        return "Strawbery{" +
                "brand='" + brand + '\'' +
                ", owner='" + owner + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
