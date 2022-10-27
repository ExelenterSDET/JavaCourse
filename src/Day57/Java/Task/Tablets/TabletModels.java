package Day57.Java.Task.Tablets;

public enum TabletModels {
    SAMSUNG("Samsung"), APPLE("Apple"), KINDLE("Kindle");

    String model;
    TabletModels(String model){
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
