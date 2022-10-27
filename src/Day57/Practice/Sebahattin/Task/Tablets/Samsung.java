package Day57.Practice.Sebahattin.Task.Tablets;

public class Samsung extends AbstractTablet{
    public Samsung(String name, double price) {
        super(name, price);
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void setPrice(double price) {

    }

    @Override
    public String getModel() {
        return null;
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
