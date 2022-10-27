package Day57.Java.Task.Tablets;

public class Ipad extends AbstractTablet{
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

    @Override
    public String getModel() {
        return super.model.getModel();
    }

    @Override
    public void setMemory(int memory) {
        super.memory = memory;
    }

    @Override
    public void setModels(TabletModels model) {
        super.model = model;
    }

    @Override
    public int getMemory() {
        return super.memory;
    }

    @Override
    public String toString() {
        return "Ipad{" +
                "memory=" + memory +
                ", model=" + model +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
