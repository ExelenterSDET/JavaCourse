package Day57.Tohir.Task.Tablets;

public class iPad extends AbstractTablet{
    public iPad(String name, double price) {
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

    public void print(){

        System.out.println("iPad{" +
                "memory=" + memory +
                ", tabletModels=" + tabletModels +
                ", name='" + name +
                ", price=" + price);
    }

    @Override
    public String toString() {
        return "iPad{" +
                "memory=" + memory +
                ", tabletModels=" + tabletModels +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
