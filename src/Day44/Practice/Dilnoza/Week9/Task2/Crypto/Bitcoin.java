package Day44.Practice.Dilnoza.Week9.Task2.Crypto;

public class Bitcoin {
    public final String shortName= "BTC";
    private static double totalAmount;
    private static double totalValue;
    public  int transactionId;
    public  double transactionAmount;
    private static final double price = 19540.09;
    public double transactionValue;


    public Bitcoin(double transactionAmount) {
        this.transactionAmount = transactionAmount;
        transactionValue=transactionAmount*price;
        totalAmount+=transactionId;
        totalValue+=transactionAmount;

    }

     public static double getTotalAmount(){
        return totalAmount;
}

    public static double getTotalValue(){
        return totalValue;
    }


    public String toString() {
        return "Bitcoin{" +
                "transactionId=" + transactionId +
                ", transactionAmount=" + transactionAmount +
                ", price =" + price +
                ", transactionValue=" + transactionValue +
                '}';
    }
}
