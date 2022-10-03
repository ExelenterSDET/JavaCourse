package Day39.Practice.Sebahattin.Homework.Task1;

public class ElectricityAccount {
    int totalWph;
    double rate = 0.7;
    double bill;

    double calculateBill(int newWph){
       this.bill = this.rate * newWph;
        return this.bill;
    }

    @Override
    public String toString() {
        return "Account{" +
                "totalWp =" + totalWph +
                ", rate =" + rate +
                ", bill $=" + bill +
                '}';
    }
}
