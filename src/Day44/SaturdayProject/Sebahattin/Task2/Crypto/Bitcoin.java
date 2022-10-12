package Day44.SaturdayProject.Sebahattin.Task2.Crypto;

    public class Bitcoin {
        public final String shortname;
        private static double totalAmount;
        private static double totalValue;
        public int transactionId;
        public double transactionAmount;
        private final double price = 19540.09;
        public double transactionValue;

    public Bitcoin(double transactionAmount){
        this.transactionAmount = transactionAmount;
        this.transactionValue = (transactionAmount * this.price);
        totalAmount += totalAmount;
        totalValue += totalValue;
        transactionId++;
        shortname = "BTC";
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
