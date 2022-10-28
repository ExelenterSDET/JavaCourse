package Day57.Practice.Andrea.Practice.Task.Tablets;

public class Samsung extends AbstractTablet{

    public Samsung(String name, double price) {
        super(name, price);
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void setPrice(double price) {

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
    public TabletModels getModel() {
        return super.models;
    }

    @Override
    public void setMemory(int memory) {

    }

    @Override
    public void setModels(TabletModels models) {

    }

    @Override
    public int getMemory() {
        return 0;
    }
}
