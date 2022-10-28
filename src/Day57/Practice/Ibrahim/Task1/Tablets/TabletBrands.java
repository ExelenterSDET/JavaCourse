package Day57.Practice.Ibrahim.Task1.Tablets;

public enum TabletBrands {
    SAMSUNG("Samsung"), APPLE("Apple"), KINDLE("Kindle");

    String brand;
    TabletBrands(String brand){
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
