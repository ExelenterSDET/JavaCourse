package Day57.Practice.Ibrahim.Task1.Tvs;

import Day57.Java.Task.TVs.TVModels;
import Day57.Practice.Ibrahim.Task1.Devices.AbstractDevice;
import Day57.Practice.Ibrahim.Task1.Devices.Model;

public abstract class TV extends AbstractDevice implements Model {
    protected int pixels;
    protected int size;
    protected TvBrands brand;


    public TV(String name, double price) {
        super(name, price);
    }

    public abstract void setPixels(int pixels);

    public abstract void setSize(int size);

    public abstract void setModels(TVModels models);

    public abstract int getPixels();

    public abstract int getSize();
}
