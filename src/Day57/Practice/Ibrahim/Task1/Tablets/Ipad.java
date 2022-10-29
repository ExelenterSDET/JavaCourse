package Day57.Practice.Ibrahim.Task1.Tablets;

import Day57.Java.Task.Tablets.TabletModels;

public class Ipad extends Tablet{

    public Ipad(String name, double price) {
        super(name, price);
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public void setPrice(double price) {
        super.price = price;
    }

    @Override
    public double getPrice() {
        return super.price;
    }

    @Override
    public String getName() {
        return super.name;
    }

    public String getBrand() {
        return super.brand.getBrand();
    }
    @Override
    public void setMemory(int memory) {
        super.memory = memory;
    }

    @Override
    public void setBrand(TabletBrands brand) {
        super.brand = brand;
    }

    @Override
    public int getMemory() {
        return super.memory;
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "memory=" + memory +
                ", brand=" + brand +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
