package Day39.Practice.SaturdayProject8Andrea.Task1;

public class ElectricityAccount {
// *********not finished***********
    double totalWph;
    double rate;  //set default value to 0.7
    double bill;

    public double calculateBill(Customer customer){
        this.bill = this.rate * this.totalWph;
        return bill;
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


//       -   Create a class called ElectricityAccount with following attributes:
//        -- totalWph -> watt per hour
//        -- rate -> set default value to 0.7
//        -- bill
//        -	Create a method in ElectricityAccount class, named 'calculateBill' that calculates bill as bill = rate * totalWph
//        and returns bill as a double value.