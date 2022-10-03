package Day39.Practice.Ibrahim.Saturday.Task1;

public class ElectricityAccount {
    double totalWph;
    double rate = 0.7;
    double bill;


    public void calculateBill(){
        bill = totalWph * rate;
    }

    @Override
    public String toString() {
        return "{" +
                "Total Wph = " + totalWph +
                ", Rate = $" + rate +
                ", Bill = $" + bill +
                '}';
    }
}
