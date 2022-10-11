package Day45.saturdayProject.Task2.crypto;

public class Ethereum {
    public static final String shortName = "ETH";
    private static double totalAmount;
    private static double totalValue;
    public int transactionId;
    public double transactionAmount;
    final private double price = 1329.17;
    public double transactionValue;

    public Ethereum(double transactionAmount) {
        this.transactionAmount = transactionAmount;
        this.transactionValue = transactionAmount * price;
        totalAmount += this.transactionAmount;
        totalValue += this.transactionValue;
    }
    public static double getTotalAmount(){
        return totalAmount;
    }
    public static  double getTotalValue(){
        return totalValue;
    }

    @Override
    public String toString() {
        return "Ethereum{" +
                "transactionId=" + transactionId +
                ", transactionAmount=" + transactionAmount +
                ", price=" + price +
                ", transactionValue=" + transactionValue +
                '}';
    }
}
