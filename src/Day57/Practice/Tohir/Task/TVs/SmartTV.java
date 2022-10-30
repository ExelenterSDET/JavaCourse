package Day57.Tohir.Task.TVs;

public class SmartTV extends AbstractTV {
    public SmartTV(String name, double price) {
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
        return super.tvModels.getModelName();
    }

    @Override
    public void setPixels(int pixels) {
        super.pixels = pixels;
    }

    @Override
    public void setSize(int size) {
        super.size = size;
    }

    @Override
    public void setTvModels(TVModels tvModels) {
        super.tvModels = tvModels;
    }

    @Override
    public int getPixels() {
        return super.pixels;
    }

    @Override
    public int getSize() {
        return super.size;
    }

    @Override
    public String toString() {
        return "SmartTV{" +
                "pixels=" + pixels +
                ", size=" + size +
                ", tvModels=" + tvModels +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
