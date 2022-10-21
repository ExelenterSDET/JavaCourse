package Day53.Practice.Dilnoza.Task1;

public class Strawberry extends Fruit{

   private String brand;
   private String owner;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Strawberry{" +
                "brand='" + brand + '\'' +
                ", owner='" + owner + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}

