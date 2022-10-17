package Day49.SaturdayProject.Mentoring.Task1;

public enum Product {

    COMPUTER("Macbook", 1000.5, 1200.3),
    PHONE("Iphone", 800.4, 875.95),
    TABLET("Ipad", 250, 285.35),
    PLAYSTATION("PS4", 450.10, 500.05);

    private final String productName;
    private final double buyPrice;
    private final double sellPrice;

    Product(String productName, double buyPrice, double sellPrice) {
        this.productName = productName;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getProductName() {
        return productName;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}
