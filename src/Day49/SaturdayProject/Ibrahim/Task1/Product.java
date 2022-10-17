package Day49.SaturdayProject.Ibrahim.Task1;

public enum Product {
    COMPUTER("Macbook", 1000.50, 1200.30),
    PHONE("Iphone", 800.4, 875.95),
    TABLET("Ipad", 250, 285.35),
    PLAYSTATION("PS4", 450.10, 500.05);

    public final String productName;
    public final double buyingPrice;
    public final double sellingPrice;

    Product(String productName, double buyingPrice, double sellingPrice) {
        this.productName = productName;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getProductName() {
        return productName;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }
}
