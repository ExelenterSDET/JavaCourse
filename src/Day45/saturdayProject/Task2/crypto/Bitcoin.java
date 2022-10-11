package Day45.saturdayProject.Task2.crypto;

public class Bitcoin {
    public static final String shortName = "BTC";
    private static double totalAmount;
    private static double totalValue;
    public int transactionId;
    public double transactionAmount;
    final private double price = 19540.09;
    public double transactionValue;

    public Bitcoin(double transactionAmount) {
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
        return "Bitcoin{" +
                "transactionId=" + transactionId +
                ", transactionAmount=" + transactionAmount +
                ", price=" + price +
                ", transactionValue=" + transactionValue +
                '}';
    }
}
