package Day47.HW8;

public enum CryptoCurrency {
    BITCOIN("BTC",19960.3),
    ETHERIUM("ETH",1326.6);
    public String shortname;
    public double price;

    CryptoCurrency(String shortname, double price) {
        this.shortname = shortname;
        this.price = price;
    }
}
