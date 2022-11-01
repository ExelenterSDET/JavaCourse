package Day57.Tohir.Task.Tablets;

public class Samsung extends AbstractTablet {
    public Samsung(String name, double price) {
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
        return super.tabletModels.getModelName();
    }

    @Override
    public void setMemory(int memory) {
        super.memory = memory;
    }

    @Override
    public void setTabletModels(TabletModels tabletModels) {
        super.tabletModels = tabletModels;
    }

    @Override
    public int getMemory() {
        return super.memory;
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "memory=" + memory +
                ", tabletModels=" + tabletModels +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
