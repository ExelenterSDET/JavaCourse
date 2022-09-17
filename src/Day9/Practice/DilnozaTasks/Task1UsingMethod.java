package Day9.Practice.DilnozaTasks;

public class Task1UsingMethod {
    /*

        // write a java program to calculate total price
     */
    public static void main(String[] args) {
        Task1UsingMethod t1 = new Task1UsingMethod();
        String price = "$5.25";
        String qty = "5";
        double total = t1.getTotal(price, qty);
        System.out.println("total = " + total);


    }
    double getTotal(String price, String qty){
        return Double.parseDouble(price.replaceAll("[^\\d.]",""))*Double.parseDouble(qty);
    }

}
