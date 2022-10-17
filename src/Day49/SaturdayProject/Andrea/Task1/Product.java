package Day49.SaturdayProject.Andrea.Task1;

public enum Product {

    COMPUTER("Macbook", 1000.50, 1200.30),
    PHONE( "Iphone", 800.40, 875.95),
    TABLET("Ipad", 250, 285.35),
    PLAYSTATION("PS4", 450.10, 500.05);

    final String nameOfProduct;
    final double buyPrice;
    final double sellPrice;

    Product(String name, double buyPrice, double sellPrice){
        this.nameOfProduct = name;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameOfProduct='" + nameOfProduct + '\'' +
                ", buyPrice=" + buyPrice +
                ", sellPrice=" + sellPrice +
                '}';
    }


}
