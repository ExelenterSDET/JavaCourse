package Day9.Java;

public class Tasks {
    public static void main(String[] args) {

        String price = "$5.25";
        String qty = "5";
        // write a java program to calculate total price

        double dPrice = Double.parseDouble(price.replaceAll("[^\\d.]", ""));
        int iQty = Integer.parseInt(qty);
        System.out.println(dPrice*iQty);

         String bitcoinPrice =  "($22,938.81 United States Dollar)";
         String bitcoinQty = "0.657 BTC";
        // Calculate how much us dollar worth bitcoin you have.
        double dbBitcoinPrice = Double.parseDouble(bitcoinPrice.replaceAll("[^\\d.]", ""));
        double dbBitcoinQty = Double.parseDouble(bitcoinQty.replaceAll("[^\\d.]", ""));

        System.out.println("$"+dbBitcoinPrice*dbBitcoinQty);
    }
}
