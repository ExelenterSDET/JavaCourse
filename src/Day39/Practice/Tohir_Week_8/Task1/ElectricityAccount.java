package Day39.Practice.Tohir_Week_8.Task1;

public class ElectricityAccount {
    double TotalWph = 0.00;
    double Rate = 0.00;
    double Bill = 0.00;
    public ElectricityAccount()
    {
        this.Rate = 0.70;
    }

    public double getTotalWph(double Wph) {

        return TotalWph += Wph;
    }

    public double calculateBill() {
        return Bill = Rate*TotalWph+0.00;
    }

    @Override
    public String toString() {
        return "ElectricityAccount{" +
                "TotalWph=" + TotalWph +
                ", Rate=" + Rate +
                ", Bill=" + Bill +
                '}';
    }
}
