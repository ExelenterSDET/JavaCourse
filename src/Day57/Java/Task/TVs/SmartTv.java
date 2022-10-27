package Day57.Java.Task.TVs;

public class SmartTv extends AbstractTV{
    public SmartTv(String name, double price) {
        super(name, price);
    }

    @Override
    public void setName(String name) {
        super.name= name;
    }

    @Override
    public void setPrice(double price) {
        super.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getModel() {
        return model.getModelName();
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
    public void setModels(TVModels model) {
        super.model = model;
    }

    @Override
    public int getPixels() {
        return pixels;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "SmartTv{" +
                "pixels=" + pixels +
                ", size=" + size +
                ", model=" + model +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
