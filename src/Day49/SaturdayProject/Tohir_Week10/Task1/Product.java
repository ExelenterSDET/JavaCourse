package Week10.Task1;

public enum Product {

    COMPUTER ("Macbook", 1000.50, 1200.30),
    PHONE("Iphone", 800.40, 875.95),
    TABLET("IPad",250, 285.35),
    PLAYSTATION("PS4", 450.10, 500.05);
    String productName;
    double buyPrice;
    double sellPrice;

    Product(String productName, double buyPrice, double sellPrice) {
        this.productName = productName;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", buyPrice=" + buyPrice +
                ", sellPrice=" + sellPrice +
                '}';
    }
}
