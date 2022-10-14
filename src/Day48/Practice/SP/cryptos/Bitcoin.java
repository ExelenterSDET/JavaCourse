package Day48.Practice.SP.cryptos;

public class Bitcoin {
    public static final String shortName = CryptoCurrency.BITCOIN.shortName;
    private static double totalAmount;
    private static double totalValue;
    public int transactionId;
    public double transactionAmount;
    private final double price = CryptoCurrency.BITCOIN.price;
    public double transactionValue;



    public Bitcoin(double transactionAmount) {
        this.transactionAmount = transactionAmount;
        this.transactionValue = transactionAmount * price;
        totalAmount += transactionAmount;
        totalValue += this.transactionValue;
    }

    public static double getTotalAmount() {
        return totalAmount;
    }

    public static double getTotalValue() {
        return totalValue;
    }

    @Override
    public String toString() {
        return "Bitcoin{" +
                "transactionId=" + transactionId +
                ", transactionAmount=" + transactionAmount +
                ", price=" + price +
                ", transactionValue=" + transactionValue +
                '}';
    }
}
