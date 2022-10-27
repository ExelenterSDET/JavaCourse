package Day57.Practice.Sebahattin.Task.TVs;

public class HdTv extends AbstractTV{
    public HdTv(String name, double price) {
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
    public void setPixels(int pixels) {

    }

    @Override
    public void setSize(int size) {

    }

    @Override
    public void setModels(TVModels models) {

    }

    @Override
    public int getPixels() {
        return 0;
    }

    @Override
    public int getSize() {
        return 0;
    }
}
