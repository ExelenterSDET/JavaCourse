package Day39.Practice.Arthur39Package.Saturday;

public class ElectricityAccount {
    int totalWph;
    double rate;
    double bill;

    public double calculateBill(){
        double bl = 0.0;
        bl = this.totalWph*this.rate;
        return bl;
    }
}

