package Day48.Practice.SP.cryptos;

public enum CryptoCurrency {
    BITCOIN("BTC", 19540.09),
    ETHEREUM("ETH", 1329.17);

    public String shortName;
    public double price;

    CryptoCurrency(String shortName, double price) {
        this.shortName = shortName;
        this.price = price;
    }
}
