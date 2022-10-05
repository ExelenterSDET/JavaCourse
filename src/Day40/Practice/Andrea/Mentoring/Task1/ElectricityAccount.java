package Day40.Practice.Andrea.Mentoring.Task1;

public class ElectricityAccount {

    double totalWph;
    double rate = 0.7;
    double bill;

    public double calculateBill(){
        return bill = totalWph * rate;
    }

    @Override
    public String toString() {
        return "ElectricityAccount{" +
                "totalWph=" + totalWph +
                ", rate=" + rate +
                ", bill=" + bill +
                '}';
    }
}
