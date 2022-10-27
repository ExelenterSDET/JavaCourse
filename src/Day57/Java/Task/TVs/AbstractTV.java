package Day57.Java.Task.TVs;

import Day57.Java.Task.Devices.AbstractDevice;
import Day57.Java.Task.Devices.Model;

public abstract class AbstractTV extends AbstractDevice implements Model {
    protected int pixels;
    protected int size;
    protected TVModels model;


    public AbstractTV(String name, double price) {
        super(name, price);
    }

    public abstract void setPixels(int pixels);

    public abstract void setSize(int size);

    public abstract void setModels(TVModels models);

    public abstract int getPixels();

    public abstract int getSize();
}
