package Day39.Practice.Anthony.GroupProject8.Task1;

public class ElectricityAccount {

    /*
    totalWph -> watt per hour
            -- rate -> set default value to 0.7
            -- bill
     */
    static double totalWph;
    static double rate = 0.7;
    static double bill;

//    public ElectricityAccount(double totalWph, double rate, double bill) {
//        this.totalWph = totalWph;
//        this.rate = rate;
//        this.bill = bill;
//    }
//
//    public ElectricityAccount() {
//
//    }

    public static void calculateBill(){
        bill = totalWph * rate;
    }


//    @Override
//    public String toString() {
//        return "ElectricityAccount{" +
//                "totalWph=" + totalWph +
//                ", rate=" + rate +
//                ", bill=" + bill +
//                '}';
//    }

//    @Override
//    public String toString() {
//        return "ElectricityAccount{" +
//                "totalWph=" + totalWph +
//                ", rate=" + rate +
//                ", bill=" + bill +
//                '}';
//}
}
