package Day44.SaturdayProject.Sebahattin.Task2.Crypto;

    public class Ethereum {
        public final String shortname;
        private static double totalAmount;
        private static double totalValue;
        public int transactionId;
        public double transactionAmount;
        private final double price = 1329.17;
        public double transactionValue;

    public Ethereum(double transactionAmount){
        this.transactionAmount = transactionAmount;
        this.transactionValue = (transactionAmount * this.price);
        totalAmount += totalAmount;
        totalValue += totalValue;
        transactionId++;
        shortname = "ETH";
    }

        public static double getTotalAmount() {
            return totalAmount;
        }

        public static double getTotalValue() {
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
